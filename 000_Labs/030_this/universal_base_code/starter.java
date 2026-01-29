/*
 *	Author: abigail chavez  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}

	public static void main(String args[]) {
		int num = 7;
			String a = new randName();
			String b = new randName();
			String c = new randName();
			String d = new randName();
			String e = new randName();
			String f = new randName();
			String g = new randName();
			int namenum = 0;
			if ( a == b ){
			namenum = namenum + 1;
			}
			
			if ( a == c ){
			namenum = namenum + 1;
			}
			
			if ( a == d ){
			namenum = namenum + 1;
			}
			
			if ( a == e ){
			namenum = namenum + 1;
			}
			
			if ( a == f ){
			namenum = namenum + 1;
			}
			
			if ( a == g ){
			namenum = namenum + 1;
			}
			System.out.print("the name was"+a+"there was"+namenum + "duplicts of it!");
			
			
		PooleDwarf test = new PooleDwarf();
		
	}
}
