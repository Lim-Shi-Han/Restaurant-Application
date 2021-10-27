public class Customer {
	
	private String name;
	int phoneNum;
	int tableNum;
	boolean membership;
	
	
	public Customer(String name,int phoneNum, int tableNum, boolean membership )
	{
		this.name = name;
		this.phoneNum = phoneNum;
		this.tableNum = tableNum;
		this.membership = membership;
	}
	
	public void setMember()
	{
		membership = true; 
	}
	public void removeMember()
	{
		membership = false;
	}
	
	public void assigntable(int tableNum)
	{
		this.tableNum = tableNum;
	}
	
	public float getDiscount()
	{
		if(this.membership==true)
		{
			return 10;
		}
		else
			return 0;
	}
	
	
	
	

}
