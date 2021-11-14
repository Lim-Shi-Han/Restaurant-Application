package database;
import java.util.*;
import java.time.*;
import java.io.Serializable;
import entity.Order;

/**
 * This class contains methods to access sales report
 * @author Xin Kai
 * @version 1.4
 * @since 2021-10-22
*/
public class SalesReport implements Serializable{

    private static final long serialVersionUID = 1L;

    /**
     * Map of dates to sales
     */
    private Map<LocalDate, Double> dailySales = new LinkedHashMap<>(); //tracks daily sales
    /**
     * Map of dates to arrays of orders
     */
    private Map<LocalDate, ArrayList<Order>> orderHistory = new LinkedHashMap<>(); //contains all the orders

    /**
     * This method returns map of dates to sales
     * @return dailySales this map of dates to sales
     */
    public Map<LocalDate,Double> getDailySales() {
        return this.dailySales;
    }
    
    /**
     * This method sets daily sales
     * @param dailySales set map of dates to sales
     */
    public void setDailySales(Map<LocalDate,Double> dailySales) {
        this.dailySales = dailySales;
    }

    /**
     * This method returns map of dates to arrays of orders
     * @return orderHistory this map of dates to arrays of orders
     */
    public Map<LocalDate, ArrayList<Order>> getOrderHistory() {
        return this.orderHistory;
    }

    /**
     * This method sets order history
     * @param orderHistory set map of local date to arrays of order list
     */
    public void setOrderHistory(Map<LocalDate, ArrayList<Order>> orderHistory) {
        this.orderHistory = orderHistory;
    }
}



















//private double[] finalSales = new double[12];
    //private Map<String, Integer> menuItemSales = new HashMap<String, Integer>();
    //private Map<String, Integer> promotionSales = new HashMap<String, Integer>();
    
    /*
      
    public void printSalesMonth() {
      int i=0;
      int cur=0;
      for(i=0;i<finalSales.length;i++) {
        cur=i+1;
        System.out.println("Current Month: "+cur+" Sales: "+finalSales[i]);
      }
    }
    public static void main(String[] args) {
      SalesReport x = new SalesReport();
      x.totalSales(15);
      x.totalSales(30);
      x.printSalesMonth();
    }*/
