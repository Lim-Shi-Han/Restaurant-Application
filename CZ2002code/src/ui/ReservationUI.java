package ui;
import java.util.*;
import java.time.*;
import manager.ReservationManager;

public class ReservationUI{

    public static void createReservation(){
        Scanner sc = new Scanner(System.in);

        //Number of people
		System.out.println("How many people: ");
		int numberOfPeople = sc.nextInt();
		sc.nextLine();
        if(numberOfPeople > 10){
            System.out.println("Our tables can only accomodate a maximum of 10 people!");
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
		if(reservationDate.isBefore(today) && reservationTime.isBefore(currentTime)) {
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
    }

    public static void checkReservation(){
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
    }


    public static void removeReservation(){
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
    }

    public static void arriveReservation(){
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
        System.out.println("Input table number:");
        int customerPhoneNumber = sc.nextInt();
        sc.nextLine();
        String customerPhoneNumberString = String.valueOf(customerPhoneNumber);
        String reservationID = date + time + customerPhoneNumberString;
        ReservationManager.reservationArrive(reservationID);
    }

    public static void leaveTable(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input table number:");
        int tableNumber = sc.nextInt();
        sc.nextLine();
        ReservationManager.tableLeave(tableNumber);
    }

    public static void walkIn(){
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

        //Customer phone number
        System.out.println("Input customer's phone number:");
        int customerPhoneNumber = sc.nextInt();
        sc.nextLine();

        ReservationManager.walkInReservation(numberOfPeople, customerPhoneNumber); 
    }

    public static void checkExpired(){
        ReservationManager.expireCheck();
    }

    public static void printAllReservations(){
        ReservationManager.allReservationsPrint();
    }
}
