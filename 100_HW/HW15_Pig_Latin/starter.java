/*
   * Author:Abigail chavez 
   * Date: 12/11/25
   * Collaborator(s):
*/

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	
		System.out.println("Please enter a sentence: ");
		String str = sc.nextLine();
		String ans = "";
		int consonants=0;

		
			while(str.indexOf(" ")!= -1) {
				int space= str.indexOf(" ");
				String word = str.substring(0,space);
				//pig latin-affy it here 
				if (str.contains("b")||str.contains("c")||str.contains("d")||str.contains("g")||str.contains("h")||str.contains("j")||str.contains("k")||str.contains("l")||str.contains("m")||str.contains("n")||str.contains("p")||str.contains("q")||str.contains("t")||str.contains("v")||str.contains("w")||str.contains("x")||str.contains("y")||str.contains("z")){
			       consonants++;
			       if(str[].contains("a")||str.contains("e")||str.contains("i")||str.contains("o")||str.contains("u")){
			       	word = (str.substring(1)+"-"+str.substring(0,1)+"ay");
			       }
			     	if (str[].contains("b")||("c")||("d")||("g")||("h")||("j")||("k")||("l")||("m")||("n")||("p")||("q")||("t")||("v")||("w")||("x")||("y")||("z")){
			     	consonants++
			     	if(consonants >=2){
			     	word = (str.substring(1)+"-"+str.substring(0,2)+"ay");	
			     	//how do i pull that spesific letter form the word? is this secction treated like an array??
			   
			     	{
			    }
			      if(str[].contains("a")||("e")||("i")||("o")||("u")){
			       	word = (str.substring(1)+"-"+str.substring(0,2)+"way");
			      }
			      
			    }
				// dosnt run :0
				
				
				str = str.substring(space+1);
				ans=ans+" "+word;
		}
	}
}
