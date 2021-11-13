package database;
import entity.Staff;
import java.io.Serializable;
import java.util.*;

public class StaffList implements Serializable{

    private static final long serialVersionUID = 1L;
    
    private ArrayList<Staff> staffArray = new ArrayList<>();

    public StaffList(){
        Staff s1 = new Staff("Alice", "Female", 12345, "Waiter");
        Staff s2 = new Staff("Beatrice", "Female", 54321, "Chef");
        Staff s3 = new Staff("Charlie", "Male", 89675, "Waiter");
        Staff s4 = new Staff("Donald", "Male", 46564, "Chef");
        Staff s5 = new Staff("Eric", "Male", 34212, "Manager");
    }


    public ArrayList<Staff> getStaffArray() {
        return this.staffArray;
    }

    public void setStaffArray(ArrayList<Staff> staffArray) {
        this.staffArray = staffArray;
    }
}


