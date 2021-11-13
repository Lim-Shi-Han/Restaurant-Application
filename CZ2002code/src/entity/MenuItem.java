package entity;

import java.io.Serializable;

public class MenuItem extends AbstractMenu implements Serializable{

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
	public void setFoodPrice(double foodPrice) {
		this.foodPrice = foodPrice;
	}	
	public String getFoodName() {
		return foodName;
	}
	public String getFoodType() {
		return foodType;
	}
	public String getFoodDescription() {
		return foodDescription;
	}
	public double getFoodPrice() {
		return foodPrice;
	}
	
}
