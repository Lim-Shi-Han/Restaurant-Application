package entity;

import java.io.Serializable;

public class Staff implements Serializable{
	private String staffName;
	private String staffGender;
	private int staffID;
	private String jobTitle;

	public Staff(String staffName, String staffGender, int staffID, String jobTitle){
		this.staffName = staffName;
		this.staffGender = staffGender;
		this.staffID = staffID;
		this.jobTitle = jobTitle;
	}
	

	public String getStaffName() {
		return this.staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public String getStaffGender() {
		return this.staffGender;
	}

	public void setStaffGender(String staffGender) {
		this.staffGender = staffGender;
	}

	public int getStaffID() {
		return this.staffID;
	}

	public void setStaffID(int staffID) {
		this.staffID = staffID;
	}

	public String getJobTitle() {
		return this.jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	
}

