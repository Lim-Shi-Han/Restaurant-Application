package manager;
import java.util.*;
import java.time.*;
import entity.Reservation;
import database.Membership;
import database.TableList;
import database.ReservationList;

public class ReservationManager {
    
    public static void reservationCreate(int numberOfPeople, LocalDate reservationDate, LocalTime reservationTime, String customerName, int customerPhoneNumber){
        
        boolean isMember = checkMembership(customerPhoneNumber);   

        int tableNumber = checkAvailability(numberOfPeople, reservationDate, reservationTime);

        if(tableNumber == -1){
            System.out.println("No tables are available for your group at your specified time!");
            return;
        }

        //generate reservationID (stores tableNumber to easily extract it in the future from reservationID)
        String reservationID = String.valueOf(tableNumber) + " " + reservationDate.toString() + reservationTime.toString() + String.valueOf(customerPhoneNumber);
        
        //add new reservation to table and update reservationList
        Reservation newReservation = new Reservation(numberOfPeople, reservationDate, reservationTime, customerName, customerPhoneNumber, isMember, reservationID);
        TableManager.addReservationToTable(tableNumber, newReservation);
        addReservationToReservationList(newReservation);
        System.out.println("You have a table on " + reservationDate + " at " + reservationTime);
    }

    public static void reservationCheck(String reservationID){
        ReservationList reservationList = (ReservationList) DatabaseManager.fileRead("reservation.bin");
        for(int i = 0; i < reservationList.getReservationArray().size(); i++){
            if(reservationList.getReservationArray().get(i).getReservationID().contains(reservationID)){
                    //find table number from reservationID
                    System.out.println("The reservation has been found!");
                    return;
            }
        }
        System.out.println("No such reservation found in the database!");
    }

    public static Reservation reservationRemove(String reservationID){
        
        ReservationList reservationList = (ReservationList) DatabaseManager.fileRead("reservation.bin");
        TableList tableList = (TableList) DatabaseManager.fileRead("table.bin");
        Reservation removedReservation = new Reservation();
        int tableNumber = -1;
        int found = 0;
        String fullReservationID = null;

        //look for matching reservationID in reservationList
        for(int i = 0; i < reservationList.getReservationArray().size(); i++){
            if(reservationList.getReservationArray().get(i).getReservationID().contains(reservationID)){
                    //find table number from reservationID
                    fullReservationID = reservationList.getReservationArray().get(i).getReservationID();
                    tableNumber = getTableNumberFromReservationID(fullReservationID);
                    removedReservation = reservationList.getReservationArray().remove(i);
            }
        }

        //look for matching reservationID in the table
        if(tableNumber != 1){
            for(int i = 0; i < tableList.getTableList().get(tableNumber).getReservationArray().size(); i++){
                if(tableList.getTableList().get(tableNumber).getReservationArray().get(i).getReservationID().equals(fullReservationID)){
                    tableList.getTableList().get(tableNumber).getReservationArray().remove(i);
                    found++;
                    break;
                }
            }
        }

        //if matching reservationID not found in either reservationList or table
        if (found != 1){
            System.out.println("No such reservation found in the database!");
            return null;
        }

        //if matching reservationID found in both reservationList and table
        DatabaseManager.fileWrite(reservationList, "reservation.bin");
        DatabaseManager.fileWrite(tableList, "table.bin");
        System.out.println(fullReservationID + " has been removed!");
        return removedReservation;
    }

    public static void reservationArrive(String reservationID){
        //attempt to remove reservation

        Reservation removedReservation = reservationRemove(reservationID);

        //"No such reservation found in the database!" already printed from reservationRemove method if reservation not found
        if(removedReservation == null)return;
        
        //if reservation was found and removed successfully
        //check if customer is member
        boolean isMember = removedReservation.getIsMember();
        //get table number
        String fullReservationID = removedReservation.getReservationID();
        int tableNumber = getTableNumberFromReservationID(fullReservationID);

        //update attributes of table
        TableList tableList = (TableList) DatabaseManager.fileRead("table.bin");
        tableList.getTableList().get(tableNumber).setIsMember(isMember);
        tableList.getTableList().get(tableNumber).setIsOccupied(true);
        tableList.getTableList().get(tableNumber).setPhoneNumber(removedReservation.getCustomerPhoneNumber());
        DatabaseManager.fileWrite(tableList, "table.bin");
        System.out.println("Guest reserved at table " + tableNumber + " has arrived!");
    }

    public static void tableLeave(int tableNumber){
        TableList tableList = (TableList) DatabaseManager.fileRead("table.bin");
        if(tableList.getTableList().get(tableNumber).getIsOccupied()){
            System.out.println("Setting table " + tableNumber + " to not occupied...");
        }
        else{
            System.out.println("Table " + tableNumber + "is not occupied!");
        }
        tableList.getTableList().get(tableNumber).setIsOccupied(false);
        DatabaseManager.fileWrite(tableList, "table.bin");
    }

