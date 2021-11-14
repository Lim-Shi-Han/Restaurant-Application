package database;

import java.io.Serializable;
import java.util.*;
import entity.MenuItem;
import entity.Promotion;

public class Menu implements Serializable{

	private static final long serialVersionUID = 1L;

	private ArrayList<MenuItem> menuItemArray = new ArrayList<>();

	private ArrayList<Promotion> promotionArray = new ArrayList<>();	
	
	public ArrayList<MenuItem> getMenuItemArray() {
		return menuItemArray;
	}

	public void setMenuItemArray(ArrayList<MenuItem> menuItemArray) {
		this.menuItemArray = menuItemArray;
	}
	
	public ArrayList<Promotion> getPromotionArray() {
		return promotionArray;
	}

	public void setPromotionArray(ArrayList<Promotion> promotionArray) {
		this.promotionArray = promotionArray;
	}
}
