package entity;

import java.io.Serializable;

public class MenuItem extends AbstractMenu{

	private String foodName;
	private String foodType;
	private String foodDescription;
	private double foodPrice;
	
	public MenuItem(String foodName, String foodType, String foodDescription, double foodPrice){
		
		this.foodName = foodName;
		this.foodType = foodType;
		this.foodDescription = foodDescription;
		this.foodPrice = foodPrice;
	}

	/*
	public MenuItem(String name, String foodType, String description, double price){
		super(name, description, price);
		this.foodType = foodType;

	}*/
	
	public void setName(String foodName) {
		this.foodName = foodName;
	}
	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}
	public void setDescription(String foodDescription) {
		this.foodDescription = foodDescription;
	}
	public void setPrice(double foodPrice) {
		this.foodPrice = foodPrice;
	}	
	public String getName() {
		return foodName;
	}
	public String getFoodType() {
		return foodType;
	}
	public String getDescription() {
		return foodDescription;
	}
	public double getPrice() {
		return foodPrice;
	}
	
}
