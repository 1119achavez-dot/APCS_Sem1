/*
 *	Author: abby
 *  Date:12/7/25
*/

import java.util.*;
import java.io.*;

class starter {
	public static void main(String args[]) throws FileNotFoundException {
		
		System.out.println("Please enter the file name of one of the text files in the \'books\' folder: (Ex: test.txt)");
		String textFile = sc.nextLine();		// This is one of the files in the 'books' folder. It MUST exist.
		String[] arr = fillArray(textFile);		// Uses the fillArray method that has been built below. This fills the array 'arr' with each word individually in the text file.
		System.out.println();
	


		/*
			The only time you should use Scanner with (System.in) is within the 'main' method.
			At no point should any other method use Scanner(System.in)
		*/
		while(true){
			System.out.println("What action would you like to take?");
			System.out.println("1. Check text file (file)");
			System.out.println("2. Print the text given (print)");
			System.out.println("3. Print the text backwards (printBack)");
			System.out.println("4. Print a certain number of words (printNum)");
			System.out.println("5. Change the text file (change)");
			System.out.println("6. Check the number of words in a text (check)");
			System.out.println("7. Most common word (common)");
			String choice = sc.nextLine();
			System.out.println();

			// Your code goes here.
			// my notes 
			// if choice is file then connectet to method for file 
			// else if print then connect to method 
			// last one is just eles and connect to last option 
			// if choice is file then priint out text file 
			if(choice.equals("file")){
				System.out.println(	textFile);
			}
			
			else if(choice.equals("print")){
				printsArray(arr); // this is how to call the method when in the same class
			}
			
			else if(choice.equals("printBack")){
				printsArrayBack(arr);
			}
			
			else if(choice.equals("printNum")){
				System.out.println("How many words of the text would you like to print? ");
				int Givennum = sc.nextInt ();
				sc.nextLine();
				printsNumber(arr, Givennum);
			}
			
			else if(choice.equals("change")){
				System.out.println("Please enter the file name of one of the text files in the \'books\' folder: (Ex: test.txt)");
				textFile = sc.nextLine();		// This is one of the files in the 'books' folder. It MUST exist.
				arr = fillArray(textFile);		// Uses the fillArray method that has been built below. This fills the array 'arr' with each word individually in the text file.
				System.out.println();
			}
			
			else if(choice.equals("check")){
				System.out.println("What word/phrase would you like to check? ");
				String phrase = sc.nextLine();
				int count = 0;
				checksArray(arr,phrase);
			}
			
			else if(choice.equals("common")){
				System.out.println("The most common word in the text is:" + mostCommon(arr));
			}

			System.out.println("----------");
		}
	}


	/* ---------------------------------------------------------------------------------------
		The printsArray method prints the entire array given.
	*/
	public static void printsArray(String[] arr){
// choice just tells what method they want us to do or call 
// arr is alr declared withthe text file above 
	 int i = 0;
     while(i<arr.length){
		System.out.print(arr[i] +" ");
		i++;
	}
	}


	/* ---------------------------------------------------------------------------------------
		The printsArrayBack method prints the entire array given in opposite order.
	*/
	public static void printsArrayBack(String[] arr){
     for(int i = arr.length -1; i> -1; i--){
		System.out.print(arr[i]+ " ");
	}

	}


	/* ---------------------------------------------------------------------------------------
		The printsNumber method prints "num" words out of the entire given array.
		If the number is larger than the number of words in the array, it tells the user too large and to try again.
			This should immediately end the method.
	*/
	public static void printsNumber(String[] arr, int num){

		if(num > arr.length){
			System.out.println("Too large of a number. Please try again.");	
			System.out.println("---------------------------------------------------------------");
		}
		else{
			for(int i=0; i < num; i++){
				System.out.println(arr[i]+ " ");
			}
				System.out.println();
		}

	}


	/* ---------------------------------------------------------------------------------------
		The checksArray method checks the given array for a given String.
		It counts the number of occurences that the given String shows up.
		The count is returned to the call.
	*/
	public static int checksArray(String[] arr, String check){
		int i = 0;
		int count = 0;
    	 while(i<arr.length){
			if(arr[i].equals(check)){
    			count++;
			}	
			i++;
    			
    	}
    	return count;
	}


	/* ---------------------------------------------------------------------------------------
		The mostCommon method finds the most common word in the given array.
		It returns the String of the most common word.
		This is a harder method but is doable!
		Do this one last!
	*/
	public static String mostCommon(String[] arr){
		int max = 0;
		String maxword ="";
		
			for(int i =0; i < arr.length;i++){
				int num = checksArray(arr,arr[i]);
				if(num>max){
					max=num;
					maxword=arr[i];
				}
			}
		return maxword;	
	}

	// ---------------------------------------------------------------------------------------
	/*
		The fillArray method returns an array filled of all of the words in a given text file (String).
		Each word is slotted into its own index in the array.
		The array length is the number of words in the text file.
		A precondition is that "String args" must be a valid .txt file stored in the "books" folder.
	*/
	public static String[] fillArray(String arg) throws FileNotFoundException {
		File text = new File("./books/" + arg);
		Scanner sc = new Scanner(text);
		int lineNumber = 0;
		while(sc.hasNext()){
			sc.next();
			lineNumber++;
		}

		String[] arr = new String[lineNumber];
		sc = new Scanner(text);
		for(int i = 0; i < lineNumber; i++){
			arr[i] = sc.next();
        }
		return arr;
	}

}
