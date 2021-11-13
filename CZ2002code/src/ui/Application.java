package ui;
import java.util.*;

import database.SalesReport;

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
                        + "(8) Order\n"//includes creating, viewing or changing order
                        + "(9) Create Reservation Booking\n"
                        + "(10) Check Reservation Booking\n"
                        + "(11) Remove Reservation Booking\n"
                        + "(12) Check Expired Reservation Booking \n"
                        + "(13) View Sales Report\n"
						+ "(14) Quit\n"
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
                        ReservationUI.removeReservation();
                        break;
                    
                    case 12:
                        ReservationUI.checkExpired();
                        break;
                    
					case 13:
						SalesReportDisplay.printSales();
						break;                    
            
					case 14: 
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
			
 		}while(choice != 14);

    }
    
}
