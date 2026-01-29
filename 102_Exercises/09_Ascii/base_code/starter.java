/*
 *	Author:abigail Chavez 
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// 3 things that i chose 
		Scanner sc = new Scanner (System.in);
		System.out.println("pick an object in any of these catagories to see a photo of them!");
		System.out.println(" 1) animal 2) object 3)face");
		String Pick= sc.nextLine ();
		
			if (Pick.equals("deer") || Pick.equals("Deer")){
				System.out.println(" Correct ! here is your drawing of a deer:");
				System.out.println("  \\|/    \\|/");
				System.out.println("   \\      /");
				System.out.println("    \\    /");
				System.out.println("    _____ ");
				System.out.println("            ");
				System.out.println("{|  @    @ | }");
				System.out.println("      T   ");
				System.out.println(" \\    0   / ");
			}
			
			else if (Pick.equals("book") || Pick.equals("Book")){
				System.out.println(" Correct ! here is your drawing of a book:");
				System.out.println("	___________");
				System.out.println("      /         /// ");
				System.out.println("     /         /// ");
				System.out.println("    /         /// ");
				System.out.println("    _________ ");
				System.out.println("  ((        (( ");
			}
			else if (Pick.equals("the Rock") || Pick.equals("the rock")){
				System.out.println(" Correct ! here is your drawing of the rock:");
				System.out.println("    ____");
				System.out.println(" (  __ /\\  )");
				System.out.println("     o  o");
				System.out.println(" [     3    ] ");
				System.out.println(" (         )");
				System.out.println("     ____");
				
			}
		else {
			System.out.println(" you didnt gusse the correct object:( try again!!");
		}
		
	}
}
