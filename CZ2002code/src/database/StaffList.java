package database;
import entity.Staff;
import java.io.Serializable;
import java.util.*;

public class StaffList implements Serializable{
    
    private ArrayList<Staff> staffArray = new ArrayList<>();


    public ArrayList<Staff> getStaffArray() {
        return this.staffArray;
    }

    public void setStaffArray(ArrayList<Staff> staffArray) {
        this.staffArray = staffArray;
    }
}


