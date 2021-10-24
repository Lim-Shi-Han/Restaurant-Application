package menu;

import java.util.*;

public class Menu {
	
	private ArrayList<MenuItem> menuArray = new ArrayList<>();
	private ArrayList<Promotion> promotionArray = new ArrayList<>();
	
	public void menuCreate(){
		Scanner sc= new Scanner(System.in);
		System.out.println("Name of food:");
		String foodName = sc.nextLine();
		System.out.println("Type of food:");
		String foodType = sc.nextLine();
		System.out.println("Description of food:");
		String foodDescription = sc.nextLine();
		System.out.println("Price of food:");
		double foodPrice = sc.nextDouble();
		MenuItem food = new MenuItem(foodName, foodType, foodDescription, foodPrice);
		menuArray.add(food);
		System.out.println(foodName + " succesfully added!");
		//sc.close();
	}
	
	public void promotionCreate(){
		Scanner sc= new Scanner(System.in);
		System.out.println("Name of promotion:");
		String promotionName = sc.nextLine();
		/*
		 * System.out.println("Type of food:"); String foodType = sc.nextLine();
		 * System.out.println("Description of food:"); String foodDescription =
		 * sc.nextLine(); System.out.println("Price of food:"); double foodPrice =
		 * sc.nextDouble(); MenuItem food = new MenuItem(foodName, foodType,
		 * foodDescription, foodPrice); menuArray.add(food); System.out.println(foodName
		 * + " succesfully added!"); sc.close();
		 */
	}
	
	public void menuPrint() {
		int menuArraySize = menuArray.size();
		System.out.println("Menu");
		for(int i = 0; i < menuArraySize; i++) {
			System.out.println("(" + (i+1) + ")\t" + menuArray.get(i).getfoodName());
		}
		System.out.println("\n");
	}

	public void menuUpdate(int UpdateIndex){
		Scanner sc= new Scanner(System.in);
		
		if(menuArray.size() <= 0) {
			System.out.println("Menu is empty! There is no existing item to be updated.");
			return;
		}
		

		System.out.println("Update Name of food to: ");
		String updatefoodName = sc.nextLine();
		System.out.println("Update Type of food to: ");
		String updatefoodType = sc.nextLine();
		System.out.println("Update Description of food to: ");
		String updatefoodDescription = sc.nextLine();
		System.out.println("Update Price of food to: ");
		double updatefoodPrice = sc.nextDouble();
		MenuItem updatefood = new MenuItem(updatefoodName, updatefoodType, updatefoodDescription, updatefoodPrice);

		menuArray.set(UpdateIndex,updatefood);


	}

	public int menuSize() {
		return(menuArray.size());
	}

	public void menuRemove(int RemoveIndex){
		if(menuArray.size() <= 0) {
			System.out.println("Menu is empty! There is no existing item to be removed.");
			return;
		}

		menuArray.remove(RemoveIndex);

		/*
		int menuArraySize = menuArray.size();
		System.out.println("");
		for(int i = 0; i < menuArraySize; i++) {
			if(menuArray.get(i).getfoodName() == RemoveName){
				menuArray.remove(i);
			}
			
		}
		*/

	}
}
