package entity;

import java.io.Serializable;
import java.util.*;

public class Promotion extends AbstractMenu implements Serializable{

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

	/*
	public Promotion(String name, ArrayList<String> foodArray, String description, double price){
		super(name, description, price);
		this.foodArray = foodArray;
	}*/
	
	public String getName() {
		return this.promotionName;
	}

	public ArrayList<String> getFoodArray() {
		return this.foodArray;
	}	

	public double getPrice() {
		return this.promotionPrice;
	}

	public String getDescription() {
		return this.promotionDescription;
	}

	public void setName(String promotionName) {
		this.promotionName = promotionName;
	}

	public void setFoodArray(ArrayList<String> foodArray) {
		this.foodArray = foodArray;
	}

	public void setPrice(double promotionPrice) {
		this.promotionPrice = promotionPrice;
	}

	public void setDescription(String promotionDescription) {
		this.promotionDescription = promotionDescription;
	}
	
}