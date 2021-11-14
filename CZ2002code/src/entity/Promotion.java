package entity;

import java.io.Serializable;
import java.util.*;
/**
 * @author Anant
 * @version 1.3
 * @since 2021-10-22
 */
public class Promotion extends AbstractMenu{

	private String promotionName;
	private ArrayList<String> foodArray = new ArrayList<>();
	private String promotionDescription;
	private double promotionPrice;
/**
 * this is the constructor
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
	 * @return String
	 */
	/*
	public Promotion(String name, ArrayList<String> foodArray, String description, double price){
		super(name, description, price);
		this.foodArray = foodArray;
	}*/
	/**
	 * this gets the promotion name from the class
	 * @return String 
	 */
	public String getName() {
		return this.promotionName;
	}

	
	/** 
	 * this gets the food array from the class
	 * @return ArrayList<String>
	 */
	public ArrayList<String> getFoodArray() {
		return this.foodArray;
	}	

	
	/** 
	 * this gets the promotion price from the class
	 * @return double
	 */
	public double getPrice() {
		return this.promotionPrice;
	}

	
	/** 
	 * this gets the promotion description from the class
	 * @return String
	 */
	public String getDescription() {
		return this.promotionDescription;
	}

	
	/** 
	 * this sets the promotion name 
	 * @param promotionName
	 */
	public void setName(String promotionName) {
		this.promotionName = promotionName;
	}

	
	/** 
	 * this sets the food array in the class
	 * @param foodArray
	 */
	public void setFoodArray(ArrayList<String> foodArray) {
		this.foodArray = foodArray;
	}

	
	/** 
	 * this sets the promotion price for the class
	 * @param promotionPrice
	 */
	public void setPrice(double promotionPrice) {
		this.promotionPrice = promotionPrice;
	}

	
	/** 
	 * this sets the promotion description for the class
	 * @param promotionDescription
	 */
	public void setDescription(String promotionDescription) {
		this.promotionDescription = promotionDescription;
	}
	
}