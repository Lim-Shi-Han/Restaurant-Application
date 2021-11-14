package database;

import java.io.Serializable;
import java.util.*;
import entity.MenuItem;
import entity.Promotion;

/**
 * This class contains methods to access menu
 * @author Dhruv
 * @version 1.1
 * @since 2021-10-23
*/
public class Menu implements Serializable{

	private static final long serialVersionUID = 1L;

	/**
	 * array of menu items in menu
	 */
	private ArrayList<MenuItem> menuItemArray = new ArrayList<>();
	/**
	 * array of promotion in menu
	 */
	private ArrayList<Promotion> promotionArray = new ArrayList<>();	
	
	/**
	 * This method returns menu item array of menu
	 * @return menuItemArray this array of menu item
	 */
	public ArrayList<MenuItem> getMenuItemArray() {
		return menuItemArray;
	}

	/**
	 * This method sets menu item array of menu
	 * @param menuItemArray set array of menu item
	 */
	public void setMenuItemArray(ArrayList<MenuItem> menuItemArray) {
		this.menuItemArray = menuItemArray;
	}

	/**
	 * This method returns promotion array of menu
	 * @return promotionArray this array of menu item
	 */	
	public ArrayList<Promotion> getPromotionArray() {
		return promotionArray;
	}

	/**
	 * This method sets promotion array of menu
	 * @param promotionArray set array of promotion
	 */
	public void setPromotionArray(ArrayList<Promotion> promotionArray) {
		this.promotionArray = promotionArray;
	}
}
