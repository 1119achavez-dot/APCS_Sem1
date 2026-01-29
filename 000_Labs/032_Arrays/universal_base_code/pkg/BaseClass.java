/*
 *	Author:  Abigail Chavez 
 *  Date: 11/8/25
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class BaseClass {
	int[]arr = new int [10]; // the refrences i was using told me to put this veribal up here insteade of right ubove the ifstament ?? 
	int a = 0;
	int b = 10;

	public BaseClass() {
		
		while(a<10){
			arr[a]=b;
			b=b-1; // this lowers the value 
			a++; // this changes the index number 
		}
		a=0; // reset 
		
	}

}

		