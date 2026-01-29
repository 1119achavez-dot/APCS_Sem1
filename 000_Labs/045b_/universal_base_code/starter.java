/*
 *	Author:  abby
 *  Date: 
*/
import java.util.*;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		/*
			Create a program that creates a crossword puzzle hiding 1 word given by the user!

			1. Take a word from the user
			2. Create a 2D String array with a size of 5 larger than the word size in both directions
			3. Choose what direction the word should hide in
				- Vertical, Horizontal, Diagonal
				- EXTRA: Choose if the word should hide forward or backwards
			4. For each letter in the word, hide it into a spot in the 2D array
				- This spot should be chosen randomly within the bounds of the 2D array
			5. Once the word is stored in the array, fill up the rest of the array
				- Note what value is stored in the String array and replacing non-filled values with random letters
				- Given the letters array, choose a random letter to populate it with
			6. Print out the crossword puzzle!
			7. Ask a friend to find the word!
		*/

		String[] letters = {
            "a","b","c","d","e","f","g","h","i","j",
            "k","l","m","n","o","p","q","r","s","t",
            "u","v","w","x","y","z"
        };

		System.out.println("Please enter a word that you'd like to hide in a crossword:");
		String word = sc.nextLine ();
		
		int size = word.length() + 5;
		String[][] crossword = new String[size][size];
		
		// turn my string word into an array 
		//create a methods where it can be printed horizonal or verdical 
		// make a mathod to calll the other letters in a random order 
		
		// this will intilize the crssword with randome letters 
		Random rand = new Random();
		for(int i = 0; i< size; i++){
			for(int j = 0; j<size; j++){
				crossword[i][j]= letters[rand.nextInt(letters.length)];
				
			}
		}
		int direction = rand.nextInt(3);
        int startRow = rand.nextInt(size);
        int startCol = rand.nextInt(size);

        // Adjust starting position based on direction and word length
        if (direction == 0 && startCol + word.length() > size) {
            startCol = size - word.length(); // Adjust for horizontal
        } else if (direction == 1 && startRow + word.length() > size) {
            startRow = size - word.length(); // Adjust for vertical
        } else if (direction == 2 && (startRow + word.length() > size || startCol + word.length() > size)) {
            startRow = size - word.length(); // Adjust for diagonal
            startCol = size - word.length(); // Adjust for diagonal
        }
		
		//prints the word 0= horizonatal,1=verdically,2=dignoal
		
		
		//System.out.println("You chose the word: "+word);
		
        //for (int i = 0; i < word.length(); i++) {
          //  System.out.println(word.charAt(i));
        //}

 
        
        //vertical thingy mabobber
        //
    }
}

    
		
	

