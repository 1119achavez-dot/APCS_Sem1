/*
 *	Author:  abigail 
 *  Date: 11/8/25
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class BaseClass {
	 //int example = 0;
	 public static void BaseClass() {
		String [] song;
		song = new String [10];
		song[0]="Low-key, no pressure";
		song[1]="Just hang with me and my weather";
		song[2]="Rose-colored boy";
		song[3]="I hear you making all that noise";
		song[4]="About the world you want to see";
		song[5]="And oh, I'm so annoyed";
		song[6]="'Cause I just killed off what was left of";
		song[7]="The optimist in me";
		song[8]="But hearts are breaking, and wars are raging on";
		song[9]="And I have taken my glasses off";
		song[10]="You got me nervous";
		
		int a = 0;
		while(a < song.length){
			System.out.println(song[a]);
			a++;
		}

	}
}

