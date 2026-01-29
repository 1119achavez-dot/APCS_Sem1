/*
 *	Author:  Abigail chavez
 *  Date: 10.28.25
*/

package pkg;
import java.util.*;

public class BankAccount {
	// -------GLOBAL VARIABLES-------
	private String owner;
	private int account_num;
	private double balence;
	private boolean isActive;
	
	private static int NextAccountNum = (int)(Math.random()*1000)-50;
	//math.random is a double so we have to cast it as an int 

	// -------CONSTRUCTORS-------
	public BankAccount(){ // defualt constructor 
		owner = "unknown";
		account_num = NextAccountNum;
		//the reason why its acount_num = Nextaccountnum and not another varibal is bc... 
		// the computer knows what the acount numer is BASED on the random number and THEN ...
		// it adds one to the account num to create the next num that will be used when it runs ...
		// although the diffrent objects are on diffrent "layers" and dont interact the nextaccount thing connects them :)
		balence = 0;
		isActive = true;
		NextAccountNum = NextAccountNum +1;
	}
	public BankAccount(String o){ //owner THIS ONE HAS TO TAKE IN A STRING LOOKK aT ART
	owner = o;
	account_num = NextAccountNum;
	balence = 0;
	isActive = true;
	NextAccountNum = NextAccountNum +1;
	}
	
	
	public BankAccount(String o,double b){ //The Owner and Initial Deposit constructor
	owner = o;
	account_num = NextAccountNum;
	balence = b;
	isActive = true;
	NextAccountNum = NextAccountNum +1;
	}
	//Make sure when you create a bank account and assign a number, that

// account number should no longer be available. <- what dose thsi mean 0*0

	// -------METHODS-------
	public void checkBalance(){
	}
	public void displayAccountInfo(){
		System.out.println( "owner:"+owner +",account:"+ account_num +",balence:"+balence+",Active:"+isActive);
	}
}
