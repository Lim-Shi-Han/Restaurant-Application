package manager;
import java.util.*;
import entity.Promotion;

/**
 * This class contains methods to create and update promotion
 * @author Shi Han
 * @version 1.2
 * @since 2021-10-22
*/

public class PromotionManager {

    
	/** 
	 * This method creates a promotion
	 * @return Promotion
	*/
	public static Promotion createPromotion() {
		Scanner sc= new Scanner(System.in);
        double promotionPrice = 0;
		
		//Name
		System.out.println("Name of promotion:");
		String promotionName = sc.nextLine();
		
		//Menu Item
		ArrayList <String> foodArray = new ArrayList<String>();
        addFoodItem(foodArray);
		
		//Description
		System.out.println("Description of promotion:");
		String promotionDescription = sc.nextLine();
		
		//Price
		try{
			System.out.println("Price of promotion:");
			promotionPrice = sc.nextDouble();
		}catch (InputMismatchException e){
			throw new InputMismatchException("Price");
		}
		
		System.out.println(promotionName + " successfully added!");

        Promotion newPromotion = new Promotion(promotionName, foodArray, promotionDescription, promotionPrice);
        return newPromotion;
	}
	
	
	/**
	 * This method updates a promotion
	 * @param promotion promotion object to update
	*/
	public static void updatePromotion(Promotion promotion) {
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
						promotion.setName(sc.nextLine());
						System.out.println();
						break;
					case(2): //update menu item
						try{
							System.out.println("1. Add or 2. Delete: ");
							int add = sc.nextInt();
							if(add==1) { //add
								addFoodItem(promotion.getFoodArray());
							}
							if(add==2) { //remove
								removeFoodItem(promotion.getFoodArray());
							}
							System.out.println();
							break;
						}catch (InputMismatchException e){
							throw new InputMismatchException("Food Item");
						}catch (IndexOutOfBoundsException e){
							throw new IndexOutOfBoundsException("Food Item");
						}
						
					case(3): //update description
						System.out.println("Update description:");
						promotion.setDescription(sc.nextLine());
						System.out.println();
						break;
						
					case(4): //update price
						try{
							System.out.println("Update price:");
							promotion.setPrice(sc.nextDouble());
							System.out.println();
							break;
						}catch (InputMismatchException e){
							throw new InputMismatchException("Price");
						}
						
					case(5): //user quitting
						System.out.println("Stopping update...");
						break;
					
					default: //indexOutOfBoundsException
						System.out.println("Invalid input! Try again!");
				}
			}catch(InputMismatchException e){
				throw new InputMismatchException("Choice");
			}
			
		}while (updateChoice!=5);	
	}
	
	
	/** 
	 * This method adds food items to a promotion
	 * @param foodArray foodArray of promotion object to have food items added
	 */
	public static void addFoodItem(ArrayList<String> foodArray){ //allows users to add food items
		Scanner sc = new Scanner(System.in);
		try{
			System.out.println("How many food items do you want to add in the promotion:");
			int numberOfFood = sc.nextInt();
			sc.nextLine();
			for(int i = 0; i < numberOfFood; i++){
				System.out.println("Insert food item:");
				foodArray.add(sc.nextLine());
			}
		}catch (InputMismatchException e){
			throw new InputMismatchException();
		}
	}
	
	
	/** 
	 * 	This method adds food items to a promotion
	 * 	@param foodArray foodArray of promotion object to have food items removed
	 */
	public static void removeFoodItem(ArrayList<String> foodArray) { //displays menuItems in promotion and let's user remove menuItem
		Scanner sc = new Scanner(System.in);
		int menuItemChoice;
		while(true) { //allows user to keep removing items
			if(foodArray.size() == 0) {
				System.out.println("No Menu Items left");
				break;
			}
			for(int i = 0; i < foodArray.size(); i++) {
				System.out.println("(" + (i+1) + ") " + foodArray.get(i));
			}
			try{
				System.out.println("Remove Menu Item:");
				menuItemChoice = sc.nextInt();
				if(menuItemChoice == -1)break;
				foodArray.remove(menuItemChoice-1);
			}catch (InputMismatchException e){
				throw new InputMismatchException();
			}catch (IndexOutOfBoundsException e){
				throw new IndexOutOfBoundsException();
			}
		}
	}

    
}
