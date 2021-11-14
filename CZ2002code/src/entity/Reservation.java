package entity;
import java.io.Serializable;
import java.time.*;
/**
 * @author Shi han
 * @version 1.5
 * @since 2021-10-22
 */
public class Reservation implements Serializable{

	int numberOfPeople;
	LocalDate reservationDate;
	LocalTime reservationTime;
	String customerName;
	int customerPhoneNumber;
	boolean isMember;
	String reservationID;
/**
 * constructor with no parameter 
 */
	public Reservation(){}
/**
 * constructor for the class with parameters
 * @param numberOfPeople
 * @param reservationDate
 * @param reservationTime
 * @param customerName
 * @param customerPhoneNumber
 * @param isMember
 * @param reservationID
 */
	public Reservation(int numberOfPeople, LocalDate reservationDate, LocalTime reservationTime, String customerName, int customerPhoneNumber, boolean isMember, String reservationID){
		this.numberOfPeople = numberOfPeople;
		this.reservationDate = reservationDate;
		this.reservationTime = reservationTime;
		this.customerName = customerName;
		this.customerPhoneNumber = customerPhoneNumber;
		this.isMember = isMember;
		this.reservationID = reservationID;
	}

	
	/** 
	 * this gets the number of people for the reservation from the class
	 * @return int
	 */
	public int getNumberOfPeople() {
		return this.numberOfPeople;
	}

	
	/** 
	 * this sets the number of people for the class
	 * @param numberOfPeople
	 */
	public void setNumberOfPeople(int numberOfPeople) {
		this.numberOfPeople = numberOfPeople;
	}

	
	/** 
	 * this gets the local date from the class
	 * @return LocalDate
	 */
	public LocalDate getReservationDate() {
		return this.reservationDate;
	}

	
	/** 
	 * this sets the reservation date for the class
	 * @param reservationDate
	 */
	public void setReservationDate(LocalDate reservationDate) {
		this.reservationDate = reservationDate;
	}

	
	/** 
	 * this gets the reservation time from the class
	 * @return LocalTime
	 */
	public LocalTime getReservationTime() {
		return this.reservationTime;
	}

	
	/** 
	 * this sets the reservation time for the class
	 * @param reservationTime
	 */
	public void setReservationTime(LocalTime reservationTime) {
		this.reservationTime = reservationTime;
	}

	
	/** 
	 * this gets the customer name for the reservation from the class
	 * @return String
	 */
	public String getCustomerName() {
		return this.customerName;
	}

	
	/** 
	 * this sets the customer name for the reservation 
	 * @param customerName
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	
	/** 
	 * this gets the customer phone no. from the reservation
	 * @return int
	 */
	public int getCustomerPhoneNumber() {
		return this.customerPhoneNumber;
	}

	
	/** 
	 * this sets the phone no. for the reservation
	 * @param customerPhoneNumber
	 */
	public void setCustomerPhoneNumber(int customerPhoneNumber) {
		this.customerPhoneNumber = customerPhoneNumber;
	}

	
	/** 
	 * this checks if customer is a member for the reservation
	 * @return boolean
	 */
	public boolean isIsMember() {
		return this.isMember;
	}

	
	/** 
	 * this returns whether customer is a member 
	 * @return boolean
	 */
	public boolean getIsMember() {
		return this.isMember;
	}

	
	/** 
	 * this sets the membership of the customer for the reservation
	 * @param isMember
	 */
	public void setIsMember(boolean isMember) {
		this.isMember = isMember;
	}

	
	/** 
	 * this gets the reservation ID
	 * @return String
	 */
	public String getReservationID() {
		return this.reservationID;
	}

	
	/** 
	 * this sets the reservation ID
	 * @param reservationID
	 */
	public void setReservationID(String reservationID) {
		this.reservationID = reservationID;
	}
}