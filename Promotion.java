package SCE2002;

import java.util.*;
Scanner sc = new Scanner(System.in);

public class Promotion {

	private String promotionName;
	private MenuItem[] menuArray;
	private double promotionPrice;
	private String promotionDescription;
	
	public Promotion(String promotionName, MenuItem[] menuArray, double promotionPrice, String promotionDescription) {
		this.promotionName = promotionName;
		this.menuArray = menuArray;
		this.promotionPrice = promotionPrice;
		this.promotionDescription = promotionDescription;
	}
	public void updatePromotion() {
		int choice = 0;
		while(choice!=5) {
			System.out.println("What do you want to update:\n1. Name\n2.Menu Items\n3.Price\n4.Description\n5.Quit");
			choice = sc.nextInt();
			switch(choice){
				case(1): //update name
					System.out.println("Update name:");
					setPromotionName(sc.next());
					break;
				case(2): //update menu item
					System.out.println("Update Menu Itmes:");//TODO: to be updated when menu class is done in order to access array of MenuItems

					break;
				case(3): //update price
					System.out.println("Update price:");
					setPromotionPrice(sc.nextDouble());
					break;
				case(4): //update description
					System.out.println("Update description:");
					setPromotionDescription(sc.next());
					break;
				case(5): //user quitting
					break;
				default:
					System.out.println("Invalid input! Try again!");
			}
		}
				
	}

	public String getPromotionName() {
		return this.promotionName;
	}

	public MenuItem[] getMenuArray() {
		return this.menuArray;
	}	

	public double getPromotionPrice() {
		return this.promotionPrice;
	}

	public String getPromotionDescription() {
		return this.promotionDescription;
	}

	public void setPromotionName(String promotionName) {
		this.promotionName = promotionName;
	}

	public void setMenuArray(MenuItem[] menuArray) {
		this.menuArray = menuArray;
	}

	public void setPromotionPrice(double promotionPrice) {
		this.promotionPrice = promotionPrice;
	}

	public void setPromotionDescription(String promotionDescription) {
		this.promotionDescription = promotionDescription;
	}
	
}