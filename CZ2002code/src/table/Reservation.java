package table;
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
