package database;

import java.util.*;
import java.io.Serializable;

public class Membership implements Serializable{

	public ArrayList<Integer> phoneNum = new ArrayList<Integer>();

	public ArrayList<Integer> getPhoneNum() {
		return this.phoneNum;
	}
}


	/*
	private String name;
	private int phoneNum;
	private int membershipId;
	public static final double discount = 10;
	

	
	public Membership()
	{
		Scanner sc = new Scanner(System.in);

		//Name
		System.out.println("Input name:");
		name =  sc.nextLine();

		//Phone Number
		System.out.println("Input phone number:");
		phoneNum = sc.nextInt();
		sc.nextLine();
		
		//ID
		System.out.println("Input ID:");
		membershipId = sc.nextInt();
		sc.nextLine();
	}

	public void updateMembership(){
		Scanner sc = new Scanner(System.in);

		//User chooses which aspect of the promotion to update
		int updateChoice;
		do {
			try{
				System.out.println("What do you want to update:\n1.Name\n2.Phone Number\n3.ID\n4.Quit");
				updateChoice = sc.nextInt();
				sc.nextLine();
				switch(updateChoice){
				
					case(1): //update name
						System.out.println("Update name:");
						name = sc.nextLine();
						System.out.println();
						break;
						
					case(2): //update phone number
						try{
							System.out.println("Update phone number:");
							phoneNum = sc.nextInt();
							sc.nextLine();
							System.out.println();
							break;
						}catch (InputMismatchException e){
							throw new InputMismatchException("Phone");
						}
						
					case(3): //update ID
						try{
							System.out.println("Update ID:");
							membershipId = sc.nextInt();
							sc.nextLine();
							System.out.println();
							break;
						}catch (InputMismatchException e){
							throw new InputMismatchException("ID");
						}				
						
					case(4): //user quitting
						break;
					
					default: //indexOutOfBoundsException
						System.out.println("Selection of update option is out of range! Try again!");
				}
			}catch (InputMismatchException e){
				throw new InputMismatchException("Choice");
			}
			
		}while (updateChoice!=4);	
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

	public int getMembershipId() {
		return this.membershipId;
	}

	public void setMembershipId(int membershipId) {
		this.membershipId = membershipId;
	}
	*/
	

