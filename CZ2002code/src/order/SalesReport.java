package order;

import java.util.*;
public class SalesReport {
  public double[] finalSales = new double[12];
  public SalesReport() {
    int i=0;
    for (i=0;i<finalSales.length;i++) {
      finalSales[i]=0;
    }
  }
  public void totalSales(double amount) {
    int month;
        GregorianCalendar date = new GregorianCalendar();      
        month = date.get(Calendar.MONTH);
    finalSales[month] = finalSales[month] + amount;
  }
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
  }
}
