package entity;
/**
 * Represents menuitem details
 * @author group 4
 * @version 1.0
 * @since 2021-10-22
 */

public class MenuItem extends AbstractMenu{

	private String foodName;
	private String foodType;
	private String foodDescription;
	private double foodPrice;

	/**
	 * This is the constructor
	 * @param foodName
	 * @param foodType
	 * @param foodDescription
	 * @param foodPrice
	 */
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
	/**
	 * this assigns foodname
	 * @param foodName
	 */
	public void setName(String foodName) {
		this.foodName = foodName;
	}
	/**
	 * this sets foodtype
	 * @param foodType
	 */
	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}
	/**
	 * this sets the food description
	 * @param foodDescription
	 */
	public void setDescription(String foodDescription) {
		this.foodDescription = foodDescription;
	}
	/**
	 * this sets foodprice
	 * @param foodPrice
	 */
	public void setPrice(double foodPrice) {
		this.foodPrice = foodPrice;
	}
	
	/**
	 * this gets foodname
	 * @return the foodname
	 */
	public String getName() {
		return foodName;
	}
	/**
	 * gets foodtype
	 * @return the foodtype
	 */
	public String getFoodType() {
		return foodType;
	}
	/**
	 * gets the Description
	 * @return the foodDescription
	 */
	public String getDescription() {
		return foodDescription;
	}
	/**
	 * gets Price from the class
	 * @return foodprice
	 */
	public double getPrice() {
		return foodPrice;
	}
	
}
