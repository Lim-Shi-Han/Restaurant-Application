package order;
import java.util.*;
import menu.*;


public class SalesReport {
    
    private Map<Date, Double> dailySales = new HashMap<Date, Double>(); //tracks daily sales
    private ArrayList<Order> orderHistory = new ArrayList<>(); //contains all the orders
    private Map<String, Map<Date, Integer>> dailyMenuItemPromotionCount = new HashMap<String, Map<Date, Integer>>(); //contains menu items and promotions and stores number of items sold per day

    public void updateSalesReport(Order order) {

        Date orderDate = order.getDate();

        orderHistory.add(order); //add order to array of order

        if (dailySales.containsKey(orderDate)){ //add sales from current order to total sales for the day
            dailySales.put(orderDate, dailySales.get(orderDate) + order.getTotalPrice());
        }
        else{ //create new entry for the day
            dailySales.put(orderDate, order.getTotalPrice());
        }

        ArrayList<MenuItem> orderMenuItemArray = order.getMenuItemArray();
        for(int i = 0; i < orderMenuItemArray.size(); i++){ //runs through all menu item
            String orderMenuItemName = orderMenuItemArray.get(i).getFoodName(); 
            if(dailyMenuItemPromotionCount.containsKey(orderMenuItemName)){ //check if menu item has a record in sales report
                if(dailyMenuItemPromotionCount.get(orderMenuItemName).containsKey(orderDate)){ //check if menu item has been added on orderDate
                    dailyMenuItemPromotionCount.get(orderMenuItemName).put(orderDate, dailyMenuItemPromotionCount.get(orderMenuItemName).get(orderDate)+1); //if the above if statements were satisfied, add one to count for the day for the menu item
                }
                else{
                    dailyMenuItemPromotionCount.get(orderMenuItemName).put(orderDate, 1); //create first record for that day for the particular menu item
                }
            }
            else{ //create first record of menu item
                dailyMenuItemPromotionCount.put(orderMenuItemName, null);
                dailyMenuItemPromotionCount.get(orderMenuItemName).put(orderDate, 1);
            }
        }

        ArrayList<Promotion> orderPromotionArray = order.getPromotionArray();
        for(int i = 0; i < orderPromotionArray.size(); i++){ //runs through all promotion
            String orderPromotionName = orderPromotionArray.get(i).getPromotionName(); 
            if(dailyMenuItemPromotionCount.containsKey(orderPromotionName)){ //check if promotion has a record in sales report
                if(dailyMenuItemPromotionCount.get(orderPromotionName).containsKey(orderDate)){ //check if promotion has been added on orderDate
                    dailyMenuItemPromotionCount.get(orderPromotionName).put(orderDate, dailyMenuItemPromotionCount.get(orderPromotionName).get(orderDate)+1); //if the above if statements were satisfied, add one to count for the day for the promotion
                }
                else{
                    dailyMenuItemPromotionCount.get(orderPromotionName).put(orderDate, 1); //create first record for that day for the particular promotion
                }
            }
            else{ //create first record of promotion
                dailyMenuItemPromotionCount.put(orderPromotionName, null);
                dailyMenuItemPromotionCount.get(orderPromotionName).put(orderDate, 1);
            }
        }

        System.out.println("Order added to order history");
    }

    public Map<Date,Double> getDailySales() {
        return this.dailySales;
    }

    public ArrayList<Order> getOrderHistory() {
        return this.orderHistory;
    }

    public Map<String,Map<Date,Integer>> getDailyMenuItemPromotionCount() {
        return this.dailyMenuItemPromotionCount;
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
