package manager;
import java.util.*;
import java.time.*;
import entity.Order;
import database.SalesReport;
import manager.DatabaseManager;

public class SalesReportManager {

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
        ArrayList<Order> orderArray = orderHistory.get(order.getDate());
        orderArray.add(order);
        orderHistory.put(order.getDate(), orderArray);

        DatabaseManager.fileWrite(salesReport, "salesReport.bin");
    }

    
}
