package order;
import java.util.*;

public class SalesReportDisplay {

    public void printTotalSalesDay(SalesReport salesReport, Date date){
        try{
            double daySales = salesReport.getDailySales().get(date);
            System.out.println("The sales made on " + date.toString() + ": " + daySales);
        }catch (NullPointerException e){
            System.out.println("No sales was recorded on the selected date...");
        }
    }

}
