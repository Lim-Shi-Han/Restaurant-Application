package entity;
/**
 * @author Shi Han
 * @version 1.0
 * @since 2021-10-22
 */
import java.io.Serializable;
import java.util.*;

public class Table implements Serializable{
		private int number;
		private int seating;
		private boolean isOccupied;
		private boolean isMember;
		private int phoneNumber;
		private ArrayList<Reservation> reservationArray;

		/**
		 * this is the constructor
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
		 * this gets the table number
		 * @return int
		 */
		public int getNumber() {
			return this.number;
		}

		
		/** 
		 * this sets the table number
		 * @param number
		 */
		public void setNumber(int number) {
			this.number = number;
		}

		
		/** 
		 * this gets the seating capacity
		 * @return int
		 */
		public int getSeating() {
			return this.seating;
		}

		
		/** 
		 * this sets the seating capacity
		 * @param seating
		 */
		public void setSeating(int seating) {
			this.seating = seating;
		}

		
		/** 
		 * this gets the reservation array
		 * @return ArrayList<Reservation>
		 */
		public ArrayList<Reservation> getReservationArray() {
			return this.reservationArray;
		}

		
		/** 
		 * this sets the reservation array
		 * @param reservationArray
		 */
		public void setReservationArray(ArrayList<Reservation> reservationArray) {
			this.reservationArray = reservationArray;
		}

		
		/** 
		 * this checks whether the table is occupied or not
		 * @return boolean
		 */
		public boolean isIsOccupied() {
			return this.isOccupied;
		}

		
		/** 
		 * this gets whether the table is occupied or not
		 * @return boolean
		 */
		public boolean getIsOccupied() {
			return this.isOccupied;
		}

		
		/** 
		 * this sets whether the table is occupied or not
		 * @param isOccupied
		 */
		public void setIsOccupied(boolean isOccupied) {
			this.isOccupied = isOccupied;
		}

		
		/** 
		 * this checks if the customer is a member
		 * @return boolean
		 */
		public boolean isIsMember() {
			return this.isMember;
		}

		
		/** 
		 * this gets whether the customer is a member
		 * @return boolean
		 */
		public boolean getIsMember() {
			return this.isMember;
		}

		
		/** 
		 * this sets whether the customer is a member
		 * @param isMember
		 */
		public void setIsMember(boolean isMember) {
			this.isMember = isMember;
		}

		
		/** 
		 * this gets the customer's phone number
		 * @return int
		 */
		public int getPhoneNumber() {
			return this.phoneNumber;
		}

		
		/** 
		 * this sets the customer's phone number
		 * @param phoneNumber
		 */
		public void setPhoneNumber(int phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
}
