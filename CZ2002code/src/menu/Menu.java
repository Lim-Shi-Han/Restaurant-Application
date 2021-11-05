package menu;

import java.io.Serializable;
import java.util.*;

public class Menu implements Serializable{
	
	private ArrayList<MenuItem> menuItemArray = new ArrayList<>();

	private ArrayList<Promotion> promotionArray = new ArrayList<>();

	public void menuItemCreate(){
		try{
			MenuItem food = new MenuItem();
			menuItemArray.add(food);
			System.out.println("Menu Item Created\n");
		}catch(InputMismatchException e){
			System.out.println("Input for price is invalid (not a double). Menu Item not created...");
		}
	}
	
	public void promotionCreate(){
		try{
			Promotion promo = new Promotion();
			promotionArray.add(promo);
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

	public void menuItemUpdate(){
		if(menuItemArray.size() == 0) {
			System.out.println("There is no Menu Item!");
			return;
		}
		Scanner sc = new Scanner(System.in);
		//User to choose which menu item to update
		try{
			System.out.println("List of Menu Item: ");
			MenuDisplay.menuItemPrintName(this);
			System.out.println("Update Menu Item: ");
			int menuItemChoice = sc.nextInt();
			sc.nextLine();
			MenuItem menuItem = menuItemArray.get(menuItemChoice-1);
			menuItem.updateMenuItem();
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
	
	public void promotionUpdate() {
		if(promotionArray.size() == 0) {
			System.out.println("There is no Promotion!");
			return;
		}
		Scanner sc = new Scanner(System.in);
		//User to choose which promotion item to update
		try{
		System.out.println("List of Promotion: ");
		MenuDisplay.promotionPrintName(this);
		System.out.println("Update Promotion: ");
		int promotionChoice = sc.nextInt();
		sc.nextLine();
		Promotion promo = promotionArray.get(promotionChoice-1);
		promo.updatePromotion();
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
	

	public void menuItemRemove(){
		if(menuItemArray.size() == 0) {
			System.out.println("There is no Menu Item!");
			return;
		}
		Scanner sc = new Scanner(System.in);
		//User to choose which menu item to remove
		try{
			System.out.println("List of Menu Item: ");
			MenuDisplay.menuItemPrintName(this);
			System.out.println("Remove Menu Item: ");
			int menuItemChoice = sc.nextInt();
			sc.nextLine();
			menuItemArray.remove(menuItemChoice-1);
		}catch (InputMismatchException e){
			System.out.println("Choice of menu item is invalid (not an integer). Menu Item not removed...");
		}catch (IndexOutOfBoundsException e){
			System.out.println("Selection of menu item is out of range. Menu Item not removed...");
		}
	}
	
	public void promotionRemove(){
		if(promotionArray.size() == 0) {
			System.out.println("There is no Promotion!");
			return;
		}
		Scanner sc = new Scanner(System.in);
		//User to choose which promotion to remove
		try{
			System.out.println("List of Promotion: ");
			MenuDisplay.promotionPrintName(this);
			System.out.println("Remove Promotion: ");
			int promotionChoice = sc.nextInt();
			sc.nextLine();
			promotionArray.remove(promotionChoice-1);
		}catch (InputMismatchException e){
			System.out.println("Choice of promotion is invalid (not an integer). Promotion not removed...");
		}catch (IndexOutOfBoundsException e){
			System.out.println("Selection of promotion is out of range. Promotion not removed...");
		}
	}
	
	
	public ArrayList<MenuItem> getMenuItemArray() {
		return menuItemArray;
	}

	public void setMenuItemArray(ArrayList<MenuItem> menuItemArray) {
		this.menuItemArray = menuItemArray;
	}
	
	public ArrayList<Promotion> getPromotionArray() {
		return promotionArray;
	}

	public void setPromotionArray(ArrayList<Promotion> promotionArray) {
		this.promotionArray = promotionArray;
	}
}
