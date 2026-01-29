/*
 *	Author: Abigail 
 *  Date: 9/20/25
 * 	Collaborator:
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int r = (int)(Math.random()*3);
		if(r==0){
			System.out.println("The goal of the game is to guess a random word with only two hints! ");
			System.out.println("This is the first hint: ");
			System.out.println("It has feathers ");
			System.out.println("What is your guess? "); 
			String firstPick = sc.nextLine ();
			
			if ((firstPick.equals("bird")) || (firstPick.equals("Bird"))){
				System.out.println("correct!");
			}
			if ((!(firstPick.equals("bird"))) && (!(firstPick.equals("Bird")))){
				System.out.println("wrong!");
				System.out.println("heres another clue:");
				System.out.println("it is known as the red planet!");
				System.out.println("What is your guess? "); 
				firstPick = sc.nextLine ();
				if (((firstPick.equals("bird"))) || ((firstPick.equals("Bird")))){
					System.out.println("correct!");
				}
				if ((!(firstPick.equals("bird"))) && (!(firstPick.equals("Bird")))){
					System.out.println("try again nexttime :(" );
					System.out.println("the awnser was bird");
				}
			}
		}
			
		else if (r==1){
			
			System.out.println("The goal of the game is to guess a random word with only two hints! ");
			System.out.println("This is the first hint: ");
			System.out.println("It is a planet ");
			System.out.println("What is your guess? "); 
			String seccondPick = sc.nextLine ();
			
			if ((seccondPick.equals("mars")) || (seccondPick.equals("Mars"))){
				System.out.println("correct!");
			}
			
			if ((!(seccondPick.equals("mars"))) && (!(seccondPick.equals("Mars")))){
				System.out.println("wrong!");
				System.out.println("heres another clue:");
				System.out.println("It is known as the red planet!");
				System.out.println("What is your guess? "); 
				seccondPick = sc.nextLine ();
				if (((seccondPick.equals("mars"))) || ((seccondPick.equals("mars")))){
					System.out.println("correct!");
				}
				if ((!(seccondPick.equals("mars"))) && (!(seccondPick.equals("mars")))){
					System.out.println("try again nexttime :(" );
					System.out.println("the awnser was mars");
				}
			}
		}
			
		else{
			System.out.println("The goal of the game is to guess a random word with only two hints! ");
			System.out.println("This is the first hint: ");
			System.out.println("It is a fruit ");
			System.out.println("What is your guess? "); 
			String tPick = sc.nextLine ();
			
			if ((tPick.equals("mango")) || (tPick.equals("Mango"))){
				System.out.println("correct!");
			}
			
			if ((!(tPick.equals("mango"))) && (!(tPick.equals("Mango")))){
				System.out.println("wrong!");
				System.out.println("heres another clue:");
				System.out.println("It yellow and super sweet!");
				System.out.println("What is your guess? "); 
				tPick = sc.nextLine ();
				if (((tPick.equals("mango"))) || ((tPick.equals("Mango")))){
					System.out.println("correct!");
				}
				if ((!(tPick.equals("mango"))) && (!(tPick.equals("Mango")))){
					System.out.println("try again nexttime :(" );
					System.out.println("the awnser was mango");
				}
			}
		}
			
	}
}
