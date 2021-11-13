package database;
import java.util.*;
import entity.Reservation;
import java.io.Serializable;

public class ReservationList implements Serializable{
    
    private ArrayList<Reservation> reservationArray = new ArrayList<Reservation>();

    public ArrayList<Reservation> getReservationArray() {
        return this.reservationArray;
    }

}
