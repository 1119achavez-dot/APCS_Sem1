/*
 *	Author:Abigail
 *  Date: 11/16/25
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		int [] num= new int [20];
		int a = 0;
		int numlook = (int)(Math.random() *(10-1) + 1);
		int duplicateCount =0;
		
		//make a loop that putsnum of i in a  random number 
		for ( int x = 0; x < num.length; x++ ){
			a= (int)(Math.random() *(10-1) + 1);
			num[x]=a;
		}

		System.out.println("--------------------------");
		System.out.println("These are the 20 numbers");
				for (int i =0; i < num.length; i++){ 
				System.out.print( num[i] + " ");
		}
		
		System.out.println(" ");
		System.out.println("--------------------------");
		System.out.println("The random number to look for is: "+ numlook);
		
		//. Find all duplicate numbers of your target number. 
		for (int i = 0; i < num.length;i++){
			if(numlook == num [i]){
				System.out.print("Duplicate found at index: ");
				System.out.println( i );
				duplicateCount++;
			}
		}
		
		System.out.println("Total number of duplicates for: " + numlook + " is " + duplicateCount ); 
		System.out.println("--------------------------");
		
		boolean found2inrow = false;
		for(int i = 0; i < num.length-1;i++){ //minus here bci want to stop comring when it reaches the end  of the numers  ?? add at bottom ? balence ??
			if(num[i]== num[i + 1]){
			System.out.println("Looking for two in a row: " + num[i] +""+ i + (i+1)); // comfused , knock off reditt misguided me 
			found2inrow = true;
			}
		}
		if(!found2inrow){
			System.out.println("no found two in a row ");
		}
	}
}
