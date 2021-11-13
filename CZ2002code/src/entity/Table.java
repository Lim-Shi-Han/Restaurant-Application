package entity;
import java.io.Serializable;
import java.util.*;

public class Table implements Serializable{
		private int number;
		private int seating;
		private boolean isOccupied;
		private boolean isMember;
		private int phoneNumber;
		private ArrayList<Reservation> reservationArray;

		public Table(int number, int seating)
		{
			this.number = number;
			this.seating = seating;
			reservationArray = new ArrayList<Reservation>();
		}

		public int getNumber() {
			return this.number;
		}

		public void setNumber(int number) {
			this.number = number;
		}

		public int getSeating() {
			return this.seating;
		}

		public void setSeating(int seating) {
			this.seating = seating;
		}

		public ArrayList<Reservation> getReservationArray() {
			return this.reservationArray;
		}

		public void setReservationArray(ArrayList<Reservation> reservationArray) {
			this.reservationArray = reservationArray;
		}

		public boolean isIsOccupied() {
			return this.isOccupied;
		}

		public boolean getIsOccupied() {
			return this.isOccupied;
		}

		public void setIsOccupied(boolean isOccupied) {
			this.isOccupied = isOccupied;
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

		public int getPhoneNumber() {
			return this.phoneNumber;
		}

		public void setPhoneNumber(int phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
}
