/*
 *	Author:  Abby
 *  Date:  11/21/25
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		Warrior[] x = new Warrior[100]; 
		Wizard[] y = new Wizard[100];
		
		for(int i =0; i < x.length; i++){
			x[i] = new Warrior();
			y[i] = new Wizard();
		}
	// create a sepret loop so that they kep attacking one another 
	// but there needs to be a sepret varibal for x and y indexes bc they will die at diffrent rates 
	int a = 0;
	int b = 0;
	int numwizard= 100;
	int numwarrior =100;
	
	while(true){
		
		y[b].attack( x[a] ); 
		// if stment s when kill and one that breaks when killed
		if(x[a].isDead()){
			a++;
			numwarrior--;
		}
		
		if(a==99){
			System.out.println(" ");
			System.out.println("Game over!");
			System.out.print("wizard won with "+ numwizard + " left in their army.");
				break;
			}
		
		
		x[a].attack( y[b] );  
		
		if(y[b].isDead()){
			b++;
			numwizard--;
		}
		
		if(b==99){
			System.out.println(" ");
			System.out.println("Game over!");
			System.out.print("Warriors won with "+ numwarrior + " left in their army.");
			break;
		}
		
		

	
	}

	}	
	
}
