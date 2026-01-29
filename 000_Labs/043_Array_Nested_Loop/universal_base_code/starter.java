/*
 *	Author:  Abigail Chavez 
 *  Date: 1/15/26
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
	int height = 0;
	int width = 0;

	String character = ""; 
	Scanner sc = new Scanner (System.in);
	
	System.out.println("what symbol would you like to use?");
		String cha = sc.nextLine ();
		character = cha ;
	
	System.out.println("what is the witdth of your box?");
		int wid = sc.nextInt();
		width = wid;
	
	System.out.println("what is the height of your box?"); 
		int hig = sc.nextInt();
		height = hig; 
		// make a loop to to fill in each array box with the charcher
		
		String[][] box = new String [height][width];
		for(int x = 0; x < box.length; x++){
			for(int y= 0; y < box[0].length; y++){
			box[x][y]=character;
			 System.out.print(box[x][y] + " ");
    	}
    		System.out.println(); 
		}
	
	}
}
