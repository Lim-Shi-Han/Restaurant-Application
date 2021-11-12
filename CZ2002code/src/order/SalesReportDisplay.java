package order;
import java.util.*;
import application.CalendarRef;

public class SalesReportDisplay {

    public void printSales(SalesReport salesReport){
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Do you want to view total sales by day or month:\n(1) Day\n(2) Month");
            int choice = sc.nextInt();
            sc.nextLine();
            switch(choice){
                case(1):
                    printTotalSalesDay(salesReport);
                    break;

                case(2):
                    printTotalSalesMonth(salesReport);
                    break;

                default:
                    System.out.println("Selection of timeframe for sales report out of range...");
            }
            
        }catch (InputMismatchException e){
            System.out.println("Invalid selection (use an integeer)...");
        }
    }

    public void printTotalSalesDay(SalesReport salesReport){
        int day = 0;
        int month = 0;
        int year = 0;
        try{
            Scanner sc = new Scanner(System.in);

            System.out.println("Choose the year (integer):");
            year = sc.nextInt();
            sc.nextLine();

            System.out.println("Choose the month (integer):");
            month = sc.nextInt();
            sc.nextLine();
            if (month <= 0 || month >= 13){
                System.out.println("Month out of range!");
                return;
            }
            month--; //month starts from 0 (ie January is at index 0, December at index 12)

            System.out.println("Choose the day (integer):");
            day = sc.nextInt();
            sc.nextLine();
            if (day <= 0 || day >= 31){
                System.out.println("Day out of range!");
                return;
            }

            Calendar date = new GregorianCalendar(year, month, day);
            double daySales = salesReport.getDailySales().get(date);
            
            System.out.println("The sales made on " + day + " " + CalendarRef.getMonth(month) + " " + year + ": $" + daySales);
        }
        catch (NullPointerException e){
            System.out.println("No sales was made/recorded on " + day + " " + CalendarRef.getMonth(month) + " " + year);
        }
    }

    public void printTotalSalesMonth(SalesReport salesReport){
        try{
            Scanner sc = new Scanner(System.in);

            System.out.println("Choose the year (integer):"); //choose year
            int year = sc.nextInt();
            sc.nextLine();

            System.out.println("Choose the month (integer):"); //choose month
            int month = sc.nextInt();
            sc.nextLine();
            if (month <= 0 || month >= 13){
                System.out.println("Month out of range!");
                return;
            }
            month--; //month starts from 0 (ie January is at index 0, December at index 12)
            
            double monthSales = 0;
            Iterator<Map.Entry <Calendar, Double>> mapIterator = salesReport.getDailySales().entrySet().iterator();
            while (mapIterator.hasNext()){ //for every entry in map, check if year and month matches, and if it does 
                Map.Entry <Calendar, Double> mapElement = (Map.Entry <Calendar, Double>)mapIterator.next();
                Calendar date = (Calendar) mapElement.getKey();
                if(date.get(Calendar.YEAR) == year){
                    if(date.get(Calendar.MONTH) == month){
                        monthSales += (double) mapElement.getValue();
                    }
                }
            }
            if(monthSales == 0) System.out.println("No sales were made/recorded for " + CalendarRef.getMonth(month) + " " + year);
            else System.out.println("Total sales for " + CalendarRef.getMonth(month) + " " + year + ": $" + monthSales);
        }catch (NullPointerException e){
            System.out.println("No sales was recorded on the selected month...");
        }
    }

    public void printMenuItemPromotionCount(SalesReport salesReport){
        Scanner sc = new Scanner(System.in);
        int i = 1;
        //print menu item/promotion for user to choose to review
        System.out.println("What menu item/promotion do you want to review? (Enter an integer)");
        for (Map.Entry<String, LinkedHashMap<Calendar, Integer>> MenuItemPromotionEntry: salesReport.getDailyMenuItemPromotionCount().entrySet()){
            System.out.println("(" + i + ") " + MenuItemPromotionEntry.getKey());
        }

        //user choses item
        int index = sc.nextInt();
        sc.nextLine();

        //find menu item/promotion in the linked hash map
        Iterator <Map.Entry <String, LinkedHashMap<Calendar, Integer>>> mapIterator = salesReport.getDailyMenuItemPromotionCount().entrySet().iterator();
        for(i = 0; i < index-2; i++){
            mapIterator.next();
        }
        Map.Entry <String, LinkedHashMap<Calendar, Integer>> mapElement = mapIterator.next();
        //get menu item/promotion name
        String foodName = mapElement.getKey();
        //retrieve sales count of menu item/promotion from today and the past month
        Map<Calendar, Integer> dateCountMap = mapElement.getValue();
        Iterator <Map.Entry <Calendar, Integer>> mapIterator3 = dateCountMap.entrySet().iterator();
        Calendar date = Calendar.getInstance();
        Calendar dateOneMonthAgo = Calendar.getInstance();
        dateOneMonthAgo.add(Calendar.MONTH, -1);//one month ago
        int todayCount = 0;
        int monthCount = 0;
        while(mapIterator3.hasNext()) {
            Map.Entry <Calendar, Integer> mapElement3 = (Map.Entry <Calendar, Integer>)mapIterator3.next();
            if(mapElement3.getKey() == date){
                todayCount += mapElement3.getValue();
                monthCount += mapElement3.getValue();
            }
            else if(mapElement3.getKey().before(dateOneMonthAgo)){
                monthCount += mapElement3.getValue();
            }
        }
        System.out.println("This is the sales for " + foodName + "(by count):");
        System.out.println("Today's sales: " + todayCount);
        System.out.println("Past month's sale: " + monthCount);
    }

}
