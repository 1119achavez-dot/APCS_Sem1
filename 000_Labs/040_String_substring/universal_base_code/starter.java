/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int i =0;

	System.out.println("Enter a word.");
	String word = sc.nextLine() ;
	int length = word.length();
	System.out.println("Letter by letter:");
	
	while (i < length ){
		int letter = i+1;
		int index = i;
		System.out.println(i + " " + word.substring(index,letter));
		i=i+1;
		
	}
	

		
	}
}