    public static void walkInReservation(int numberOfPeople, int customerPhoneNumber){

        TableList tableList = (TableList) DatabaseManager.fileRead("table.bin");

        int tableNumber = -1;

        LocalDate now = LocalDate.now();
        LocalTime nowTime = LocalTime.now();

        for(int i = 0; i < tableList.getTableList().size(); i++){
            //find tables with large enough capacity
            if(numberOfPeople <= tableList.getTableList().get(i).getSeating() && !tableList.getTableList().get(i).getIsOccupied()){
                int available = 1;
                ArrayList<Reservation> reservationArray = tableList.getTableList().get(i).getReservationArray();
                //check all the reservations of table
                for(int j = 0; j < reservationArray.size(); j++){
                    //check if any date clashes
                    if(reservationArray.get(j).getReservationDate().equals(now)){
                        //check if new reservation is within 90 mins of another reservation
                        if(nowTime.isAfter(reservationArray.get(j).getReservationTime().minusMinutes(90)) && nowTime.isBefore(reservationArray.get(j).getReservationTime().plusMinutes(90))){
                            //if above conditions are met, that means current reservation clashes with another reservation
                            available = 0;
                            break;
                        }
                    }
                }
                //if there are no clashes after cycling through all the reservations of a table, return tableNumber
                if(available == 1){
                    tableNumber = i;
                    break;
                }
            }
        }
        
        //if no table available
        if(tableNumber == -1){
            System.out.println("No tables are available for your group right now!");
            return;
        }

        //update attributes of table
        //check membership
        boolean isMember = checkMembership(customerPhoneNumber);

        tableList.getTableList().get(tableNumber).setIsMember(isMember);
        tableList.getTableList().get(tableNumber).setIsOccupied(true);
        tableList.getTableList().get(tableNumber).setPhoneNumber(customerPhoneNumber);
        DatabaseManager.fileWrite(tableList, "table.bin");

        System.out.println("Walk-in customer has been seated at table " + tableNumber);
    }

    public static void expireCheck(){
        ReservationList reservationList = (ReservationList) DatabaseManager.fileRead("reservation.bin");

        try{
            for (int i = 0; i <= reservationList.getReservationArray().size(); i++){
                //If the booking was for before today or for a timing that was more than half an hour ago, reservation has expired and cancel reservation
                LocalDate now = LocalDate.now();
                LocalTime nowTime = LocalTime.now();
                if(reservationList.getReservationArray().get(i).getReservationDate().isBefore(now) || (reservationList.getReservationArray().get(i).getReservationDate().isEqual(now) && reservationList.getReservationArray().get(i).getReservationTime().plusMinutes(30).isBefore(nowTime))){
                    String reservationID = reservationList.getReservationArray().get(i).getReservationID();
                    int spaceIndex = reservationID.indexOf(" ");
                    String reservationIDWithoutTableNumber = reservationID.substring(spaceIndex + 1);
                    //pass the short version of the reservationID into reservationRemove 
                    reservationRemove(reservationIDWithoutTableNumber);
                    //account for removal of reservation in array
                    i--;
                    System.out.println(reservationList.getReservationArray().size());
                }
            }
        }catch (IndexOutOfBoundsException e){
            System.out.println();
        }

        System.out.println("Check for expired reservations complete!");
    } 

    public static boolean checkMembership(int customerPhoneNumber){
        
        Membership membership = (Membership) DatabaseManager.fileRead("membership.bin");
        for(int i = 0; i < membership.getPhoneNum().size(); i++){
            if(customerPhoneNumber == membership.getPhoneNum().get(i))return true;
        }
        return false;

    }

    public static int checkAvailability(int numberOfPeople, LocalDate reservationDate, LocalTime reservationTime){

        TableList tableList = (TableList) DatabaseManager.fileRead("table.bin");
        
        //look through all the tables
        for(int i = 0; i < tableList.getTableList().size(); i++){
            //find tables with large enough capacity
            if(numberOfPeople <= tableList.getTableList().get(i).getSeating()){
                ArrayList<Reservation> reservationArray = tableList.getTableList().get(i).getReservationArray();
                int available = 1;
                //check all the reservations of table
                for(int j = 0; j < reservationArray.size(); j++){
                    //check if any date clashes
                    if(reservationArray.get(j).getReservationDate().equals(reservationDate)){
                        //check if new reservation is within 90 mins of another reservation
                        if(reservationTime.isAfter(reservationArray.get(j).getReservationTime().minusMinutes(90)) && reservationTime.isBefore(reservationArray.get(j).getReservationTime().plusMinutes(90))){
                            //if above conditions are met, that means current reservation clashes with another reservation
                            available = 0;
                            break;
                        }
                    }
                }
                //if there are no clashes after cycling through all the reservations of a table, return tableNumber
                if(available == 1){
                    return i;
                }
            }
        }
        //if no suitable tables return -1
        return -1;
    }

    public static void addReservationToReservationList(Reservation newReservation){
        ReservationList reservationList = (ReservationList) DatabaseManager.fileRead("reservation.bin");
        reservationList.getReservationArray().add(newReservation);
        DatabaseManager.fileWrite(reservationList, "reservation.bin");
    }

    public static int getTableNumberFromReservationID(String reservationID){
        int spaceIndex = reservationID.indexOf(" ");
        String tableNumberString = reservationID.substring(0, spaceIndex);
        int tableNumber = Integer.valueOf(tableNumberString);
        return tableNumber;
    }

    public static void allReservationsPrint(){
        ReservationList reservationList = (ReservationList) DatabaseManager.fileRead("reservation.bin");
        if (reservationList.getReservationArray().size() == 0){
            System.out.println("No reservations recorded!");
        }
        for(int i = 0; i < reservationList.getReservationArray().size() ; i++){
            System.out.println(reservationList.getReservationArray().get(i).getReservationID() + " " + reservationList.getReservationArray().get(i).getCustomerName());
        }
    }
    
}
