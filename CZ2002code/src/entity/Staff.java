package entity;
/**
 * @author Dhruv
 * @version 1.2
 * @since 2021-10-22
 */
import java.io.Serializable;

public class Staff implements Serializable{
	private String staffName;
	private String staffGender;
	private int staffID;
	private String jobTitle;

	/**
	 * this is the constructor
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
	 * this gets the staff name
	 * @return String
	 */
	public String getStaffName() {
		return this.staffName;
	}

	
	/** 
	 * this sets the staff name
	 * @param staffName
	 */
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	
	/** 
	 * this gets the staff gender
	 * @return String
	 */
	public String getStaffGender() {
		return this.staffGender;
	}

	
	/** 
	 * this sets the staff gender
	 * @param staffGender
	 */
	public void setStaffGender(String staffGender) {
		this.staffGender = staffGender;
	}

	
	/** 
	 * this gets the staff id
	 * @return int
	 */
	public int getStaffID() {
		return this.staffID;
	}

	
	/** 
	 * this sets the staff id
	 * @param staffID
	 */
	public void setStaffID(int staffID) {
		this.staffID = staffID;
	}

	
	/** 
	 * this gets the job title
	 * @return String
	 */
	public String getJobTitle() {
		return this.jobTitle;
	}

	
	/** 
	 * this sets the job title
	 * @param jobTitle
	 */
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	
}

