/*
 *	Author:  Abigail Chavez
 *  Date: 9/24/25
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
		
			
			System.out.println("Would you like to be a Wizard, Warrior, or Rogue?  "); 
			String Pick = sc.nextLine ();
			
				if ((Pick.equals("Wizard")) || (Pick.equals("wizard"))){
				System.out.println("You've chosen the Wizard! Excelsior!!");
			}
			
				if ((Pick.equals("Warrior")) || (Pick.equals("warrior"))){
				System.out.println("you've chosen the Warrior! For honor!!");
			}
			
				if ((Pick.equals("Rogue")) || (Pick.equals("rogue"))){
				System.out.println("you've chosen the Rogue! How cunning!!");
			}
			
			else {
				System.out.println("You've decided not to chose a role. Rerun program. ");
			}
	}
}			