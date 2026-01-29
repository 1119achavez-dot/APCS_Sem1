/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner (System.in);
	int my_num = (int)(Math.random() *(1000-1) + 1);
	
		System.out.println("Please enter a number between 1 and 1000: "); 
		int num = sc.nextInt ();
		
		while(num != my_num){
			
		if (num > my_num){
			System.out.println("Your number was too high, guess again."); 	
		}
		if (num < my_num){
			System.out.println("Your number was too low, guess again."); 	
		}
			System.out.println("Please enter a number between 1 and 1000: "); 
				int num2 = sc.nextInt ();
				num= num2;
		}
		if (num == my_num){
			System.out.println("Your number is the correct awser!!"); 	
		}
	}
}
