/*
 *	Author:  Abigail Chavez 
 *  Date:  
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);

	int rando = (int)(Math.random() *(1000-1) + 1);
		
		System.out.print("Pick a number between 1 - 1000: "); 
		int num1 = sc.nextInt();
		
		if(num1==rando){
			System.out.print("this is the random number!");
		}
		else
		System.out.print("This is not the random number");
		System.out.print("the number was: " + rando);
	}
}

