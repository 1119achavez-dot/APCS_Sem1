/*
 *	Author: Abigail Chavez
 *  Date: 9/16/25
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner (System.in);	
	
		System.out.println("Enter 2 numbers to create a range for your random number"); 
		System.out.println(" Please enter an integer: ");
        int num1 = sc.nextInt();
        System.out.println(" Please enter another integer (bigger than the first: ");
        int num2 = sc.nextInt();
        while(num2 <num1){
        	System.out.println("pick a number bigger then your first number");
        	System.out.println(" Please enter another integer (bigger than the first): ");
        	num2 = sc.nextInt();
        }
        System.out.println(" Your range is "+ num1 +"-"+ num2);
		System.out.println(" Here are 5 numbers generated in that range:");
		double a = Math.random () * (num2 + num1)+num1;
		double b =Math.random () * (num2 + num1)+num1;
		double c = Math.random () * (num2 + num1)+num1;
		double d =Math.random () * (num2 + num1)+num1;
		double e = Math.random () * (num2 + num1)+num1;
		System.out.println( a + " , "+b+" , "+ c+ " , " + d +" , "+e);
	}
}
