package menu;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.File;
import java.util.*;

public class menutest {

	public static void main(String[] args) throws IOException {
		
		
		//for scan from input file
		//System.setIn(new FileInputStream("CZ2002code/src/menu/Testcase.txt"));

		Menu menu = new Menu();
		
		Scanner sc = new Scanner(System.in);
		//for scan from input file
		//Scanner sc = new Scanner(new File("CZ2002code/src/menu/Testcase.txt"));

		//For output to text file
		/*
		String fileName = "CZ2002code/src/menu/Output.txt";
		final boolean append = true, autoflush = true;
		PrintStream printStream = new PrintStream(new FileOutputStream(fileName, append),
		                                    autoflush);
		System.setOut(printStream);
		*/

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
				//if(sc.hasNextLine()) sc.nextLine();
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
					
					default: System.out.println("Input is out of range. Please try again...");
				}
				
			}catch(InputMismatchException e){
				System.out.println("Invalid choide (not an integer). Please try again...");
				if(sc.hasNextLine())sc.nextLine();
			}
			
			System.out.println();
			
		}while(choice != 8);
	} 

}