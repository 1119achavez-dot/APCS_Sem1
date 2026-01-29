/*
 *	Author: Abigail Chavez 
 *  Date: 10.29.25
*/

import java.util.Scanner;

class starter {
	public boolean checkPrime(int x){
		int num = x-1 ;
		int Num = num;
		while (Num<x && Num > 1) {
			if (x%Num == 0){
				return false;// not a prime
			}
			Num= (Num-1);
		}
			return true;  //its prime 
	}
	
	///////////////////////////////////////////////
	
	
	
			// method to print out all prime nums less then input int 
		public void printPrimes(int linmit){
			for (int i =2, int < linmit: i++){
				if (checkPrime(i)){
					System.out.println(i); //print the prime num
				}
			}
		}
			




	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("input a numer and we will print out very prime untill that num :")
		in choice = sc.nextInt();
		
		PrimeFinder finder = new PrimeFinder();
		finder.printPrimes(choice); // calliing the method 
	}
	}
	// a prime number can only be divisibal by itself 
	// or one, i have to check (boolean)
	// if a loop can run from numer down to one without 
	// beaing divinded, if it can then its prime if it 
	// cant then its not a prime 
	
	public static void main(String args[]) {
		System.out.print("Input a number and we'll print out every prime until that number:");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt ();
	}
}

}
