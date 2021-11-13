package entity;

import java.io.Serializable;
import java.util.*;

public class Promotion implements Serializable{

	private String promotionName;
	private ArrayList<String> foodArray = new ArrayList<>();
	private String promotionDescription;
	private double promotionPrice;

	public Promotion(String promotionName, ArrayList<String> foodArray, String promotionDescription, double promotionPrice){
		this.promotionName = promotionName;
		this.foodArray = foodArray;
		this.promotionDescription = promotionDescription;
		this.promotionPrice = promotionPrice;
	}
	
	public String getPromotionName() {
		return this.promotionName;
	}

	public ArrayList<String> getFoodArray() {
		return this.foodArray;
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

	public void setFoodArray(ArrayList<String> foodArray) {
		this.foodArray = foodArray;
	}

	public void setPromotionPrice(double promotionPrice) {
		this.promotionPrice = promotionPrice;
	}

	public void setPromotionDescription(String promotionDescription) {
		this.promotionDescription = promotionDescription;
	}
	
}