package menu;

import java.util.*;

public class menutest {

	public static void main(String[] args) {
		Menu menu = new Menu();
		
		Scanner sc = new Scanner(System.in);

		int choice;
		
		do {
			System.out.println("(1) Create Menu Item\n"
					+ "(2) Create Promotion\n"
					+ "(3) Update Menu Item\n"
					+ "(4) Update Promotion\n"
					+ "(5) Remove Menu Item\n"
					+ "(6) Remove Promotion\n"
					+ "(7) Print Menu\n"
					+ "(8) Quit\n"
					+ "Enter the number of your choice: ");
			
			choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
				case 1: menu.menuItemCreate();
					break;
					
				case 2:	menu.promotionCreate();
					break;
					
				case 3:	menu.menuItemUpdate();
					break;
					
				case 4: menu.promotionUpdate();
					break;
					
				case 5: menu.menuItemRemove();
					break;
					
				case 6: menu.promotionRemove();
					break;
				
				case 7: MenuDisplay.menuPrintName(menu);
					break;
					
				case 8: System.out.println("Quitting...");
					break;
				
				default: System.out.println("Invalid input! Try again!");
			}
			
			System.out.println();

		}while(choice != 8);
	} 

}