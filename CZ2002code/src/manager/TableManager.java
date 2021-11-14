package manager;
import java.util.*;
import database.TableList;
import entity.Reservation;

public class TableManager {

    public static void addReservationToTable(int tableNumber, Reservation reservation){
        TableList tableList = (TableList) DatabaseManager.fileRead("table.bin");
        ArrayList<Reservation> reservationArray = tableList.getTableList().get(tableNumber).getReservationArray();
        reservationArray.add(reservation);
        DatabaseManager.fileWrite(tableList, "table.bin");
    }
    
}
