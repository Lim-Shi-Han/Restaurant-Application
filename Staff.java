package SCE2002;

import java.util.*;

public class Staff {
	private String staffName;
	private String staffGender;
	private int staffID;
	private String jobTitle;
	
	public Staff(String staffName, String staffGender, int staffID, String jobTitle){
		this.staffName =  staffName;
		this.staffGender = staffGender;
		this.staffID = staffID;
		this.jobTitle = jobTitle;
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
	
	public String jobTitle() {
		return jobTitle;
	}
}
