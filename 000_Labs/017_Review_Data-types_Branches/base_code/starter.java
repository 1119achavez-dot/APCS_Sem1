/*
 *	Author:  abigail chavez 
 *  Date: 9/26/25
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int given_points = 20;
		int sub_point = 0;
		int strength_points = 0;
		int dexterity_points = 0;
		int intelligence_points = 0;
		int charisma_points = 0;
		
		System.out.println("What is your name? "); 
			String name = sc.nextLine ();
			
		System.out.println("What is your title? Ex: Slayer of Dragons  "); 
			String title = sc.nextLine ();
		
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
			
		System.out.print("You have 20 skill points to spend in the following:");
		System.out.println("Strength, Dexterity, Intelligence, and Charisma. Spend them wisely.");
		
		System.out.println("Strength (1-10):");
		int userpoints = sc.nextInt();
			if ( userpoints <= 10){
				given_points= (given_points - userpoints);
				strength_points= (given_points);
				System.out.println("You have " + given_points +" points left to spend");
			}
				else {
					System.out.println("Please input a smaller value. Strength (1-10): ");
						int userpoints1_5 = sc.nextInt();
						given_points= (given_points - userpoints1_5);
						strength_points= (given_points);
						System.out.println("You have " + given_points +" points left to spend");
			}
			
		System.out.println("Dexterity (1-10):");
		int userpoints2 = sc.nextInt();
			if ( userpoints2 <= 10){
				given_points= (given_points - userpoints2);
				dexterity_points =( given_points);
				System.out.println("You have " + given_points +" points left to spend");
			}
				else {
					System.out.println("Please input a smaller value. Dexterity (1-10): ");
						int userpoints2_5 = sc.nextInt();
						given_points= (given_points - userpoints2_5);
						dexterity_points =( given_points);
						System.out.println("You have " + given_points +" points left to spend");
			}
			
		
		System.out.println("Intelligence (1-10):");
		int userpoints3 = sc.nextInt();
			if ( userpoints3 <= 10 && userpoints3 <= given_points){
				given_points= (given_points - userpoints3);
				intelligence_points = (given_points );
				System.out.println("You have " + given_points +" points left to spend");
			}
				else {
					System.out.println("Please input a smaller value. Intelligence (1-10): ");
						int userpoints3_5 = sc.nextInt();
						given_points= (given_points - userpoints3_5);
						intelligence_points = (given_points );
						System.out.println("You have " + given_points +" points left to spend");
			
			}
			
		
		System.out.println("Charisma (1-10):");
		int userpoints4 = sc.nextInt();
			if ( userpoints4 <= 10){
				given_points= (given_points - userpoints4);
				charisma_points = ( given_points);
				System.out.println("You have " + given_points +" points left to spend next time");
			}
				else {
					System.out.println("Please input a smaller value. Charisma (1-10): ");
						int userpoints4_5 = sc.nextInt();
						given_points= (given_points - userpoints4_5);
						charisma_points = ( given_points);
						System.out.println("You have " + given_points +" points left to spend next time!");
			}
			
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("You are " + name + ", the " + title +" of CVHS.");
		System.out.println("You're a" + Pick + "with the following stats!");
		System.out.println("Strength - " + strength_points);
		System.out.println("Dexterity - " + dexterity_points);
		System.out.println("Intelligence - " + intelligence_points);
		System.out.println("Charisma - " + charisma_points);
			}
		
		
		
	}
			