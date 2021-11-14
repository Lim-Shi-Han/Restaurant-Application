package entity;
/**
 * This class stores all the attributes of a menu item
 * @author Xin Kai
 * @version 1.0
 * @since 2021-10-22
 */

public class MenuItem extends AbstractMenu{

	/**
	 * name of menu item
	 */
	private String foodName;
	/**
	 * type of menu item
	 */
	private String foodType;
	/**
	 * description of menu item
	 */
	private String foodDescription;
	/**
	 * price of menu item
	 */
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

	/**
	 * This method assigns name of menu iteme
	 * @param foodName set name of menu item
	 */
	public void setName(String foodName) {
		this.foodName = foodName;
	}
	/**
	 * This method sets type of menu item
	 * @param foodType set type of menu item
	 */
	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}
	/**
	 * This method sets the description of menu item
	 * @param foodDescription set description of menu item
	 */
	public void setDescription(String foodDescription) {
		this.foodDescription = foodDescription;
	}
	/**
	 * This method sets price of menu item
	 * @param foodPrice set price of menu item
	 */
	public void setPrice(double foodPrice) {
		this.foodPrice = foodPrice;
	}
	
	/**
	 * This method gets foodname
	 * @return foodName this name of menu item
	 */
	public String getName() {
		return foodName;
	}
	/**
	 * Thie method gets foodtype
	 * @return foodType this type of menu item
	 */
	public String getFoodType() {
		return foodType;
	}
	/**
	 * This method gets the Description
	 * @return foodDescription this description of menu item
	 */
	public String getDescription() {
		return foodDescription;
	}
	/**
	 * This method gets Price from the class
	 * @return foodPrice this price of menu item
	 */
	public double getPrice() {
		return foodPrice;
	}
	
}
