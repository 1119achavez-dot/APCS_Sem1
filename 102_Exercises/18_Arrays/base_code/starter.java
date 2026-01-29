/*
 *	Author: Abigail 
 *  Date:11/6.25
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	////////////////////////////////////////////
		int[]one = new int [1001];
		int len1=one.length;
		int i = 0;
		int x = 0;
		while(i<1001){
			one[i]=x;
			x=x+3; // this dose the value 
			i++; // this changes the index number 
		}
		
		i = 0;
		
		System.out.println("--------------------------------------");
		while(i<one.length){
		System.out.print(one[i] + ",");
		i++;
		}
		System.out.println("    ");
		System.out.println("    ");
		System.out.println("    ");
	/////////////////////////////////////////////
		int[]two = new int [1001];
		int len2=two.length;
		int a = 0;
		int b = 1001;
		while(a<1001){
			two[a]=b;
			b=b-1; // this dose the value 
			a++; // this changes the index number 
		}
		a=0;
		
		System.out.println("--------------------------------------");
		while(a<two.length){
		System.out.print(two[a] + ",");
		a++;
		}
		
		 
	}
}
