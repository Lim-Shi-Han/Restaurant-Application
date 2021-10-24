package menu;

import java.util.*;

public class menutest {

	public static void main(String[] args) {
		Menu menu = new Menu();
		
		Scanner sc1 = new Scanner(System.in);

		int choice;
		
		do {
			System.out.println("(1) Create Menu\n"
					+ "(2) Print Menu\n"
					+ "(3) Remove from Menu\n"
					+ "(4) Update Menu\n"
					+ "(5) Quit\n"
					+ "Enter the number of your choice: ");
			
			choice = sc1.nextInt();
			
			
			switch(choice) {
			case 1: menu.menuCreate();
					System.out.println("Menu Created\n");
				break;
				
			case 2:	
					System.out.println("choice 2 selected\n");
					menu.menuPrint();
				break;

			case 3:	
					System.out.println("choice 3 selected\n");
					System.out.printf("Please choose Menu item from 1 to %d to remove from the Menu", menu.menuSize());
					menu.menuPrint();
					int menuitemRemove = sc1.nextInt();
					menu.menuRemove(menuitemRemove - 1);	//change to index
					
				break;

			case 4:	
				System.out.println("choice 4 selected\n");
				System.out.printf("Please choose Menu item from 1 to %d to update from the Menu", menu.menuSize());
				menu.menuPrint();
				int menuitemUpdate = sc1.nextInt();
				menu.menuUpdate(menuitemUpdate -1);	//change to index
					
				break;

			case 5:	
					System.out.println("choice 5 selected\n");
				break;
		}

		
		}while(choice != 5);
	} 

}
