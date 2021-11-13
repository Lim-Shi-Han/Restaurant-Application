package customer;

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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhoneNum() {
		return this.phoneNum;
	}

	public void setPhoneNum(int phoneNum) {
		this.phoneNum = phoneNum;
	}

	public int getTableNum() {
		return this.tableNum;
	}

	public void setTableNum(int tableNum) {
		this.tableNum = tableNum;
	}

	public boolean isMembership() {
		return this.membership;
	}

	public boolean getMembership() {
		return this.membership;
	}

	public void setMembership(boolean membership) {
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
