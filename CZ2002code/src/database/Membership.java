package database;

import java.util.*;
import java.io.Serializable;

/**
 * This class contains methods to access list of members
 * @author Shi Han
 * @version 1.1
 * @since 2021-10-24
*/

public class Membership implements Serializable{

	private static final long serialVersionUID = 1L;

	/**
	 * Array of phone numbers of members
	 */
	private ArrayList<Integer> phoneNum = new ArrayList<>();

	/**
	 * This is the constructor that adds some phone numbers to the membership list
	 */
	public Membership(){
		phoneNum.add(98495832);
		phoneNum.add(98765432);
		phoneNum.add(94567830);
	}

	/**
	 * This method gets the phone number array
	 * @return phoneNum this array of phone number
	 */
	public ArrayList<Integer> getPhoneNum() {
		return this.phoneNum;
	}
}



	

