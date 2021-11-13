package database;
import java.util.*;
import java.time.*;
import java.io.Serializable;
import entity.Order;

public class SalesReport implements Serializable{

    private static final long serialVersionUID = 1L;

    private Map<LocalDate, Double> dailySales = new LinkedHashMap<>(); //tracks daily sales
    private Map<LocalDate, ArrayList<Order>> orderHistory = new LinkedHashMap<>(); //contains all the orders

    public Map<LocalDate,Double> getDailySales() {
        return this.dailySales;
    }

    public void setDailySales(Map<LocalDate,Double> dailySales) {
        this.dailySales = dailySales;
    }

    public Map<LocalDate, ArrayList<Order>> getOrderHistory() {
        return this.orderHistory;
    }

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
