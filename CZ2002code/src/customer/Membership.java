package customer;

public class Membership {
	private String name;
	private int phoneNum;
	private int membershipId;
	public static final double discount = 10;
	
	public Membership(String name, int phoneNum, int membershipId)
	{
		this.name = name;
		this.phoneNum = phoneNum;
		this.membershipId= membershipId;
	}
	

}
