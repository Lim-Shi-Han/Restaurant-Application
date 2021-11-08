package customer;
import java.util.*;

public class MembershipList {
    private ArrayList<Membership> membershipArray = new ArrayList<>();
    
    public void membershipCreate(){
        try{
			Membership member = new Membership();
			membershipArray.add(member);
			System.out.println(member.getName()+" Added\n");
		}catch(InputMismatchException e){
			System.out.println("Input for ID is invalid (not an integer). Member not added...");
		}
    }

    public void membershipUpdate(){
        printMembershipName();
        if(membershipArray.size() == 0)return; //if no member return
		Scanner sc = new Scanner(System.in);
		//User to choose which member to update
		try{
			System.out.println("Update Staff: ");
			int memberChoice = sc.nextInt();
			sc.nextLine();
			Membership member = membershipArray.get(memberChoice-1);
			member.updateMembership();
		}catch (InputMismatchException e){
			if(e.toString().contains("Choice")){
				System.out.println("Choice of update option is invalid (not an integer). Membership not updated...");
			}
            else if(e.toString().contains("Phone")){
				System.out.println("Input for phone number is invalid (not an integer). Membership update stops here...");
			}            
			else if(e.toString().contains("ID")){
				System.out.println("Input for ID is invalid (not an integer). Membership update stops here...");
			}
			else{
				System.out.println("Choice of staff is invalid (not an integer). Membership not updated...");
			}
		}catch (IndexOutOfBoundsException e){
			System.out.println("Selection of membership is out of range. Membership not updated...");
		}

    }

    public void membershipRemove(){
        Scanner sc = new Scanner(System.in);
        int choice;
        printMembershipName();
        if(membershipArray.size()==0)return; //If no member return
        try{
            System.out.println("Choose a member to remove:");
            choice = sc.nextInt();
            membershipArray.remove(choice-1);
        }catch (InputMismatchException e){
            System.out.println("Choice of membership is invalid (not an integer). Membership not removed...");
        }catch (IndexOutOfBoundsException e){
            System.out.println("Selection of membership is out of range. Membership not removed...");
        }
    }

    
    public void printMembershipName(){
        if(membershipArray.size() == 0){
            System.out.println("You have no member!");
            return;
        }
        for (int i = 0; i < membershipArray.size(); i++){
            System.out.println("(" + i+1 + ")" + membershipArray.get(i).getName());
        }
    }
}
