package order;

import java.util.*;

public class Staff {
	private String staffName;
	private String staffGender;
	private int staffID;
	private String jobTitle;
	
	public Staff(){
		Scanner sc = new Scanner(System.in);

		//Name
		System.out.println("Input name:");
		staffName =  sc.nextLine();

		//Gender
		System.out.println("Input gender:");
		staffGender = sc.nextLine();

		//ID
		System.out.println("Input ID:");
		staffID = sc.nextInt();
		sc.nextLine();

		//Job Title
		System.out.println("Input job title:");
		jobTitle = sc.nextLine();
	}

	public void updateStaff(){
		Scanner sc = new Scanner(System.in);

		//User chooses which aspect of the promotion to update
		int updateChoice;
		do {
			try{
				System.out.println("What do you want to update:\n1.Name\n2.Gender\n3.ID\n4.Job Title\n5.Quit");
				updateChoice = sc.nextInt();
				sc.nextLine();
				switch(updateChoice){
				
					case(1): //update name
						System.out.println("Update name:");
						staffName = sc.nextLine();
						System.out.println();
						break;
						
					case(2): //update gender
						System.out.println("Update gender:");
						staffGender = sc.nextLine();
						System.out.println();
						break;
						
					case(3): //update ID
						try{
							System.out.println("Update ID:");
							staffID = sc.nextInt();
							sc.nextLine();
							System.out.println();
							break;
						}catch (InputMismatchException e){
							throw new InputMismatchException("ID");
						}
						
					case(4): //update job title
						System.out.println("Update job title:");
						jobTitle = sc.nextLine();
						System.out.println();
						break;					
						
					case(5): //user quitting
						break;
					
					default: //indexOutOfBoundsException
						System.out.println("Selection of update option is out of range! Try again!");
				}
			}catch (InputMismatchException e){
				throw new InputMismatchException("Choice");
			}
			
		}while (updateChoice!=5);	
	}
	
	public String getStaffName() {
		return staffName;
	}
	
	public String getStaffGender() {
		return staffGender;
	}
	
	public int getstaffID() {
		return staffID;
	}
	
	public String getjobTitle() {
		return jobTitle;
	}
}

