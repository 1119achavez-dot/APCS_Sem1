/*
 *	Author:  abby
 *  Date:  10/25/25
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BankAccount x = new BankAccount("Sammy K.");
		System.out.println("Account 1: " + x);
		
		BankAccount y = new BankAccount("Mike W.",4900.3);
		System.out.println("Account 2: " + y);
		
		BankAccount z = new BankAccount("Lacy R.",100000000.89);
		System.out.println("Account 3: " + z);
		
		BankAccount a = new BankAccount();
		System.out.println("Account 4: " + a);
		


		
	}
}
