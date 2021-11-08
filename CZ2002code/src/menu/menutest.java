package menu;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.*;

public class menutest {

	public static void main(String[] args) throws IOException {

		Menu menu = new Menu();
		String menuFile = "menu.bin";
		try{
			ObjectInputStream is = new ObjectInputStream(new FileInputStream(menuFile));
			menu = (Menu) is.readObject();
			is.close();
		}catch (FileNotFoundException e){
			e.printStackTrace();
		}catch (IOException e){
			e.printStackTrace();
		}catch (ClassNotFoundException e){
			System.out.println("No menu found. Creating new menu...");
		}
		
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
						+ "(8) Quit\n"
						+ "Enter the number of your choice: ");
				
				choice = sc.nextInt();
				sc.nextLine();
				
				switch(choice) {
					case 1: 
						menu.menuItemCreate();
						break;
						
					case 2:	
						menu.promotionCreate();
						break;
						
					case 3:	
						menu.menuItemUpdate();
						break;
						
					case 4: 
						menu.promotionUpdate();
						break;
						
					case 5: 
						menu.menuItemRemove();
						break;
						
					case 6: 
						menu.promotionRemove();
						break;
					
					case 7: 
						MenuDisplay.menuPrintName(menu);
						break;
						
					case 8: 
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
			
		}while(choice != 8);
		
		try{
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(menuFile));
			os.writeObject(menu);
			os.close();
		}catch (FileNotFoundException e){
			e.printStackTrace();
		}catch (IOException e){
			e.printStackTrace();
		}

	} 

}