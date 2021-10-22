package menu;

import java.util.*;

public class menutest {

	public static void main(String[] args) {
		Menu menu = new Menu();
		
		Scanner sc = new Scanner(System.in);
		
		int choice = 3;
		
		do {
			System.out.println("1. Create Menu Item\n2. Print Menu\n3. Quit");
			choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
				case(1):
					menu.menuCreate();
					break;
				case(2):
					menu.menuPrint();
					break;
				case(3):
					break;
				default:
					break;
			}
		}while(choice!=3);
		
		sc.close();
	}

}
