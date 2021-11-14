package database;
import java.util.*;
import entity.Reservation;
import java.io.Serializable;

/**
 * This class contains methods to access list of reservations
 * @author Shi Han
 * @version 1.2
 * @since 2021-10-25
*/
public class ReservationList implements Serializable{
    
    private static final long serialVersionUID = 1L;

    /**
     * Array of reservation in reservation list
     */
    private ArrayList<Reservation> reservationArray = new ArrayList<>();

    /**
     * The method to return the array of reservations
     * @return reservationArray this array of reservation
     */
    public ArrayList<Reservation> getReservationArray() {
        return this.reservationArray;
    }

}
