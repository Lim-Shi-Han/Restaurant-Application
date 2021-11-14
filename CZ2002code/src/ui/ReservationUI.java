package ui;
import java.util.*;
import java.time.*;
import java.time.format.DateTimeParseException;

import manager.ReservationManager;

/**
 * This class contains methods to edit reservations
 * @author Anant
 * @version 1.2
 * @since 2021-10-22
*/

public class ReservationUI{

    /**
     * This method creates a reservation by calling ReservationManager.reservationCreate
     */
    public static void createReservation(){
        try{
            Scanner sc = new Scanner(System.in);

            //Number of people
            System.out.println("How many people: ");
            int numberOfPeople = sc.nextInt();
            sc.nextLine();
            if(numberOfPeople > 10){
                System.out.println("Our tables can only accomodate a maximum of 10 people!");
                return;
            }
            if(numberOfPeople < 1){
                System.out.println("No reservation available for zero or negative number of guests!");
                return;
            }

            //Date
            System.out.println("Input reservation date in YYYY-MM-DD format:");
            LocalDate reservationDate = LocalDate.parse(sc.nextLine());
            LocalDate today = LocalDate.now();
            //Check that reservation date is within a month away
            if(reservationDate.isAfter(today.plusMonths(1))) {
                System.out.println("We only accept bookings one month in advance. You are too early!");
                return;
            }
            //Check that reservation is not made for a past date
            if(reservationDate.isBefore(today)) {
                System.out.println("You cannot pick a date before today");
                return;
            }
            
            System.out.println("Input reservation timing in HH:MM format (09:30 - 21:30):");
            LocalTime reservationTime = LocalTime.parse(sc.nextLine());
            LocalTime currentTime = LocalTime.now();
            //Check that reservation date is made within opening hours
            if(reservationTime.isBefore(LocalTime.parse("09:30")) || reservationTime.isAfter(LocalTime.parse("21:30"))) {
                System.out.println("We only accept bookings from 09:30 to 21:30!");
                return;
            }
            //Check that reservation is not made for a past date
            if(reservationDate.equals(today) && reservationTime.isBefore(currentTime)) {
                System.out.println("You cannot pick a timing before now!");
                return;
            }

            //Customer name
            System.out.println("Input customer's name:");
            String customerName = sc.nextLine();

            //Customer phone number
            System.out.println("Input customer's phone number:");
            int customerPhoneNumber = sc.nextInt();
            sc.nextLine();

            ReservationManager.reservationCreate(numberOfPeople, reservationDate, reservationTime, customerName, customerPhoneNumber);
        }catch(DateTimeParseException e){
            System.out.println("Date input is in wrong format");
        }catch(InputMismatchException e){
            System.out.println("Your input type was wrong!");
        }
    }

    /**
     * This method checks if a reservation exists
     */
    public static void checkReservation(){
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Input reservation date in YYYY-MM-DD format:");
            String date = sc.nextLine();
            System.out.println("Input reservation timing in HH:MM format (09:30 - 21:30):");
            String time = sc.nextLine();
            System.out.println("Input customer phone number:");
            int customerPhoneNumber = sc.nextInt();
            sc.nextLine();
            String customerPhoneNumberString = String.valueOf(customerPhoneNumber);
            String reservationID = date + time + customerPhoneNumberString;
            ReservationManager.reservationCheck(reservationID);
        }catch(DateTimeParseException e){
            System.out.println("Date input is in wrong format");
        }catch(InputMismatchException e){
            System.out.println("Your input type was wrong!");
        }
    }

    /**
     * This method checks if a reservation exists and then removes the reservation
     */
    public static void removeReservation(){
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Input reservation date in YYYY-MM-DD format:");
            String date = sc.nextLine();
            System.out.println("Input reservation timing in HH:MM format (09:30 - 21:30):");
            String time = sc.nextLine();
            System.out.println("Input customer phone number:");
            int customerPhoneNumber = sc.nextInt();
            sc.nextLine();
            String customerPhoneNumberString = String.valueOf(customerPhoneNumber);
            String reservationID = date + time + customerPhoneNumberString;
            ReservationManager.reservationRemove(reservationID);
        }catch(DateTimeParseException e){
            System.out.println("Date input is in wrong format");
        }catch(InputMismatchException e){
            System.out.println("Your input type was wrong!");
        }
    }

    /**
     * This method checks if the reservation exists and admits customers to table when they arrive
     */
    public static void arriveReservation(){
        try{
            Scanner sc = new Scanner(System.in);

            System.out.println("Input reservation date in YYYY-MM-DD format:");
            String date = sc.nextLine();
            System.out.println("Input reservation timing in HH:MM format (09:30 - 21:30):");
            LocalTime timeTime =  LocalTime.parse(sc.nextLine());
            String time = timeTime.toString();

            //if the date is not correct and the customer arrive more than 5 minutes early, stop the method
            if((!date.equals(LocalDate.now().toString())) && timeTime.minusMinutes(5).isAfter(LocalTime.now())){
                System.out.println("Customer can only arrive 5 minuts before booking");
                return;
            }
            System.out.println("Input customer phone number:");
            int customerPhoneNumber = sc.nextInt();
            sc.nextLine();
            String customerPhoneNumberString = String.valueOf(customerPhoneNumber);
            String reservationID = date + time + customerPhoneNumberString;
            ReservationManager.reservationArrive(reservationID);
        }catch(DateTimeParseException e){
            System.out.println("Date input is in wrong format");
        }catch(InputMismatchException e){
            System.out.println("Your input type was wrong!");
        }
    }

    /**
     * This method frees table when customers leave
     * @param tableNumber
     */
    public static void leaveTable(int tableNumber){
        ReservationManager.tableLeave(tableNumber);
    }

    /**
     * This method checks for availability of table when customer walks in
     */
    public static void walkIn(){
        try{
            Scanner sc = new Scanner(System.in);
            LocalTime now = LocalTime.now();
            LocalTime early = LocalTime.parse("09:30");
            LocalTime late = LocalTime.parse("21:30");
            if(now.isBefore(early) || now.isAfter(late)) {
                System.out.println("We only accept walk ins from 09:30 to 21:30!");
                return;
            }
            System.out.println("How many people:");
            int numberOfPeople = sc.nextInt();
            sc.nextLine();
            if(numberOfPeople > 10){
                System.out.println("Our tables can only accomodate a maximum of 10 people!");
                return;
            }
            if(numberOfPeople < 1){
                System.out.println("No reservation available for zero or negative number of guests!");
                return;
            }

            //Customer phone number
            System.out.println("Input customer's phone number:");
            int customerPhoneNumber = sc.nextInt();
            sc.nextLine();

            ReservationManager.walkInReservation(numberOfPeople, customerPhoneNumber); 
        }catch(InputMismatchException e){
            System.out.println("Your input type was wrong!");
        }
    }

    /**
     * This method checks if reservations have expired, and remove them if they are expired
     */
    public static void checkExpired(){
        ReservationManager.expireCheck();
    }

    /**
     * This method prints all reservations
     */
    public static void printAllReservations(){
        ReservationManager.allReservationsPrint();
    }
}
