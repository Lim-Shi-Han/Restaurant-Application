package menu;

import java.util.*;

public class Menu {
	
	private ArrayList<MenuItem> menuItemArray = new ArrayList<>();

	private ArrayList<Promotion> promotionArray = new ArrayList<>();

	public void menuItemCreate(){
		MenuItem food = new MenuItem();
		menuItemArray.add(food);
		System.out.println("Menu Item Created\n");
	}
	
	public void promotionCreate(){
		if(menuItemArray.size() == 0) {
			System.out.println("There is no Menu Item! Create a Menu Item first to add to the Promotion!");
			return;
		}
		Promotion promo = new Promotion(this);
		promotionArray.add(promo);
		System.out.println("Promotion Created\n");
	}

	public void menuItemUpdate(){
		if(menuItemArray.size() == 0) {
			System.out.println("There is no Menu Item!");
			return;
		}
		Scanner sc = new Scanner(System.in);
		//User to choose which menu item to update
		System.out.println("List of Menu Item: ");
		MenuDisplay.menuItemPrintName(this);
		System.out.println("Update Menu Item: ");
		int menuItemChoice = sc.nextInt();
		sc.nextLine();
		MenuItem menuItem = menuItemArray.get(menuItemChoice-1);
		menuItem.updateMenuItem(this);
	}
	
	public void promotionUpdate() {
		if(promotionArray.size() == 0) {
			System.out.println("There is no Promotion!");
			return;
		}
		Scanner sc = new Scanner(System.in);
		//User to choose which promotion item to update
		System.out.println("List of Promotion: ");
		MenuDisplay.promotionPrintName(this);
		System.out.println("Update Promotion: ");
		int promotionChoice = sc.nextInt();
		sc.nextLine();
		Promotion promo = promotionArray.get(promotionChoice-1);
		promo.updatePromotion(this);
	}
	

	public void menuItemRemove(){
		if(menuItemArray.size() == 0) {
			System.out.println("There is no Menu Item!");
			return;
		}
		Scanner sc = new Scanner(System.in);
		//User to choose which menu item to remove
		System.out.println("List of Menu Item: ");
		MenuDisplay.menuItemPrintName(this);
		System.out.println("Remove Menu Item: ");
		int menuItemChoice = sc.nextInt();
		sc.nextLine();
		menuItemArray.remove(menuItemChoice-1);
	}
	
	public void promotionRemove(){
		if(promotionArray.size() == 0) {
			System.out.println("There is no Promotion!");
			return;
		}
		Scanner sc = new Scanner(System.in);
		//User to choose which menu item to remove
		System.out.println("List of Promotion: ");
		MenuDisplay.promotionPrintName(this);
		System.out.println("Remove Promotion: ");
		int promotionChoice = sc.nextInt();
		sc.nextLine();
		promotionArray.remove(promotionChoice-1);
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
