/*
 *	Author:Abigail Chavez
 *  Date:9/16/25
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println();
        System.out.println(" Please enter an integer: ");
        int num1 = sc.nextInt();
        
        System.out.println(" Please enter another integer:");
        int num2 = sc.nextInt();
        
    	  if (num1 % 2 ==0 ) {
			System.out.println("Your first number is even and diviisibal by 2 !");
			}
		else {
			 System.out.println("Your first number is odd"); 
		}
		
		
		 if (num2 % 2 ==0 ) {
			System.out.println("Your seccond number is even and diviisibal by 2 !");
			}
		else {
			 System.out.println("Your seccond number is odd"); 
		}
		
		if ( num1 % 3 ==0){
				System.out.println(num1 + "  is diviisibal by 3! ");
		}
		if ( num1 % 4 ==0){
				System.out.println(num1 + "  is diviisibal by 4! ");		
		}
		if ( num1 % 5 ==0){
				System.out.println( num1 + "is diviisibal by 5! ");	
		}
				if (num1 % 3 ==0 && num1 % 4 ==0 && num1 % 5 ==0){
				System.out.println("b");
				}
			else {	
			 System.out.println( num1 + " is not dvisbal by : 3,4 and 5"); 
			}
		
			
		if ( num2 % 3 ==0){
				System.out.println(num2 + "  is diviisibal by 3! ");
		}
		if ( num2 % 4 ==0){
				System.out.println(num2 + "  is diviisibal by 4! ");		
		}
		if ( num2 % 5 ==0){
				System.out.println( num2 + "is diviisibal by 5! ");	
		}
				if (num2 % 3 ==0 && num2 % 4 ==0 && num2 % 5 ==0){
				System.out.println("b");
				}
			else {	
			 System.out.println( num2 + " is not dvisbal by : 3,4 and 5"); 
			}
			
	}
}
	////if ( num1 % 5 ==0){
				//	System.out.println("c");
		//			}
		//	if(){
		//		if(){
		//			if (){
						
			//		}
			//		else{
			//			
		//			}
			//	}
			//	else{
					
		//		}
		//	}
		//	else{
		//		
		//	}
		//			
					
		//	else ///////