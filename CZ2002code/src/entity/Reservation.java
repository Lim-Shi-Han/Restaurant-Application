package entity;
import java.io.Serializable;
import java.time.*;

public class Reservation implements Serializable{

	int numberOfPeople;
	LocalDate reservationDate;
	LocalTime reservationTime;
	String customerName;
	int customerPhoneNumber;
	boolean isMember;
	String reservationID;

	public Reservation(){}

	public Reservation(int numberOfPeople, LocalDate reservationDate, LocalTime reservationTime, String customerName, int customerPhoneNumber, boolean isMember, String reservationID){
		this.numberOfPeople = numberOfPeople;
		this.reservationDate = reservationDate;
		this.reservationTime = reservationTime;
		this.customerName = customerName;
		this.customerPhoneNumber = customerPhoneNumber;
		this.isMember = isMember;
		this.reservationID = reservationID;
	}

	public int getNumberOfPeople() {
		return this.numberOfPeople;
	}

	public void setNumberOfPeople(int numberOfPeople) {
		this.numberOfPeople = numberOfPeople;
	}

	public LocalDate getReservationDate() {
		return this.reservationDate;
	}

	public void setReservationDate(LocalDate reservationDate) {
		this.reservationDate = reservationDate;
	}

	public LocalTime getReservationTime() {
		return this.reservationTime;
	}

	public void setReservationTime(LocalTime reservationTime) {
		this.reservationTime = reservationTime;
	}

	public String getCustomerName() {
		return this.customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getCustomerPhoneNumber() {
		return this.customerPhoneNumber;
	}

	public void setCustomerPhoneNumber(int customerPhoneNumber) {
		this.customerPhoneNumber = customerPhoneNumber;
	}

	public boolean isIsMember() {
		return this.isMember;
	}

	public boolean getIsMember() {
		return this.isMember;
	}

	public void setIsMember(boolean isMember) {
		this.isMember = isMember;
	}

	public String getReservationID() {
		return this.reservationID;
	}

	public void setReservationID(String reservationID) {
		this.reservationID = reservationID;
	}
}