package entity;
/**
 * This class stores all the attributes of a table
 * @author Shi Han
 * @version 1.0
 * @since 2021-10-22
 */
import java.io.Serializable;
import java.util.*;

public class Table implements Serializable{
		/**
		 * number of table
		 */
		private int number;
		/**
		 * number of seats
		 */
		private int seating;
		/**
		 * whether table is occupied
		 */
		private boolean isOccupied;
		/**
		 * whether customer is member
		 */
		private boolean isMember;
		/**
		 * phone number of customer
		 */
		private int phoneNumber;
		/**
		 * array of reservations for the table
		 */
		private ArrayList<Reservation> reservationArray;

		/**
		 * This is the constructor
		 * @param number
		 * @param seating
		 */
		public Table(int number, int seating)
		{
			this.number = number;
			this.seating = seating;
			reservationArray = new ArrayList<Reservation>();
		}

		
		/** 
		 * This method gets the table number
		 * @return number this table number
		 */
		public int getNumber() {
			return this.number;
		}

		
		/** 
		 * This method sets the table number
		 * @param number set table number
		 */
		public void setNumber(int number) {
			this.number = number;
		}

		
		/** 
		 * This method gets the seating capacity
		 * @return seating this number of seats
		 */
		public int getSeating() {
			return this.seating;
		}

		
		/** 
		 * This method sets the seating capacity
		 * @param seating number of seats in a table to be set to
		 */
		public void setSeating(int seating) {
			this.seating = seating;
		}

		
		/** 
		 * This method gets the reservation array
		 * @return ArrayList<Reservation> this reservation array
		 */
		public ArrayList<Reservation> getReservationArray() {
			return this.reservationArray;
		}

		
		/** 
		 * THis method sets the reservation array
		 * @param reservationArray reservation array to set to
		 */
		public void setReservationArray(ArrayList<Reservation> reservationArray) {
			this.reservationArray = reservationArray;
		}

		
		/** 
		 * This method checks whether the table is occupied or not
		 * @return isOccupied shows if table is occupied
		 */
		public boolean isIsOccupied() {
			return this.isOccupied;
		}

		
		/** 
		 * This method gets whether the table is occupied or not
		 * @return isOccupied shows if table is occupied
		 */
		public boolean getIsOccupied() {
			return this.isOccupied;
		}

		
		/** 
		 * This method sets whether the table is occupied or not
		 * @param isOccupied boolean type to set to
		 */
		public void setIsOccupied(boolean isOccupied) {
			this.isOccupied = isOccupied;
		}

		
		/** 
		 * This method checks if the customer is a member
		 * @return isMember shows if customer at the table is a member
		 */
		public boolean isIsMember() {
			return this.isMember;
		}

		
		/** 
		 * This method gets whether the customer is a member
		 * @return isMember shows if customer at the table is a member
		 */
		public boolean getIsMember() {
			return this.isMember;
		}

		
		/** 
		 * This method sets whether the customer is a member
		 * @param isMember boolean type to be set to
		 */
		public void setIsMember(boolean isMember) {
			this.isMember = isMember;
		}

		
		/** 
		 * This method gets the customer's phone number
		 * @return phoneNumber this phone number
		 */
		public int getPhoneNumber() {
			return this.phoneNumber;
		}

		
		/** 
		 * This method sets the customer's phone number
		 * @param phoneNumber phone number to be set to
		 */
		public void setPhoneNumber(int phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
}
