/*
 *	Author:Abigail Chavez 
 *  Date: 10.19.25
 *	Collaborator(s):
*/

import java.util.Scanner;
import java.util.Random;

class starter {
    
    public static String get_R_P_S(){
		int rand = (int)(Math.random()*3)+1;
		//String result1 = String.valueOf(rand);
		String result = "";
		
		if(rand == 1){
		   result= "rock";
		}
		else if(rand == 2){
		   result= "paper";
		}
		else {
		   result= "scissors";
		}
		
		return result;
	}
	
//******************************************************************************
    
    public static int compare(String rando, String typed){
        //int rand = (int)(Math.random()*3)+1;
        if( rando.equals(typed)){
            int aws = 0;
            return aws;
            ///rando = 
            
        }
        else if( (rando.equals("scissors ")) && (typed.equals("rock")) || (rando.equals("rock ")) && (typed.equals("paper")) ||(rando.equals("paper ")) && (typed.equals("scissors")) )  {
            int aws = 1;
            return aws;
        }
        else {
        int aws = 2;
        return aws;
        }
}
    

////////////////////////////////////////////////////////////////////////////////
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while(1==1){
         System.out.println(" --------------------------------------------------------------");
        System.out.println(" Would you like to play the computer? (yes/no/done)");
        String sent1= sc.nextLine ();
        
        if (sent1.equals("yes")){
            System.out.println(" --------------------------------------------------------------");
            System.out.println(" Please enter rock/paper/scissors:");
            String x= sc.nextLine ();
            String a = get_R_P_S();
            int hello = compare(a,x);
                if (hello == 0){
                System.out.println("you tied!");
            }
                if (hello == 1){
                System.out.println("you win!");
            }
                if (hello == 2){
                System.out.println("you lost");
            }
        }
        if (sent1.equals("no")){
            System.out.println(" --------------------------------------------------------------");
            System.out.println(" hehehe");
        }
        if (sent1.equals("done")){
            System.out.println(" --------------------------------------------------------------");
            System.out.println(" bye");
        }
            
    }
    }
}
