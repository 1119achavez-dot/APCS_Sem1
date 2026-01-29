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
		// i got like hella money 
		// i got like 5 bucks 
		
		System.out.println("The integer 2D array has 6 rows and 7 columns.");
		System.out.println("The 2D array is the following:");
		int hellaMoney = 5;
		int[][] arr = new int [6][7];
		
		for(int x = 0; x < arr.length; x++){
			for(int y= 0; y < arr[0].length; y++){
			arr[x][y]= hellaMoney;
			 System.out.print(arr[x][y] + " ");
    	}
    		System.out.println(); 
			System.out.println("The avrage of the array is");
			
			// i have to manuly put in the all the numbers in the 
			//arry so destroy the loop:(
			// to find the avrage i have to calculate the sum of all elements 
			// and then divide it by the total number of elements

		
	}
}
}
