package entity;
import java.io.Serializable;
import java.time.*;
/**
 * This class stores all the attributes of a reservation
 * @author Shi Han
 * @version 1.5
 * @since 2021-10-22
 */
public class Reservation implements Serializable{

	/**
	 * number of people
	 */
	int numberOfPeople;
	/**
	 * date of reservation
	 */
	LocalDate reservationDate;
	/**
	 * time of reservation
	 */
	LocalTime reservationTime;
	/**
	 * name of customer
	 */
	String customerName;
	/**
	 * phone number of customer
	 */
	int customerPhoneNumber;
	/**
	 * whether customer is member
	 */
	boolean isMember;
	/**
	 * ID of reservation
	 */
	String reservationID;
/**
 * This is a constructor with no parameter 
 */
	public Reservation(){}
/**
 * This is a constructor for the class with parameters
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
	 * This method gets the number of people for the reservation from the class
	 * @return numberOfPeople this number of people reserved for
	 */
	public int getNumberOfPeople() {
		return this.numberOfPeople;
	}

	
	/** 
	 * This method sets the number of people for the class
	 * @param numberOfPeople set number of people in the reservation
	 */
	public void setNumberOfPeople(int numberOfPeople) {
		this.numberOfPeople = numberOfPeople;
	}

	
	/** 
	 * This method gets the local date from the class
	 * @return reservationDate this date of reservation
	 */
	public LocalDate getReservationDate() {
		return this.reservationDate;
	}

	
	/** 
	 * This method sets the reservation date for the class
	 * @param reservationDate set date of reservation
	 */
	public void setReservationDate(LocalDate reservationDate) {
		this.reservationDate = reservationDate;
	}

	
	/** 
	 * This method gets the reservation time from the class
	 * @return reservationTime this time of reservation
	 */
	public LocalTime getReservationTime() {
		return this.reservationTime;
	}

	
	/** 
	 * This method sets the reservation time for the class
	 * @param reservationTime set time of reservation
	 */
	public void setReservationTime(LocalTime reservationTime) {
		this.reservationTime = reservationTime;
	}

	
	/** 
	 * This method gets the customer name for the reservation from the class
	 * @return customerName this name of customer
	 */
	public String getCustomerName() {
		return this.customerName;
	}

	
	/** 
	 * This method sets the customer name for the reservation 
	 * @param customerName set name of customer
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	
	/** 
	 * This method gets the customer phone no. from the reservation
	 * @return customerPhoneNumber this phone number of customer
	 */
	public int getCustomerPhoneNumber() {
		return this.customerPhoneNumber;
	}

	
	/** 
	 * This method sets the phone no. for the reservation
	 * @param customerPhoneNumber set phone number of customer
	 */
	public void setCustomerPhoneNumber(int customerPhoneNumber) {
		this.customerPhoneNumber = customerPhoneNumber;
	}

	
	/** 
	 * This method checks if customer is a member for the reservation
	 * @return isMember shows if customer is a member
	 */
	public boolean isIsMember() {
		return this.isMember;
	}

	
	/** 
	 * This method returns whether customer is a member 
	 * @return isMember shows if customer is a member
	 */
	public boolean getIsMember() {
		return this.isMember;
	}

	
	/** 
	 * This method sets the membership of the customer for the reservation
	 * @param isMember set customer to member or not
	 */
	public void setIsMember(boolean isMember) {
		this.isMember = isMember;
	}

	
	/** 
	 * This method gets the reservation ID
	 * @return reservationID this ID of reservation
	 */
	public String getReservationID() {
		return this.reservationID;
	}

	
	/** 
	 * This method sets the reservation ID
	 * @param reservationID set ID of reservation
	 */
	public void setReservationID(String reservationID) {
		this.reservationID = reservationID;
	}
}