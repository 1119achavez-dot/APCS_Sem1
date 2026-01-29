/*
 *	Author:  abby
 *  Date: 11/8/25
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		
		int[]arr = new int [10]; // the refrences i was using told me to put this veribal up here insteade of right ubove the ifstament ?? 
		// dont put in loop 
		int a = 0;
		int b = 9;
		
		while(a<10){
			arr[a]=b;
			b=b-1; // this lowers the value 
			a++; // this changes the index number 
		}
		a=0; // reset 
		
		System.out.println("--------------------------------------");
		while(a<10){ //why should i change a to test.a ??
		System.out.print(arr[a] + ",");
		a++;
		}
		
	}
}
