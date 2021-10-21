package SCE2002;

import java.util.*;

public class MenuItem {

	private String foodName;
	private String foodType;
	private String foodDescription;
	private double foodPrice;
	
	public MenuItem(String foodName, String foodType, String foodDescription, double foodPrice) {
		this.foodName = foodName;
		this.foodType = foodType;
		this.foodDescription = foodDescription;
		this.foodPrice = foodPrice;
	}
	
	public String getfoodName() {
		return foodName;
	}
	public String getfoodType() {
		return foodType;
	}
	public String getfoodDescription() {
		return foodDescription;
	}
	public double getfoodPrice() {
		return foodPrice;
	}
	
}
