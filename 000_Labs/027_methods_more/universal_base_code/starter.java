/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	static long startTime = 0;
	static ArrayList<String> arr = new ArrayList<String>();
	///////////////////////////////////////////
	public static void main(String args[]) {
		// Your code goes below here
		BankAccount x = new BankAccount();
		x.displayAccountInfo();
		System.out.println("Account 1: " + x);
		
		BankAccount a = new BankAccount();
		a.displayAccountInfo();
		System.out.println("Account 2: " + a);
		
		BankAccount y = new BankAccount("Mike W.",4900.3);
		y.displayAccountInfo();
		System.out.println("Account 3: " + y);
		

		
	}
}
