/*
 *	Author: abigail c 
 *  Date: 10.12.25
 *	Collaborator(s):
*/

import pkg.*;
import java.util.Scanner;

class starter {
	/*
	public static encode(String){
		String result = String(a,b);
		System.out.println(result );
		return result;
	}
	public static KeyedEncode(String,key) {
		String result = String(a,b);
		System.out.println(result );
		return result;
	}
	*/
	
	public static void main(String args[]) {
	System.out.println("----------------------------------------");
	Scanner sc = new Scanner(System.in);
	
	String turtles = Cipher.encode("6v lvp u5vuy5 y1z5 qpsqy5r");
	System.out.println(turtles);
	
	String robo = Cipher.encode("sv8vq17r 1r q25 85rq");
	System.out.println(robo);
	
	String num4key = Cipher.encode("q25 z5l qv wpx85s f 1r gg");
	System.out.println(num4key);
	
	String v = Cipher.keyedEncode("z8r8v 6yzzc 64r8 oys sx z8r8v 6y4z6 ty 18t oys 9yqz",33);
	System.out.println(v);
	
	String yy = Cipher.encode("29y4 v4 v2q9w1r 05sr5l wpx85s 1r z5l qv d");
	System.out.println(yy);
	// key = 8 
	/// hard one make a loop to run 36 times till key is printed out 
	
		/*
		System.out.print("enter a message to encode : ");
		String message= sc.nextLine ();
		System.out.print("enter a key (int) : ");
		double key = sc.nextInt ();
		System.out.print("ur encoded message:");
		KeyedEncode(message,key);
		
		*/
	}
}



