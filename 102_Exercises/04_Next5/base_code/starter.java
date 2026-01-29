/*
 *	Author: Abigail Chavez 
 *  Date: 9/9/25
 *	Collaborator(s): 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner (System.in);
    
    System.out.println();
    System.out.println(" please eneter a interger number bellow ");
    int x = sc.nextInt();
    int xy = x + 1;
    int yy = xy + 1;
    int xx = yy + 1;
    int aa = xx + 1;
    int bb = aa + 1;
    
    System.out.println (" here are the 5 numbers : ");
    System.out.println ( xy + "," + yy + "," + xx + "," + aa + "," + bb);
    
    System.out.println (" here are the next five mutipuls of " + x );
    
    int a = x * 2 ;
    int b = x * 3 ;
    int c = x * 4 ;
    int d = x * 5 ;
    int e = x * 6 ;
    
    System.out.println ( a + "," + b + "," + c + "," + d + "," + e);
    
    System.out.println (" here is  " + x  + " dvided by 100 :");
    
    double divide = x / 100.0 ;
    System.out.println ( divide );
    
    System.out.println (" here is 100 dvided by 10 :");
    double last = 100.0 / 10.0;
    
    System.out.println ( last);
    


	}
}
