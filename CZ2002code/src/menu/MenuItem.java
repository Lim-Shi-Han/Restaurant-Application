package menu;

import java.io.Serializable;
import java.util.*;

public class MenuItem implements Serializable{

	private String foodName;
	private String foodType;
	private String foodDescription;
	private double foodPrice;
	
	public MenuItem() {
		Scanner sc= new Scanner(System.in);

		//Name
		System.out.println("Name of food:");
		this.foodName = sc.nextLine();

		//Type
		System.out.println("Type of food:");
		this.foodType = sc.nextLine();

		//Description
		System.out.println("Description of food:");
		this.foodDescription = sc.nextLine();

		//Price
		System.out.println("Price of food:");
		this.foodPrice = sc.nextDouble();

		System.out.println(foodName + " successfully added!");
	}
	
	public void updateMenuItem() {
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
						foodName = sc.nextLine();
						System.out.println();
						break;
						
					case(2): //update type
						System.out.println("Update type:");
						foodType = sc.nextLine();
						System.out.println();
						break;
						
					case(3): //update description
						System.out.println("Update description:");
						foodDescription = sc.nextLine();
						System.out.println();
						break;
						
					case(4): //update price
						try{
							System.out.println("Update price:");
							foodPrice = sc.nextDouble();
							System.out.println();
							break;
						}catch (InputMismatchException e){
							throw new InputMismatchException("Price");
						}
						
					case(5): //user quitting
						break;
					
					default: //indexOutOfBoundsException
						System.out.println("Selection of update option is out of range! Try again!");
				}
			}catch (InputMismatchException e){
				throw new InputMismatchException("Choice");
			}
			
		}while (updateChoice!=5);	
	}
	
	public String getFoodName() {
		return foodName;
	}
	public String getFoodType() {
		return foodType;
	}
	public String getFoodDescription() {
		return foodDescription;
	}
	public double getFoodPrice() {
		return foodPrice;
	}
	
}
