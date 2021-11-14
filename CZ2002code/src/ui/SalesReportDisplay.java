package ui;
import java.util.*;
import java.time.*;
import java.time.format.DateTimeParseException;

import database.SalesReport;
import manager.DatabaseManager;
import entity.Order;
import entity.MenuItem;
import entity.Promotion;

public class SalesReportDisplay {

    public static void printSales(){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Do you want to view the sales report by (1)day or (2)month:");
            int choice = sc.nextInt();
            if(choice == 1){
                printDailySales();
            }
            else if(choice == 2){
                printMonthlySales();
            }
            else{
                System.out.println("Selection out of range...");
            }
        }catch (InputMismatchException e){
            System.out.println("Choice of sales report timeframe is invalid (not an integer)...");
        }
    }

    public static void printDailySales(){

        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Input date you want to view in YYYY-MM-DD format:");
            LocalDate salesDate = LocalDate.parse(sc.nextLine());
            SalesReport salesReport = (SalesReport) DatabaseManager.fileRead("salesReport.bin");

            Map<LocalDate, Double> dailySales = salesReport.getDailySales();
            System.out.println("The sales on " + salesDate + " is " + dailySales.get(salesDate));

            Map<String, Integer> dayFoodCount = new LinkedHashMap<String, Integer>();
            Map<LocalDate, ArrayList<Order>> orderHistory = salesReport.getOrderHistory();
            ArrayList<Order> dayOrderHistory = orderHistory.get(salesDate);
            for (int i = 0; i < dayOrderHistory.size(); i++){
                ArrayList<MenuItem> menuItemArray = dayOrderHistory.get(i).getMenuItemArray();
                for(int j = 0; j < menuItemArray.size(); j++){
                    String foodName = menuItemArray.get(j).getName();
                    if(dayFoodCount.get(foodName) != null){
                        int newFoodCount = dayFoodCount.get(foodName) + 1;
                        dayFoodCount.put(foodName, newFoodCount);
                    }
                    else{
                        dayFoodCount.put(foodName, 1);
                    }
                }
                ArrayList<Promotion> promotionArray = dayOrderHistory.get(i).getPromotionArray();
                for(int j = 0; j < promotionArray.size(); j++){
                    String promotionName = promotionArray.get(j).getName();
                    if(dayFoodCount.get(promotionName) != null){
                        int newFoodCount = dayFoodCount.get(promotionName) + 1;
                        dayFoodCount.put(promotionName, newFoodCount);
                    }
                    else{
                        dayFoodCount.put(promotionName, 1);
                    }
                }
            }
            for (String name: dayFoodCount.keySet()) {
                String key = name.toString();
                String value = dayFoodCount.get(name).toString();
                System.out.println(key + ": " + value);
            }
        }catch (InputMismatchException e){
            System.out.println("Your input type was wrong!");
        }catch (NullPointerException e){
            System.out.println("Cannot input a future date!");
        }catch (DateTimeParseException e){
            System.out.println("Wrong format of date!");
        }
    }

    public static void printMonthlySales(){
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Input year you want to view in YYYY format:");
            int year = sc.nextInt();
            sc.nextLine();
            System.out.println("Input month you want to view in MM format:");
            int month = sc.nextInt();
            sc.nextLine();

            SalesReport salesReport = (SalesReport) DatabaseManager.fileRead("salesReport.bin");
            int monthlySales = 0;
            Map<LocalDate, Double> dailySales = salesReport.getDailySales();
            Set<LocalDate> dailySalesKeySet = dailySales.keySet();
            LocalDate[] dailySalesKeyArray = dailySalesKeySet.toArray( new LocalDate[ dailySalesKeySet.size() ] );
            for (int i = 0; i < dailySales.size(); i++){
                if(dailySalesKeyArray[i].getYear() == year && dailySalesKeyArray[i].getMonth().getValue() == month){
                    monthlySales += dailySales.get(dailySalesKeyArray[i]);
                }
            }
            System.out.println("The sales in " + year + "-" + month + " is $" + monthlySales);

            Map<String, Integer> monthFoodCount = new LinkedHashMap<String, Integer>();
            Map<LocalDate, ArrayList<Order>> orderHistory = salesReport.getOrderHistory();
            Set<LocalDate> orderHistoryKeySet = orderHistory.keySet();
            LocalDate[] orderHistoryKeyArray = orderHistoryKeySet.toArray( new LocalDate[ orderHistoryKeySet.size() ] );
            //go through every day
            for(int i = 0; i < orderHistory.size(); i++){
                //if the day falls within the target month
                if(orderHistoryKeyArray[i].getYear() == year && orderHistoryKeyArray[i].getMonth().getValue() == month){
                    try{
                        ArrayList<Order> dayOrderHistory = orderHistory.get(orderHistoryKeyArray[i]);
                        //go through every order for the day
                        for (int j = 0; j < dayOrderHistory.size(); j++){
                            ArrayList<MenuItem> menuItemArray = dayOrderHistory.get(j).getMenuItemArray();
                            for(int k = 0; k < menuItemArray.size(); k++){
                                String foodName = menuItemArray.get(k).getName();
                                if(monthFoodCount.get(foodName) != null){
                                    int newFoodCount = monthFoodCount.get(foodName) + 1;
                                    monthFoodCount.put(foodName, newFoodCount);
                                }
                                else{
                                    monthFoodCount.put(foodName, 1);
                                }
                            }
                            ArrayList<Promotion> promotionArray = dayOrderHistory.get(i).getPromotionArray();
                            for(int k = 0; k < promotionArray.size(); k++){
                                String promotionName = promotionArray.get(k).getName();
                                if(monthFoodCount.get(promotionName) != null){
                                    int newFoodCount = monthFoodCount.get(promotionName) + 1;
                                    monthFoodCount.put(promotionName, newFoodCount);
                                }
                                else{
                                    monthFoodCount.put(promotionName, 1);
                                }
                            }
                        }
                    }catch (IndexOutOfBoundsException e){
                        continue;
                    }
                }
            }
            for (String name: monthFoodCount.keySet()) {
                String key = name.toString();
                String value = monthFoodCount.get(name).toString();
                System.out.println(key + ": " + value);
            }
        }catch (InputMismatchException e){
            System.out.println("Your input type was wrong!");
        }catch (NullPointerException e){
            System.out.println("Cannot input a future date!");
        }catch (DateTimeParseException e){
            System.out.println("Wrong format of date!");
        }

    }


}
