/*
 *	Author:  abby
 *  Date: 12/5/25
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a first name and last name with a space in the middle.");
	String name = sc.nextLine() ;

	System.out.print(name.substring(name.indexOf(" ")+1));

	}
}
