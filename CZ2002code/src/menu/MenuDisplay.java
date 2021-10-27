package menu;

public class MenuDisplay {
	
	public static void menuItemPrintName(Menu menu) {
		int menuItemArraySize = menu.getMenuItemArray().size();
		System.out.println("List of Menu Item");
		for(int i = 0; i < menuItemArraySize; i++) {
			System.out.println(i+1 + ". " + menu.getMenuItemArray().get(i).getFoodName());
		}
	}
	
	public static void promotionPrintName(Menu menu) {
		int promotionArraySize = menu.getPromotionArray().size();
		System.out.println("List of Promotion");
		for(int i = 0; i < promotionArraySize; i++) {
			System.out.println(i+1 + ". " + menu.getPromotionArray().get(i).getPromotionName());
		}
	}
	
	public static void menuPrintName(Menu menu) {
		menuItemPrintName(menu);
		System.out.println();
		promotionPrintName(menu);
	}
}