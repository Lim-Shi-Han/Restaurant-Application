package database;

import java.util.*;
import java.io.Serializable;
import manager.*;

public class Membership implements Serializable{

	private static final long serialVersionUID = 1L;


	private ArrayList<Integer> phoneNum = new ArrayList<>();

	public Membership(){
		phoneNum.add(98495832);
		phoneNum.add(98765432);
		phoneNum.add(94567830);
	}

	public ArrayList<Integer> getPhoneNum() {
		return this.phoneNum;
	}
}



	

