package order;

import java.util.*;

public class StaffList {
    
    private ArrayList<Staff> staffArray = new ArrayList<>();

    public void staffCreate(){
        try{
			Staff staff = new Staff();
			staffArray.add(staff);
			System.out.println(staff.getStaffName()+" Added\n");
		}catch(InputMismatchException e){
			System.out.println("Input for ID is invalid (not an integer). Staff not added...");
		}
    }

    public void staffUpdate(){
        printStaffName();
        if(staffArray.size() == 0)return; //if no staff return
		Scanner sc = new Scanner(System.in);
		//User to choose which menu item to update
		try{
			System.out.println("Update Staff: ");
			int staffChoice = sc.nextInt();
			sc.nextLine();
			Staff staff = staffArray.get(staffChoice-1);
			staff.updateStaff();
		}catch (InputMismatchException e){
			if(e.toString().contains("Choice")){
				System.out.println("Choice of update option is invalid (not an integer). Staff not updated...");
			}
			else if(e.toString().contains("ID")){
				System.out.println("Input for ID is invalid (not an integer). Staff update stops here...");
			}
			else{
				System.out.println("Choice of staff is invalid (not an integer). Staff not updated...");
			}
		}catch (IndexOutOfBoundsException e){
			System.out.println("Selection of staff is out of range. Staff not updated...");
		}

    }

    public void staffRemove(){
        Scanner sc = new Scanner(System.in);
        int choice;
        printStaffName();
        if(staffArray.size()==0)return; //if no staff return
        try{
            System.out.println("Choose a staff to remove:");
            choice = sc.nextInt();
            staffArray.remove(choice-1);
        }catch (InputMismatchException e){
            System.out.println("Choice of staff is invalid (not an integer). Staff not removed...");
        }catch (IndexOutOfBoundsException e){
            System.out.println("Selection of staff is out of range. Staff not removed...");
        }
    }
    
    public void printStaffName(){
        if(staffArray.size() == 0){
            System.out.println("You have no staff!");
            return;
        }
        for (int i = 0; i < staffArray.size(); i++){
            System.out.println("(" + i+1 + ")" + staffArray.get(i).getStaffName());
        }
    }

}
