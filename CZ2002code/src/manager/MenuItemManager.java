package manager;
import java.util.*;
import entity.MenuItem;

public class MenuItemManager {

    public static MenuItem createMenuItem() {
		Scanner sc= new Scanner(System.in);
        String foodType;

		//Name
		System.out.println("Name of food:");
		String foodName = sc.nextLine();

		//Type
		System.out.println("Enter number from 1-4 for Type of food: \n"
		+ "(1) MAINS\n"
		+ "(2) SIDES\n"
		+ "(3) DESSERTS\n"
		+ "(4) DRINKS" );
		try{
		int i = sc.nextInt();
			//sc.nextLine();
			switch(i){
				case 1: foodType = "Mains";
						break;
				case 2:	foodType = "Sides";
						break;
				case 3:	foodType = "Desserts";
						break;
				case 4:	foodType = "Drinks";
						break;
				default: System.out.println("Invalid choice entered, food item has been placed in Others! ");
					foodType = "Others";
				}

		}catch(InputMismatchException e){
			System.out.println("Invalid choice entered, food item has been placed in Others! ");
			foodType = "Others";
		}
		sc.nextLine();


		//Description
		System.out.println("Description of food:");
		String foodDescription = sc.nextLine();

		//Price
		System.out.println("Price of food:");
		Double foodPrice = sc.nextDouble();

		System.out.println(foodName + " successfully added!");

        MenuItem newMenuItem = new MenuItem(foodName, foodType, foodDescription, foodPrice);

        return newMenuItem;
	}
	
	public static void updateMenuItem(MenuItem menuItem) {
		Scanner sc = new Scanner(System.in);	
		
		//User chooses which aspect of the promotion to update
		int updateChoice;
		do {
			try{
				System.out.println("What do you want to update:\n1.Name\n2.Type\n3.Description\n4.Price\n5.Quit");
				updateChoice = sc.nextInt();
				sc.nextLine();
				switch(updateChoice){
				
					case(1): //update name
						System.out.println("Update name:");
						menuItem.setName(sc.nextLine());
						System.out.println();
						break;
						
					case(2): //update type
						System.out.println("Update type:");
						menuItem.setFoodType(sc.nextLine());
						System.out.println();
						break;
						
					case(3): //update description
						System.out.println("Update description:");
						menuItem.setDescription(sc.nextLine());
						System.out.println();
						break;
						
					case(4): //update price
						try{
							System.out.println("Update price:");
							menuItem.setPrice(sc.nextDouble());
							System.out.println();
							break;
						}catch (InputMismatchException e){
							throw new InputMismatchException("Price");
						}
						
					case(5): //user quitting
						System.out.println("Stopping update...");
						break;
					
					default: //indexOutOfBoundsException
						System.out.println("Selection of update option is out of range! Try again!");
				}
			}catch (InputMismatchException e){
				throw new InputMismatchException("Choice");
			}
			
		}while (updateChoice!=5);	
	}

}