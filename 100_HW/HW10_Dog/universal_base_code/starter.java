/*
 *	Author:abby
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Dog a = new Dog("Rintis",15);
		Dog b = new Dog("Lola",10,"poodle");
		
		boolean s = a.isSleeping();
		if (true){
			System.out.println("shh the first dog is sleeping");
		}
		else{
			System.out.println("Its awake!! *bark bark *");
	
		}
		
		b.isSleeping();
		if (true){
			System.out.println("shh the seccond dog is sleeping");
			if (s ==false){
				System.out.println("oh no the dogs are both barking now !");
			}
		}
		else{
			System.out.println("Its awake!! *bark bark *");
			if (s ==false){
				System.out.println("oh no the dogs are both barking now !");
			}
		}
		
		



	}
}
