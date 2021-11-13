package entity;
import java.util.*;
import java.io.Serializable;
import java.time.*;

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
    
    public ArrayList<MenuItem> getMenuItemArray() {
        return this.menuItemArray;
    }

    public void setMenuItemArray(ArrayList<MenuItem> menuItemArray) {
        this.menuItemArray = menuItemArray;
    }

    public ArrayList<Promotion> getPromotionArray() {
        return this.promotionArray;
    }

    public void setPromotionArray(ArrayList<Promotion> promotionArray) {
        this.promotionArray = promotionArray;
    }

    public int getCustomerPhoneNumber() {
        return this.customerPhoneNumber;
    }

    public void setCustomerPhoneNumber (int customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public int getStaffID() {
        return this.staffID;
    }

    public void setStaffID(int staffID) {
        this.staffID = staffID;
    }

    public int getTableNumber() {
        return this.tableNumber;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public double getTotalPrice() {
        return this.totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public LocalDate getDate() {
        return this.date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return this.time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }
    
    
}
