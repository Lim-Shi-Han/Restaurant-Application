package database;
import entity.Staff;
import java.io.Serializable;
import java.util.*;

/**
 * This class contains methods to access list of staff
 * @author Shi Han
 * @version 1.3
 * @since 2021-10-25
*/

public class StaffList implements Serializable{

    private static final long serialVersionUID = 1L;
    
    /**
     * Array of staff
     */
    private ArrayList<Staff> staffArray = new ArrayList<>();

    //This is the constructor that sets some staff in the staff list
    public StaffList(){
        Staff s1 = new Staff("Alice", "Female", 12345, "Waiter");
        Staff s2 = new Staff("Beatrice", "Female", 54321, "Chef");
        Staff s3 = new Staff("Charlie", "Male", 89675, "Waiter");
        Staff s4 = new Staff("Donald", "Male", 46564, "Chef");
        Staff s5 = new Staff("Eric", "Male", 34212, "Manager");
        staffArray.add(s1);
        staffArray.add(s2);
        staffArray.add(s3);
        staffArray.add(s4);
        staffArray.add(s5); 
    }

    /**
     * This method returns array of staff
     * @return staffArray this array of staff
     */
    public ArrayList<Staff> getStaffArray() {
        return this.staffArray;
    }

    /**
     * This method sets array of staff
     * @param staffArray set array of staff
     */
    public void setStaffArray(ArrayList<Staff> staffArray) {
        this.staffArray = staffArray;
    }

}


