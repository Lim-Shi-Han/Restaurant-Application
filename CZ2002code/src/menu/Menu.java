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
		sc.close();
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
			System.out.println(menuArray.get(i).getfoodName());
		}
		
	}
}
