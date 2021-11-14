package manager;
import java.util.*;
import database.TableList;
import entity.Reservation;

/**
 * This class contains a method to add reservation into the table's reservation array
 * @author Shi Han
 * @version 1.2
 * @since 2021-10-22
*/

public class TableManager {

    /**
     * This method adds the reservation to the table's reservation array
     * @param tableNumber
     * @param reservation
     */
    public static void addReservationToTable(int tableNumber, Reservation reservation){
        TableList tableList = (TableList) DatabaseManager.fileRead("table.bin");
        ArrayList<Reservation> reservationArray = tableList.getTableList().get(tableNumber).getReservationArray();
        reservationArray.add(reservation);
        DatabaseManager.fileWrite(tableList, "table.bin");
    }
    
}
