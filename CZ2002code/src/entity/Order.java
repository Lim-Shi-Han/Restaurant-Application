package entity;
import java.util.*;
import java.io.Serializable;
import java.time.*;
/**
 * Represents the order detials 
 * @author Sahaj
 * @version 1.2
 * @since 2021-10-22
 */

public class Order implements Serializable{
    private ArrayList<MenuItem> menuItemArray = new ArrayList<>();
	private ArrayList<Promotion> promotionArray = new ArrayList<>();
    int customerPhoneNumber;
    int staffID;
    int tableNumber;
    double totalPrice;
    boolean isMember;
    LocalDate date;
    LocalTime time;
/**
 * this is the constructor for the class
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
     * this gets the menu item array from the class
     * @return menuItem array
     */
    public ArrayList<MenuItem> getMenuItemArray() {
        return this.menuItemArray;
    }
    /**
     * this sets the menu item array
     * @param menuItemArray
     */
    public void setMenuItemArray(ArrayList<MenuItem> menuItemArray) {
        this.menuItemArray = menuItemArray;
    }
    
    
    /** 
     * this gets the promotion array
     * @return ArrayList<Promotion>
     */
    public ArrayList<Promotion> getPromotionArray() {
        return this.promotionArray;
    }

    
    /** 
     * this is sets the promotion array
     * @param promotionArray
     */
    public void setPromotionArray(ArrayList<Promotion> promotionArray) {
        this.promotionArray = promotionArray;
    }

    
    /** 
     * this gets the customer phone number
     * @return int
     */
    public int getCustomerPhoneNumber() {
        return this.customerPhoneNumber;
    }

    
    /** 
     * this sets the customer phone no.
     * @param customerPhoneNumber
     */
    public void setCustomerPhoneNumber (int customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    
    /** 
     * this gets staffID from the class
     * @return int
     */
    public int getStaffID() {
        return this.staffID;
    }

    
    /** 
     * this sets staffID
     * @param staffID
     */
    public void setStaffID(int staffID) {
        this.staffID = staffID;
    }

    
    /** 
     * this gets the table no.
     * @return int
     */
    public int getTableNumber() {
        return this.tableNumber;
    }

    
    /** 
     * this sets the tableNumber
     * @param tableNumber
     */
    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    
    /** 
     * this gets the total price
     * @return double
     */
    public double getTotalPrice() {
        return this.totalPrice;
    }

    
    /** 
     * this sets total price for the order
     * @param totalPrice
     */
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    
    /** 
     * this gets date of the order
     * @return LocalDate
     */
    public LocalDate getDate() {
        return this.date;
    }

    
    /** 
     * this sets the date for the order
     * @param date
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }

    
    /** 
     * this gets the order time
     * @return LocalTime
     */
    public LocalTime getTime() {
        return this.time;
    }

    
    /** 
     * this sets the order time
     * @param time
     */
    public void setTime(LocalTime time) {
        this.time = time;
    }
    
    
}
