package entity;

import java.util.*;
/**
 * This class stores all the attributes of a promotion
 * @author Anant
 * @version 1.3
 * @since 2021-10-22
 */
public class Promotion extends AbstractMenu{

	/**
	 * name of promotion
	 */
	private String promotionName;
	/**
	 * array of food in promotion
	 */
	private ArrayList<String> foodArray = new ArrayList<>();
	/**
	 * description of promotion
	 */
	private String promotionDescription;
	/**
	 * price of promotion
	 */
	private double promotionPrice;
/**
 * This is the constructor
 * @param promotionName
 * @param foodArray
 * @param promotionDescription
 * @param promotionPrice
 */
	public Promotion(String promotionName, ArrayList<String> foodArray, String promotionDescription, double promotionPrice){
		this.promotionName = promotionName;
		this.foodArray = foodArray;
		this.promotionDescription = promotionDescription;
		this.promotionPrice = promotionPrice;
	}

	
	/**
	 * This method gets the promotion name from the class
	 * @return promotionName this name of promotion
	 */
	public String getName() {
		return this.promotionName;
	}

	
	/** 
	 * This method gets the food array from the class
	 * @return foodArray this array of food in promotion
	 */
	public ArrayList<String> getFoodArray() {
		return this.foodArray;
	}	

	
	/** 
	 * This method gets the promotion price from the class
	 * @return promotionPrice this price of promotion
	 */
	public double getPrice() {
		return this.promotionPrice;
	}

	
	/** 
	 * This method gets the promotion description from the class
	 * @return promotionDescription this description of promotion
	 */
	public String getDescription() {
		return this.promotionDescription;
	}

	
	/** 
	 * This method sets the promotion name 
	 * @param promotionName set name of promotion
	 */
	public void setName(String promotionName) {
		this.promotionName = promotionName;
	}

	
	/** 
	 * This method sets the food array in the class
	 * @param foodArray set array of food in promotion
	 */
	public void setFoodArray(ArrayList<String> foodArray) {
		this.foodArray = foodArray;
	}

	
	/** 
	 * This method sets the promotion price for the class
	 * @param promotionPrice set price of promotion
	 */
	public void setPrice(double promotionPrice) {
		this.promotionPrice = promotionPrice;
	}

	
	/** 
	 * This method sets the promotion description for the class
	 * @param promotionDescription set description of promotion
	 */
	public void setDescription(String promotionDescription) {
		this.promotionDescription = promotionDescription;
	}
	
}