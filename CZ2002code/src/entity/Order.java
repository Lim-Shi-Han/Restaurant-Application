package entity;
import java.util.*;
import java.io.Serializable;
import java.time.*;
/**
 * This class stores all the attributes of an order
 * @author Sahaj
 * @version 1.2
 * @since 2021-10-22
 */

public class Order implements Serializable{
    /**
     * menu item array
     */
    private ArrayList<MenuItem> menuItemArray = new ArrayList<>();
    /**
     * promotion array
     */
	private ArrayList<Promotion> promotionArray = new ArrayList<>();
    /**
     * phone number of customer
     */
    int customerPhoneNumber;
    /**
     * ID of staff
     */
    int staffID;
    /**
     * table number
     */
    int tableNumber;
    /**
     * total price
     */
    double totalPrice;
    /**
     * whether customer is member
     */
    boolean isMember;
    /**
     * date
     */
    LocalDate date;
    /**
     * time
     */
    LocalTime time;
/**
 * This is the constructor for the class
 * @param menuItemArray
 * @param promotionArray
 * @param customerPhoneNumber
 * @param staffID
 * @param tableNumber
 * @param totalPrice
 * @param isMember
 */
    public Order(ArrayList<MenuItem> menuItemArray, ArrayList<Promotion> promotionArray, int customerPhoneNumber, int staffID, int tableNumber, double totalPrice, boolean isMember){

        this.menuItemArray = menuItemArray;
        this.promotionArray = promotionArray;
        this.customerPhoneNumber = customerPhoneNumber;
        this.staffID = staffID;
        this.tableNumber = tableNumber;
        this.totalPrice = totalPrice;
        this.isMember = isMember;
        this.date = LocalDate.now();
        this.time = LocalTime.now();

    }
    /**
     * This method gets the menu item array from the class
     * @return menuItemArray this menu item array
     */
    public ArrayList<MenuItem> getMenuItemArray() {
        return this.menuItemArray;
    }
    /**
     * This method sets the menu item array
     * @param menuItemArray set menu item array of order
     */
    public void setMenuItemArray(ArrayList<MenuItem> menuItemArray) {
        this.menuItemArray = menuItemArray;
    }
    
    
    /** 
     * This method gets the promotion array
     * @return promotionArray this promotion array of order
     */
    public ArrayList<Promotion> getPromotionArray() {
        return this.promotionArray;
    }

    
    /** 
     * This method is sets the promotion array
     * @param promotionArray set promotion array of order
     */
    public void setPromotionArray(ArrayList<Promotion> promotionArray) {
        this.promotionArray = promotionArray;
    }

    
    /** 
     * This method gets the customer phone number
     * @return customerPhoneNumber this phone number of customer
     */
    public int getCustomerPhoneNumber() {
        return this.customerPhoneNumber;
    }

    
    /** 
     * This method sets the customer phone no.
     * @param customerPhoneNumber set phone number of customer
     */
    public void setCustomerPhoneNumber (int customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    
    /** 
     * This method gets staffID from the class
     * @return staffID this ID of staff taking order
     */
    public int getStaffID() {
        return this.staffID;
    }

    
    /** 
     * This method sets staffID
     * @param staffID set staffID of staff taking order
     */
    public void setStaffID(int staffID) {
        this.staffID = staffID;
    }

    
    /** 
     * This method gets the table no.
     * @return tableNumber this table number of order
     */
    public int getTableNumber() {
        return this.tableNumber;
    }

    
    /** 
     * This method sets the tableNumber
     * @param tableNumber set table number of order
     */
    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    
    /** 
     * This method gets the total price
     * @return totalPrice this total price of order
     */
    public double getTotalPrice() {
        return this.totalPrice;
    }

    
    /** 
     * This method sets total price for the order
     * @param totalPrice set total price of order
     */
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    
    /** 
     * This method gets date of the order
     * @return date this date of order
     */
    public LocalDate getDate() {
        return this.date;
    }

    
    /** 
     * This method sets the date for the order
     * @param date set date of order
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }

    
    /** 
     * This method gets the order time
     * @return time this time of order
     */
    public LocalTime getTime() {
        return this.time;
    }

    
    /** 
     * This method sets the order time
     * @param time set time of order
     */
    public void setTime(LocalTime time) {
        this.time = time;
    }
    
    
}
