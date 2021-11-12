package table;
import java.util.*;
public class Reservation {
	
	public Reservation(ReservationList reserveList, MembershipList membershipList){
		Scanner sc = new Scanner(System.in);
		System.out.println("How many pax: ");
		int pax = sc.nextInt();
		sc.nextLine();
		ArrayList <double>  availableTimes = reserveList.checkAvailability();
		System.out.println("The available timings are:");
		if(availableTimes.size() == 0){
			System.out.println("So sorry there's no more available timings for your group size for today!");
			return;
		}
		for(int i = 0; i < availableTimes.size(); i++){
			System.out.println("(" + (i+1) + ")" + availableTimes[i]);
		}
		int timingChoice = sc.nextInt();
		sc.nextLine();
		double timing = availableTimes.get(timingChoice-1);
		System.out.println("Input customer's name:");
		String customerName = sc.nextLine();
		System.out.println("Input customer's phone number:");
		String phoneNum = sc.nextInt();
		sc.nextLine();
		Bool isMember = membershipList.checkMember(phoneNum);
		reserveList.addReservation(customerName, phoneNum, isMember, );
	  }

	  public Reserve() 
	  {
	    int i=0;
	    for(i=0;i<50;i++) 
	    {
	      
	    	  if(!table[i].isOccupied()&& !table[i].isReserved())
	    	  {
	            table[i].addppl(2);  // default number 2
                    table[i].makeReservation(true);
	    	  }
	      }
	    
	  }
	  public Reservation(String date,String time,String name,int number,long contactNum, int noperson) 
	  {
	    this.resdate = date;
	    this.restime = time;
	    this.resname = name;
	    this.resnum = number;
	    this.contact = contactNum;
	    if(noperson>10)
	    {
	    	System.out.println("Table not available");
	    }
	    else if(noperson%2!=0)
	    {
	    	noperson++;
	    }
	    
	    this.nump = noperson;
	    int i;
	    for(i=0;i<50;i++) 
	    {
	      
	    	  if(!table[i].isOccupied()&& !table[i].isReserved())
	    	  {
	             table[i].addppl(noperson);
                     table[i].makeReservation(true);
	    	  }
	      
	    }
	        
	  }
}


/*package table;
import java.util.*;
public class Reservation {
 private Table[] table = new Table[50];  // 1D array of tables 
	  private String resdate;
	  private String restime;
	  private String resname;
	  private int resnum;
	  private long contact;
	  private int nump;
	  
	  public Reservation() 
	  {
	    int i=0;
	    for(i=0;i<50;i++) 
	    {
	      
	    	  if(!table[i].isOccupied()&& !table[i].isReserved())
	    	  {
	            table[i].addppl(2);  // default number 2
                    table[i].makeReservation(true);
	    	  }
	      }
	    
	  }
	  public Reservation(String date,String time,String name,int number,long contactNum, int noperson) 
	  {
	    this.resdate = date;
	    this.restime = time;
	    this.resname = name;
	    this.resnum = number;
	    this.contact = contactNum;
	    if(noperson>10)
	    {
	    	System.out.println("Table not available");
	    }
	    else if(noperson%2!=0)
	    {
	    	noperson++;
	    }
	    
	    this.nump = noperson;
	    int i;
	    for(i=0;i<50;i++) 
	    {
	      
	    	  if(!table[i].isOccupied()&& !table[i].isReserved())
	    	  {
	             table[i].addppl(noperson);
                     table[i].makeReservation(true);
	    	  }
	      
	    }
	        
	  }
}
*/
