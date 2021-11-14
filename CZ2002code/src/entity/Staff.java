package entity;
/**
 * This class stores all the attributes of a staff
 * @author Dhruv
 * @version 1.2
 * @since 2021-10-22
 */
import java.io.Serializable;

public class Staff implements Serializable{
	/**
	 * name of staff
	 */
	private String staffName;
	/**
	 * gender of staff
	 */
	private String staffGender;
	/**
	 * ID of staff
	 */
	private int staffID;
	/**
	 * job title
	 */
	private String jobTitle;

	/**
	 * This is the constructor
	 * @param staffName
	 * @param staffGender
	 * @param staffID
	 * @param jobTitle
	 */
	public Staff(String staffName, String staffGender, int staffID, String jobTitle){
		this.staffName = staffName;
		this.staffGender = staffGender;
		this.staffID = staffID;
		this.jobTitle = jobTitle;
	}
	

	
	/** 
	 * This method gets the staff name
	 * @return staffName this staff name
	 */
	public String getStaffName() {
		return this.staffName;
	}

	
	/** 
	 * This method sets the staff name
	 * @param staffName set staff name
	 */
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	
	/** 
	 * This method gets the staff gender
	 * @return staffGender this staff gender
	 */
	public String getStaffGender() {
		return this.staffGender;
	}

	
	/** 
	 * This method sets the staff gender
	 * @param staffGender set staff gender
	 */
	public void setStaffGender(String staffGender) {
		this.staffGender = staffGender;
	}

	
	/** 
	 * This method gets the staff id
	 * @return staffID this staff id
	 */
	public int getStaffID() {
		return this.staffID;
	}

	
	/** 
	 * Thie method sets the staff id
	 * @param staffID set staff id
	 */
	public void setStaffID(int staffID) {
		this.staffID = staffID;
	}

	
	/** 
	 * This method gets the job title
	 * @return jobTitle this job title
	 */
	public String getJobTitle() {
		return this.jobTitle;
	}

	
	/** 
	 * This method sets the job title
	 * @param jobTitle set job title
	 */
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	
}

