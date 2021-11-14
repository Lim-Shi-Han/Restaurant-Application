package ui;
import entity.MenuItem;
import entity.Promotion;
import database.Menu;
import manager.DatabaseManager;
import manager.MenuItemManager;
import manager.PromotionManager;
import java.util.*;

public class MenuUI {
    public static void menuItemCreate(){
		try{
            Menu menu = (Menu) DatabaseManager.fileRead("menu.bin");
			MenuItem food = MenuItemManager.createMenuItem();
			menu.getMenuItemArray().add(food);
            DatabaseManager.fileWrite(menu, "menu.bin");
			System.out.println("Menu Item Created\n");
		}catch(InputMismatchException e){
			System.out.println("Input for price is invalid (not a double). Menu Item not created...");
		}
	}
	
	public static void promotionCreate(){
		try{ 
            Menu menu = (Menu) DatabaseManager.fileRead("menu.bin");
			Promotion promo = PromotionManager.createPromotion();
			menu.getPromotionArray().add(promo);
            DatabaseManager.fileWrite(menu, "menu.bin");
			System.out.println("Promotion Created\n");
		}catch (InputMismatchException e){
			if(e.toString().contains("Price")){
				System.out.println("Input for price is invalid (not a double). Promtion not created...");
			}
			else{
				System.out.println("Input for food item is invalid (not an integer). Promtion not created...");
			}
		}
	}

	public static void menuItemUpdate(){
        Menu menu = (Menu) DatabaseManager.fileRead("menu.bin");
		if(menu.getMenuItemArray().size() == 0) {
			System.out.println("There is no Menu Item!");
			return;
		}
		Scanner sc = new Scanner(System.in);
		//User to choose which menu item to update
		try{
			System.out.println("List of Menu Item: ");
			MenuDisplay.menuItemPrintName();
			System.out.println("Update Menu Item: ");
			int menuItemChoice = sc.nextInt();
			sc.nextLine();
			MenuItem menuItem = menu.getMenuItemArray().get(menuItemChoice-1);
			MenuItemManager.updateMenuItem(menuItem);
            DatabaseManager.fileWrite(menu, "menu.bin");
		}catch (InputMismatchException e){
			if(e.toString().contains("Choice")){
				System.out.println("Choice of update option is invalid (not an integer). Menu Item not updated...");
			}
			else if(e.toString().contains("Price")){
				System.out.println("Input for price is invalid (not a double). Menu Item update stops here...");
			}
			else{
				System.out.println("Choice of menu item is invalid (not an integer). Menu item not updated...");
			}
		}catch (IndexOutOfBoundsException e){
			System.out.println("Selection of menu item is out of range. Menu Item not updated...");
		}
	}
	
	public static void promotionUpdate() {
        Menu menu = (Menu) DatabaseManager.fileRead("menu.bin");
		if(menu.getPromotionArray().size() == 0) {
			System.out.println("There is no Promotion!");
			return;
		}
		Scanner sc = new Scanner(System.in);
		//User to choose which promotion item to update
		try{
            System.out.println("List of Promotion: ");
            MenuDisplay.promotionPrintName();
            System.out.println("Update Promotion: ");
            int promotionChoice = sc.nextInt();
            sc.nextLine();
            Promotion promo = menu.getPromotionArray().get(promotionChoice-1);
            PromotionManager.updatePromotion(promo);
            DatabaseManager.fileWrite(menu, "menu.bin");
		}catch (InputMismatchException e){
			if(e.toString().contains("Choice")){
				System.out.println("Choice of update option is invalid (not an integer). Promotion not updated...");
			}
			else if(e.toString().contains("Price")){
				System.out.println("Input for price is invalid (not a double). Promotion update stops here...");
			}
			else if(e.toString().contains("Food Item")){
				System.out.println("Choice of food item is invalid (not an integer). Promotion update stops here...");
			}
			else{
				System.out.println("Choice of promotion is invalid (not an integer). Promotion not updated...");
			}
		}catch (IndexOutOfBoundsException e){
			if(e.toString().contains("Menu Item")){
				System.out.println("Selection of menu item option is out of range. Promotion update stops here...");
			}
			System.out.println("Selection of promotion is out of range. Promotion not updated...");
		}
	}
	

	public static void menuItemRemove(){
        Menu menu = (Menu) DatabaseManager.fileRead("menu.bin");
		if(menu.getMenuItemArray().size() == 0) {
			System.out.println("There is no Menu Item!");
			return;
		}
		Scanner sc = new Scanner(System.in);
		//User to choose which menu item to remove
		try{
			MenuDisplay.menuItemPrintName();
			System.out.println("Remove Menu Item: ");
			int menuItemChoice = sc.nextInt();
			sc.nextLine();
			menu.getMenuItemArray().remove(menuItemChoice-1);
            DatabaseManager.fileWrite(menu, "menu.bin");
			System.out.println("Menu Item removed");
		}catch (InputMismatchException e){
			System.out.println("Choice of menu item is invalid (not an integer). Menu Item not removed...");
		}catch (IndexOutOfBoundsException e){
			System.out.println("Selection of menu item is out of range. Menu Item not removed...");
		}
	}
	
	public static void promotionRemove(){
        Menu menu = (Menu) DatabaseManager.fileRead("menu.bin");
		if(menu.getPromotionArray().size() == 0) {
			System.out.println("There is no Promotion!");
			return;
		}
		Scanner sc = new Scanner(System.in);
		//User to choose which promotion to remove
		try{
			MenuDisplay.promotionPrintName();
			System.out.println("Remove Promotion: ");
			int promotionChoice = sc.nextInt();
			sc.nextLine();
			menu.getPromotionArray().remove(promotionChoice-1);
            DatabaseManager.fileWrite(menu, "menu.bin");
		}catch (InputMismatchException e){
			System.out.println("Choice of promotion is invalid (not an integer). Promotion not removed...");
		}catch (IndexOutOfBoundsException e){
			System.out.println("Selection of promotion is out of range. Promotion not removed...");
		}
	}	
}
