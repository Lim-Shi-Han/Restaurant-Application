package ui;
import database.Menu;
import manager.DatabaseManager;

public class MenuDisplay {
	
	public static void menuItemPrintName() {
		Menu menu = (Menu)DatabaseManager.fileRead("menu.bin");
		int menuItemArraySize = menu.getMenuItemArray().size();
		System.out.println("List of Menu Item");
		String foodtypearray[] = {"Mains", "Sides", "Drinks", "Desserts", "Others"};
		
		for(String s : foodtypearray ){
			System.out.format("---------------------------------- %-10s ----------------------------------\n", s);
			for(int i = 0; i < menuItemArraySize; i++) {
				
				if(s.equalsIgnoreCase(menu.getMenuItemArray().get(i).getFoodType())){
					System.out.format("%-10d%-50s%16.2f\n",(i+1), menu.getMenuItemArray().get(i).getFoodName(), menu.getMenuItemArray().get(i).getFoodPrice());
					System.out.format("          :  %-50s\n", menu.getMenuItemArray().get(i).getFoodDescription());
					System.out.println();
				}
				
			}
		}
	}

	
	public static void promotionPrintName() {
		Menu menu = (Menu)DatabaseManager.fileRead("menu.bin");
		int promotionArraySize = menu.getPromotionArray().size();
		System.out.println("List of Promotion");
		
		
		/*
		int menuItemArraySize = menu.getMenuItemArray().size();
		boolean exists = false;
		for(int i = 0; i < promotionArraySize; i++) {
			for(int j = 0; j < menuItemArraySize; j++) {
				println(menu.getPromotionArray().get(i).getFoodArray());
				break;
			}
			if(exists == false){
				System.out.format("%-10d%-50s%16.2f\n",(i+1), menu.getPromotionArray().get(i).getPromotionName(), menu.getPromotionArray().get(i).getPromotionPrice());	
			}
			*/

		for(int i = 0; i < promotionArraySize; i++) {
			//System.out.println((i+1) + ". " + menu.getPromotionArray().get(i).getPromotionName() + "\t--S$" + menu.getPromotionArray().get(i).getPromotionPrice());
			System.out.format("%-10d%-50s%16.2f\n",(i+1), menu.getPromotionArray().get(i).getPromotionName(), menu.getPromotionArray().get(i).getPromotionPrice());		
		}
	}
	
	public static void menuPrintName() {
		menuItemPrintName();
		System.out.println();
		promotionPrintName();
	}
}