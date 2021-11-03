package menu;

import java.util.*;

public class Promotion {

	private String promotionName;
	private ArrayList<MenuItem> foodArray = new ArrayList<>();
	private String promotionDescription;
	private double promotionPrice;
	
	public Promotion(Menu menu) {
		Scanner sc= new Scanner(System.in);
		
		//Name
		System.out.println("Name of promotion:");
		promotionName = sc.nextLine();
		
		//Menu Item
		addMenuItem(menu);
		
		//Description
		System.out.println("Description of promotion:");
		promotionDescription = sc.nextLine();
		
		//Price
		try{
			System.out.println("Price of promotion:");
			promotionPrice = sc.nextDouble();
		}catch (InputMismatchException e){
			throw new InputMismatchException("Price");
		}
		
		System.out.println(promotionName + " successfully added!");
	}
	
	public void updatePromotion(Menu menu) {
		Scanner sc = new Scanner(System.in);	
		
		//User chooses which aspect of the promotion to update
		int updateChoice;
		do {
			try{
				System.out.println("What do you want to update:\n1.Name\n2.Menu Items\n3.Description\n4.Price\n5.Quit");
				updateChoice = sc.nextInt();
				sc.nextLine();
				switch(updateChoice){
				
					case(1): //update name
						System.out.println("Update name:");
						promotionName = sc.nextLine();
						System.out.println();
						break;
					case(2): //update menu item
						try{
							System.out.println("1. Add or 2. Delete: ");
							int add = sc.nextInt();
							if(add==1) { //add
								addMenuItem(menu);
							}
							if(add==2) { //remove
								removeMenuItem();
							}
							System.out.println();
							break;
						}catch (InputMismatchException e){
							throw new InputMismatchException("Menu Item");
						}catch (IndexOutOfBoundsException e){
							throw new IndexOutOfBoundsException("Menu Item");
						}
						
					case(3): //update description
						System.out.println("Update description:");
						promotionDescription = sc.nextLine();
						System.out.println();
						break;
						
					case(4): //update price
						try{
							System.out.println("Update price:");
							promotionPrice = sc.nextDouble();
							System.out.println();
							break;
						}catch (InputMismatchException e){
							throw new InputMismatchException("Price");
						}
						
					case(5): //user quitting
						break;
					
					default: //indexOutOfBoundsException
						System.out.println("Invalid input! Try again!");
				}
			}catch(InputMismatchException e){
				throw new InputMismatchException("Choice");
			}
			
		}while (updateChoice!=5);	
	}
	
	public void addMenuItem(Menu menu){ //displays all menuItem and let's user choose menuItem to add
		Scanner sc = new Scanner(System.in);
		int menuItemChoice;
		ArrayList<MenuItem> menuItemArray = menu.getMenuItemArray();
		MenuDisplay.menuItemPrintName(menu);
		while(true) { //allows user to keep adding items
			System.out.println("Add Menu Item (Choose -1 to exit):");
			menuItemChoice = sc.nextInt();
			if(menuItemChoice == -1)break;
			foodArray.add(menuItemArray.get(menuItemChoice-1));
		}
	}
	
	public void removeMenuItem() { //displays menuItems in promotion and let's user remove menuItem
		Scanner sc = new Scanner(System.in);
		int menuItemChoice;
		while(true) { //allows user to keep removing items
			if(foodArray.size() == 0) {
				System.out.println("No Menu Items left");
				break;
			}
			for(int i = 0; i < foodArray.size(); i++) {
				System.out.println(i+1 + ". " + foodArray.get(i));
			}
			System.out.println("Remove Menu Item:");
			menuItemChoice = sc.nextInt();
			if(menuItemChoice == -1)break;
			foodArray.remove(menuItemChoice-1);
		}
	}

	public String getPromotionName() {
		return this.promotionName;
	}

	public ArrayList<MenuItem> getFoodArray() {
		return this.foodArray;
	}	

	public double getPromotionPrice() {
		return this.promotionPrice;
	}

	public String getPromotionDescription() {
		return this.promotionDescription;
	}

	public void setPromotionName(String promotionName) {
		this.promotionName = promotionName;
	}

	public void setFoodArray(ArrayList<MenuItem> foodArray) {
		this.foodArray = foodArray;
	}

	public void setPromotionPrice(double promotionPrice) {
		this.promotionPrice = promotionPrice;
	}

	public void setPromotionDescription(String promotionDescription) {
		this.promotionDescription = promotionDescription;
	}
	
}