package manager;
import java.util.*;
import java.time.*;
import entity.Order;
import database.SalesReport;

/**
 * This class contains a method to update sales report
 * @author Sahaj
 * @version 1.5
 * @since 2021-10-22
*/

public class SalesReportManager {

    /**
     * This method takes in order and updates the sales report based on the incoming order
     * @param order order that is submitted and to be recorded in sales report
     */
    public static void updateSalesReport(Order order) {
        
        SalesReport salesReport = (SalesReport) DatabaseManager.fileRead("salesReport.bin");

        //update dailySales
        Map<LocalDate, Double> dailySales = salesReport.getDailySales();
        try{
            double todaySales = dailySales.get(order.getDate());
            todaySales += order.getTotalPrice();
            dailySales.put(order.getDate(), todaySales);
        } catch (NullPointerException e){
            //if this is the first entry of the day
            double todaySales = order.getTotalPrice();
            dailySales.put(order.getDate(), todaySales);
        }

        //update orderHistory
        
        Map<LocalDate, ArrayList<Order>> orderHistory = salesReport.getOrderHistory();
        try{
            ArrayList<Order> orderArray = orderHistory.get(order.getDate());
            orderArray.add(order);
            orderHistory.put(order.getDate(), orderArray);
        }catch (NullPointerException e){
            ArrayList<Order> orderArray = new ArrayList<>();
            orderArray.add(order);
            orderHistory.put(order.getDate(), orderArray);
        }

        DatabaseManager.fileWrite(salesReport, "salesReport.bin");
    }

    
}
