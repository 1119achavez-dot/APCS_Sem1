/*
	Author: Abigail Chavez 
	Date: 1/12/26
*/
import java.util.*;

class starter {
	String sent = " ";
	String letter = " ";
	// plan:
	// every word starts with a lower case (rule)
	// make a string array thing we leart at the end of the semester for the user input 
	// then make a random number jenerator 
	// assighn each index a rndom numer from the genrator 
	// if the numer is odd then it becomes upercase 
	
	public static void main(String args[]) {
	Scanner sc = new Scanner (System.in);
	
		System.out.println();
		System.out.println(" Please enter a word or phrase: ");
    	String sent = sc.nextLine ();
    	
    while(sent.indexOf("") != -1)	{
    	String word = sent;
    }
  public String spongeWord(String word){
    	String ans = "";
    	   	
    	for(int i = 0; i < sent.length(); i++){
    		String letter=sent.substring(i,i+1);
    		if(i%2==0){
    		letter=letter.toLowerCase();
  
    		}
    		else{
    		letter=letter.toUpperCase();	
    		}
    		ans = ans + letter;
    	}
    }
    return letter;
}  

}