/*
 *	Author:  abigail chavez 
 *  Date: 10.10.25
*/

import java.util.Scanner;

class starter {
	public static double pow(double a,double b){
		double result = Math.pow(a,b);
		System.out.println(result );
		return result;
	}
	
	
	
	public static void main(String args[]) {
		System.out.println("----------------------------------------");
		Scanner sc = new Scanner(System.in);

		System.out.print("What is your base number? : ");
		double num1 = sc.nextInt ();
		System.out.print("What is your exponent number?: ");
		double num2 = sc.nextInt ();
		
		System.out.println("                               ");
		System.out.println(" Your answer is: ");
		pow(num1,num2);
		

		
	}
}
