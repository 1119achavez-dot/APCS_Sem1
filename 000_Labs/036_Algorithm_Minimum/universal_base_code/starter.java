/*
 *	Author:  ABigail Chavez 
 *  Date: 11/14/25
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Random rand = new Random(); // creating the rand object here
		int size =(int)(Math.random() *(200-51) + 51); // this is the rand num for the array leanth 
		int [] num= new int [size]; // putting the ran num in the array 4 leantght 
		int a = 0;
		double sum = 0;

			for ( int x = 0; x < num.length; x++ ){
				a= (int)(Math.random() *(100-1) + 1);
					num[x]=a;
		}
		
		// this is to find the min 
		int min = Integer.MAX_VALUE; // we need somthing to comaper it to so its a place holder
		for(int i = 0; i< num.length; i++){ // loop starts here 
			if(num[i]< min){
				min = num[i]; // the value smaller then max numer to exsit  is replace now with anay numer smaller 
			}
		}
		
		int max = Integer.MIN_VALUE;
			for(int i = 0; i< num.length; i++){
				if(num[i]> max){
				max = num[i];
			}
		}
			
			for(int i = 0; i< num.length; i++){
				sum += num[i];
			}
			double average = sum/ num.length;
		
		
		System.out.println("There are "+ size +" elements.");
		System.out.println("The maximum of 1000 random numbers is: "+ max);
		System.out.println("The minumum of 1000 random numbers is: "+ min);
		System.out.println("The average of 1000 random numbers is: "+ average);
		
		

}

}
