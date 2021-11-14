package ui;
import java.util.*;

public class Application {
    public static void main(String[] args){
        System.out.println();
        System.out.println("*******************");
        System.out.println("    MAIN SCREEN    ");
        System.out.println("*******************");
        Scanner sc = new Scanner(System.in);
		
		int choice = 0;

		do {
			try{
				System.out.println("(1) Create Menu Item\n"
						+ "(2) Create Promotion\n"
						+ "(3) Update Menu Item\n"
						+ "(4) Update Promotion\n"
						+ "(5) Remove Menu Item\n"
						+ "(6) Remove Promotion\n"
						+ "(7) Print Menu\n"
                        + "(8) Order\n"//includes creating, viewing or changing order, and upon submitting order customer leaves table
                        + "(9) Create Reservation Booking\n"
                        + "(10) Check Reservation Booking\n"
						+ "(11) Print all Reservations\n"
                        + "(12) Remove Reservation Booking\n"
                        + "(13) Check Expired Reservation Booking \n"
						+ "(14) Walk in \n"
						+ "(15) Reservation has arrived\n"
                        + "(16) View Sales Report\n"
						+ "(17) Quit\n"
						+ "Enter the number of your choice: ");
    
				choice = sc.nextInt();
				sc.nextLine();
    
				switch(choice) {
					case 1: 
						MenuUI.menuItemCreate();
						break;
            
					case 2:	
                        MenuUI.promotionCreate();
						break;
            
					case 3:	
                        MenuUI.menuItemUpdate();
						break;
            
					case 4: 
                        MenuUI.promotionUpdate();
						break;
            
					case 5: 
                        MenuUI.menuItemRemove();
						break;
            
					case 6: 
                        MenuUI.promotionRemove();
						break;
        
					case 7: 
						MenuDisplay.menuPrintName();
						break;
                    
                    case 8:
                        OrderUI.createOrder();
                        break;
                    
                    case 9:
                        ReservationUI.createReservation();
                        break;
                    
                    case 10:
                        ReservationUI.checkReservation();
                        break;
					
					case 11:
						ReservationUI.printAllReservations();
						break;
					
                    case 12:
                        ReservationUI.removeReservation();
                        break;
                    
                    case 13:
                        ReservationUI.checkExpired();
                        break;
					
					case 14:
						ReservationUI.walkIn();
						break;

					case 15:
						ReservationUI.arriveReservation();
						break;
                    
					case 16:
						SalesReportDisplay.printSales();
						break;                    
            
					case 17: 
						System.out.println("Quitting...");
						break;
        
					default: 
						System.out.println("Input is out of range. Please try again...");
				}
    
			}catch(InputMismatchException e){
				System.out.println("Invalid choice (not an integer). Please try again...");
				if(sc.hasNextLine())sc.nextLine();
			}
			
 			System.out.println();
			
 		}while(choice != 17);

    }
    
}
