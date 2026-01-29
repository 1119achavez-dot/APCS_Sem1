/*
 *	Author:Abigail Chavez
 *  Date:10/6/25
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		int start_amount = 100;
		int current_amount = 0;
		int unit = 0;

		
		System.out.println("Slot Machine Rules: "); 
		System.out.println("1. Each player starts with $100. "); 
		System.out.println("2. Input a wager less than your total amount of money. "); 
		System.out.println("3. The slot machine will roll 3 numbers from 1 to 10. "); 
		System.out.println("	a. If two numbers match, you double your money. "); 
		System.out.println("	b. If three numbers match, you triple your money. "); 
		System.out.println("	c. If none match, you lose your money. "); 
		System.out.println("----------------------------------------------------------- "); 
		
		while(start_amount != unit){
			System.out.println("Would you like to play the slots? (Yes/yes/Y/y OR No/no/N/n : "); 
			String start_play = sc.nextLine ();
			
		if (start_play.equals("Yes") || start_play.equals("yes") || start_play.equals("Y") || start_play.equals("y")){
			System.out.println("You have $" +  start_amount + " How much would you like to wager? "); 
			int num = sc.nextInt ();
			sc.nextLine()
			
				if (num <= start_amount){
				current_amount = ( start_amount - num) ;
				System.out.println("Great! Let's play!!!");
				System.out.println("Your rolls are: ");
				System.out.println("_______________________ ");
				
				int x = (int)(Math.random() *(10-1) + 1);
				int y = (int)(Math.random() *(10-1) + 1);
				int z = (int)(Math.random() *(10-1) + 1);
				
				System.out.println( " | " +  x +" | " + y + " | " + z + " | "  );
				System.out.println("_______________________ ");
				
				if( x == y || x == z || y==z ) {
					
					System.out.println("Great Play! You just doubled your money!!");
					current_amount = ( current_amount * 2);
					System.out.println("You now have: " + current_amount );
				}
					else if( x == y && y == z ) {
					System.out.println("Great Play! You just trippled your money!!");
					current_amount = ( current_amount * 3);
					System.out.println("You now have: " + current_amount );	
					}
				else{
					System.out.println("Didn't win this time, better luck next time!");
					System.out.println("You now have: " + current_amount );	
				}
					start_amount = current_amount;
				}
					else{ 
					System.out.println("You cant wager more then you have ");
					}
					
			if (start_play.equals("No") || start_play.equals("no") || start_play.equals("N") || start_play.equals("n")){
				System.out.println(" Okay, have a good day!"); 	
			}
			
		}
		
		}
	}
}
