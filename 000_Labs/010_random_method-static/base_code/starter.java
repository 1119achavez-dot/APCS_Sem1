/*
 *	Author:  Abigail Chavez
 *  Date: (9/8/25)
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.print("A number between 0 - 9: "); 
		int x = (int)(Math.random() * 9);
		System.out.println( x ) ;
		
		System.out.print("A number between 1 - 10: "); 
		int y = (int)(Math.random() *(10-1) + 1);
		System.out.println( y ) ;
		
		System.out.print("A number between 2.5 and 3.5: "); 
		int z = (int)(Math.random() *(3.5 -2.5) + 2.5);
		System.out.println( z ) ;
		
		System.out.print("A number between 14 and 589: "); 
		int a = (int)(Math.random() *(589 - 14 ) + 2);
		System.out.print( a ) ;

	
		
	}
}
