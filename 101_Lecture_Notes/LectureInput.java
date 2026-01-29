/*
    Lecture note example - Input!!
*/
import java.util.Scanner;

class LectureInput{
    public static void main(String args[]) {
        // Your Code Goes here!
        Scanner sc = new Scanner (System.in);
        double item1Price = 12.24;
        double item2Price = 5.99;
        double item3Price = 6.67;
      
        System.out.println("Welcome to Abbys Ice Cream shop :)");
        
        System.out.println("1. 🍨 Ice Cream Sunday - $ " + item1Price);
        System.out.println("2. 🍧 Shaved Ice-$ " + item2Price);
        System.out.println("3. 🧋 Boba Tea - $" + item3Price);
        
        System.out.println();
        System.out.println(" Whats the name for the order ? ");
        String name = sc.nextLine ();
        
        System.out.println("How many Sundays whould you like? ");
        int quant1 = sc.nextInt();
        System.out.println("How many Shaved Ice cups do you want ? ");
        int quant2 = sc.nextInt();
        System.out.println("How many Boba Teas would you like? ");
        int quant3 = sc.nextInt();

        double Total1 = (quant1 * item1Price);
        double Total2 = (quant2 * item2Price);
        double Total3=  (quant3 * item3Price);
        double total = (Total1+Total2+Total3 );
    
        
        System.out.println (" your total curently is $ " + total );
        
        System.out.println (" What percent would you like to tip?");
        double tipPercent =  sc.nextDouble();
        
        double tip = total * (tipPercent / 100 );
        double grandTotal = tip + total; 
         
         
        System.out.println( name );
        System.out.println( quant1 + " x" + " Ice Cream Sunday = " + Total1 ); 
        System.out.println( quant2 + " x" +  " Shaved ice = " + Total2 ); 
        System.out.println( quant3 + " x" + " Boba Tea  = " + Total3); 
        System.out.println("Tip ( " + tipPercent + ") = $" + tip );
         System.out.println("---------------");
        System.out.println("Grand Total = $ " + grandTotal );
        
        
	}
}
