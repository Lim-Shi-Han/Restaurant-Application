package menu;

public class MenuDisplay {
	
	public static void menuItemPrintName(Menu menu) {
		int menuItemArraySize = menu.getMenuItemArray().size();
		System.out.println("List of Menu Item");
		for(int i = 0; i < menuItemArraySize; i++) {
			System.out.format("%-10d%-50s%16.2f\n",i+1, menu.getMenuItemArray().get(i).getFoodName(), menu.getMenuItemArray().get(i).getFoodPrice());
		}
	}

	public static void menuItemPrintdescription(Menu menu) {
		int menuItemArraySize = menu.getMenuItemArray().size();
		System.out.println("List of Menu Item");
		for(int i = 0; i < menuItemArraySize; i++) {
			System.out.format("%-10d%-50s%16.2f\n",i+1, menu.getMenuItemArray().get(i).getFoodName(), menu.getMenuItemArray().get(i).getFoodPrice());
			System.out.format("          %-50s\n", menu.getMenuItemArray().get(i).getFoodDescription());
		}
	}

	public static void TypemenuItemPrintdescription(Menu menu) {
		int menuItemArraySize = menu.getMenuItemArray().size();
		System.out.println("List of Menu Item");
		String foodtypearray[] = {"Mains", "Sides", "Drinks", "Desserts"};
		
		for(String s : foodtypearray ){
			System.out.format("---------------------------------- %-10s ----------------------------------\n", s);
			for(int i = 0; i < menuItemArraySize; i++) {
				
				if(s.equals(menu.getMenuItemArray().get(i).getFoodType())){
					System.out.format("%-10d%-50s%16.2f\n",i+1, menu.getMenuItemArray().get(i).getFoodName(), menu.getMenuItemArray().get(i).getFoodPrice());
					System.out.format("          :  %-50s\n", menu.getMenuItemArray().get(i).getFoodDescription());
					System.out.println();
				}
				
			}
		}
	}
	
	public static void promotionPrintName(Menu menu) {
		int menuItemArraySize = menu.getMenuItemArray().size();
		int promotionArraySize = menu.getPromotionArray().size();
		System.out.println("List of Promotion");
		boolean exists = false;
		
		/*
		for(int i = 0; i < promotionArraySize; i++) {
			for(int j = 0; j < menuItemArraySize; j++) {
				println(menu.getPromotionArray().get(i).getFoodArray());
				break;
			}
			if(exists == false){
				System.out.format("%-10d%-50s%16.2f\n",i+1, menu.getPromotionArray().get(i).getPromotionName(), menu.getPromotionArray().get(i).getPromotionPrice());	
			}
			*/

	


		for(int i = 0; i < promotionArraySize; i++) {
			//System.out.println(i+1 + ". " + menu.getPromotionArray().get(i).getPromotionName() + "\t--S$" + menu.getPromotionArray().get(i).getPromotionPrice());
			System.out.format("%-10d%-50s%16.2f\n",i+1, menu.getPromotionArray().get(i).getPromotionName(), menu.getPromotionArray().get(i).getPromotionPrice());		
		}
	}
	
	public static void menuPrintName(Menu menu) {
		menuItemPrintName(menu);
		System.out.println();
		promotionPrintName(menu);
		System.out.println();
		menuItemPrintdescription(menu);
		System.out.println();
		TypemenuItemPrintdescription(menu);
	}
}