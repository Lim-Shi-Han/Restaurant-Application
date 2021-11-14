package database;
import java.util.*;
import entity.Reservation;
import java.io.Serializable;

public class ReservationList implements Serializable{
    
    private static final long serialVersionUID = 1L;

    private ArrayList<Reservation> reservationArray = new ArrayList<>();

    public ArrayList<Reservation> getReservationArray() {
        return this.reservationArray;
    }

}
