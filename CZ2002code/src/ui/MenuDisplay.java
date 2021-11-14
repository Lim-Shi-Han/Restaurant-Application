package ui;
import database.Menu;
import manager.DatabaseManager;

public class MenuDisplay {
	

	//Staff View
	public static void menuItemPrintName() {
		Menu menu = (Menu)DatabaseManager.fileRead("menu.bin");
		int menuItemArraySize = menu.getMenuItemArray().size();
		System.out.println("List of Menu Item");
		String foodtypeStrings[] = {"Mains", "Sides", "Drinks", "Desserts", "Others"};
		
		for(String s : foodtypeStrings ){
			System.out.format("Item No.|---------------------------- %-10s ----------------------------------\n", s);
			for(int i = 0; i < menuItemArraySize; i++) {
				
				if(s.equalsIgnoreCase(menu.getMenuItemArray().get(i).getFoodType())){
					System.out.format("%-10d%-50s%16.2f\n",(i+1), menu.getMenuItemArray().get(i).getName(), menu.getMenuItemArray().get(i).getPrice());
					System.out.format("          :  %-50s\n", menu.getMenuItemArray().get(i).getDescription());
					System.out.println();
				}
				
			}
		}
	}

	//Customer View
	public static void CustomerMenuItemPrintName() {
		Menu menu = (Menu)DatabaseManager.fileRead("menu.bin");
		int menuItemArraySize = menu.getMenuItemArray().size();
		System.out.println("List of Menu Item");
		String foodtypeStrings[] = {"Mains", "Sides", "Drinks", "Desserts", "Others"};
		String bulletpoint = "<>";

		for(String s : foodtypeStrings ){
			System.out.format("------------------------------------- %-10s ----------------------------------\n", s);
			for(int i = 0; i < menuItemArraySize; i++) {
				
				if(s.equalsIgnoreCase(menu.getMenuItemArray().get(i).getFoodType())){
					System.out.format("%-10s%-50s%16.2f\n", bulletpoint, menu.getMenuItemArray().get(i).getName(), menu.getMenuItemArray().get(i).getPrice());
					System.out.format("          :  %-50s\n", menu.getMenuItemArray().get(i).getDescription());
					System.out.println();
				}
				
			}
		}
	}
	
	//Staff View
	public static void promotionPrintName() {
		Menu menu = (Menu)DatabaseManager.fileRead("menu.bin");
		int promotionArraySize = menu.getPromotionArray().size();
		System.out.println("List of Promotion");
		
		for(int i = 0; i < promotionArraySize; i++) {
			//System.out.println((i+1) + ". " + menu.getPromotionArray().get(i).getPromotionName() + "\t--S$" + menu.getPromotionArray().get(i).getPromotionPrice());
			System.out.format("%-10d%-50s%16.2f\n",(i+1), menu.getPromotionArray().get(i).getName(), menu.getPromotionArray().get(i).getPrice());		
		}
	}

	//Customer View
	public static void CustomerPromotionPrintName() {
		Menu menu = (Menu)DatabaseManager.fileRead("menu.bin");
		int promotionArraySize = menu.getPromotionArray().size();
		String bulletpoint = "<>";
		System.out.println("List of Promotion");
		
		for(int i = 0; i < promotionArraySize; i++) {
			//System.out.println((i+1) + ". " + menu.getPromotionArray().get(i).getPromotionName() + "\t--S$" + menu.getPromotionArray().get(i).getPromotionPrice());
			System.out.format("%-10s%-50s%16.2f\n", bulletpoint, menu.getPromotionArray().get(i).getName(), menu.getPromotionArray().get(i).getPrice());		
		}
	}

	public static void menuPrintName() {
		menuItemPrintName();
		System.out.println();
		promotionPrintName();
	}

	public static void CustomerMenuPrintName(){
		CustomerMenuItemPrintName();
		System.out.println();
		CustomerPromotionPrintName();
	}
}