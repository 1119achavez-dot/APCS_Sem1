/*
 *	Author:  Abigail Chavez 
 *  Date: 9/10/25
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println();
        System.out.println(" Please input your first number:");
        int num1 = sc.nextInt();
        
        System.out.println(" Please input your seccond number:");
        int num2 = sc.nextInt();
        
        System.out.println("these are your numbers: "+ num1 +" , " + num2 );
		
		if (num1 == num2 )
			System.out.print("Your numbers are the same!"); 
		else 
			 System.out.print("Your numbers are different!"); 
		
		
	}
}
