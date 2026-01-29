/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner (System.in);
	
		System.out.println(" Please enter your name: ");
		String name = sc.nextLine ();
		System.out.println(" Please enter an integer: ");
		int num = sc.nextInt ();
		int unit = 0;
		while(unit != num){
			System.out.println(unit + ")" + name);
			unit= unit + 1;
		}
		System.out.println("bye bye");

		
	}
}
