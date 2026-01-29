/*
 *	Author:  Abigail chavez 
 *  Date: 11/13/25
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Random rand = new Random(); // creating the rand object here
		int [] num= new int [1000]; // setting up how many classrooms my array can hold 
		System.out.println("start:");
		int a = 0;
		
		//make a loop that putsnum of i in a  random number 
		for ( int x = 0; x < num.length; x++ ){
			a= (int)(Math.random() *(1000-1) + 1);
			num[x]=a;
			
		}
		
			for (int i =0; i < num.length; i++){ // this is so that the num of indexs changes and prits out 
				System.out.println(i + "=" + num[i]);
		}

}

}












