package menu;

import java.util.*;

public class menutest {

	public static void main(String[] args) {
		Menu menu = new Menu();
		
		Scanner sc1 = new Scanner(System.in);

		int choice;
		
		do {
			System.out.println("(1) Create Menu\n"
					+ "(2) Create Promotion\n"
					+ "(3) Quit\n"
					+ "Enter the number of your choice: ");
			
			choice = sc1.nextInt();
			
			
			switch(choice) {
			case 1: menu.menuCreate();
					System.out.println("Menu Created\n");
				break;
				
			case 2:	
					System.out.println("choice 2\n");
				break;
				
			case 3:	
					System.out.println("choice 3 \n");
				break;
		}

		
		}while(choice != 3);
	} 

}
