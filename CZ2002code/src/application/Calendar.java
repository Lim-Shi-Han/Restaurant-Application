package application;

import java.util.*;  
public class Calendar{
  
  Calendar calendar = Calendar.getInstance();
  Date reserved = calendar.getTime();
  private String timeStamp;
  private int week;
  private int month;
  private int day;
    
  public String timeStamp(){
    timeStamp = calendar.getTime());
    return timeStamp;
  }
  
  public int getWeek(){
    week = calendar.getWeekYear;
    return week;
  }
  
  public int getMonth(){
    month = calendar.get(Calendar.MONTH);// NOTE!!! : Month from 0 to 11
    return month;
  }
  
  public int getDay(){
    day = calendar.get(Calendar.DAY_OF_MONTH);
    return day;
  }
  
  public String reservedDate(int Year, int Month, int Day, int Hour, int Min){
    Calendar rDate = new GregorianCalendar(Year, Month, Day, Hour, Min);
    return rDate;
  }
  
}

//package application;
//import java.sql.Timestamp;
//public class Calendar {
//   public static void main(String[] args) {
//     Long datetime = System.currentTimeMillis();
//       Timestamp timestamp = new Timestamp(datetime);
//       System.out.println("Current Time Stamp: "+timestamp);
//   }
//}
