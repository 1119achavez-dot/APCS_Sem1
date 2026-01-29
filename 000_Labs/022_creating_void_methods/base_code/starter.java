/*
 *	Author:  Abigail Chavez 
 *  Date: 10.9.25
*/

import java.util.Scanner;

class starter {
	public static void Sent(String a){
		System.out.println(a );
		return;
	}
	public static void Sent2(String a,String b){
		System.out.println(a + b );
		return;
	}
	
	
	
	
	public static void main(String args[]) {
		System.out.println("----------------------------------------");
		Scanner sc = new Scanner(System.in);

		System.out.print("Write a sentence!: ");
		String sent1= sc.nextLine ();
		System.out.print("Write a sentence!: ");
		String sent2= sc.nextLine ();
		
		System.out.println("                               ");
		System.out.println(" This is using the methods! ");
		Sent(sent1);
		Sent2(sent1,sent2);
		

		
	}
}
