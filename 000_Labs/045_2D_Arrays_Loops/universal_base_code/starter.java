/*
 *	Author:  Abby
 *  Date: 1/17/26
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
			
			Scanner sc = new Scanner (System.in);
	
			System.out.println("How many rows would you like for your 2D array?");
				int row = sc.nextInt();
				height = row ;
				
			System.out.println("How many columns would you like for your 2D array?");
				int col = sc.nextInt();
				width = col ;	
			
			System.out.println("---------------------------------------------------");

			
			int[][] box = new int [height][width];
				for(int x = 0; x < box.length; x++){
					for(int y= 0; y < box[0].length; y++){
								
					int num = (int)(Math.random() *(10-1) + 1);		
					box[x][y]= num;
					System.out.print(box[x][y] + " ");
    				}
    				System.out.println(); 
					}
					
			System.out.println("---------------------------------------------------");
			System.out.println("What row would you like to get the average of?");
			int WHATROW = sc.nextInt();
			
			double sum = 0; 
			int count = 0;
			
				for(int i = 0; i<box.length; i++ ){
				for (int j = 0; j<box[WHATROW].length; j++)
				sum += box[i][j];
				count++;
			}
			double ROWavrage = sum/count;
			System.out.println("The row average is "+ ROWavrage);
			
			//ALL
			for(int i = 0; i<box.length; i++ ){
				for (int j = 0; j<box[i].length; j++)
				sum += box[i][j];
				count++;
			}
			double ALLavrage = sum/count;
			
			System.out.println("The average of the 2D array is "+ ALLavrage);
			
			
			
			

		
	}
}
