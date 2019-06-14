package interviewQuestions;
import java.util.Scanner;
public class getUniqueCharactersFromAstring {

	public static void main(String[] args) {
		/*Scanner scan = new Scanner (System.in); 
	     String word = "";

	     System.out.println("Enter a word: ");
	     word = scan.nextLine();

	     uniqueCharacters(word); */
	
		/*
		 * String str = "aaabbccc"; String temp = ""; for (int i = 0; i < str.length();
		 * i++){ if (temp.indexOf(str.charAt(i)) == - 1){ temp = temp + str.charAt(i); }
		 * }
		 * 
		 * System.out.println(temp + " ");
		 */
		/*
	     * write a program to get unique characters from a string  
	     * : aaabbccc —> abc
	     * */
	    String str = "aaabbccc" ; 
	    String uniqueStr = "" ; 
	    
	    for (int i = 0; i < str.length(); i++) {
	      
	      String eachChar = str.substring(i, i+1) ; 
	      
	      if(! uniqueStr.contains(eachChar) ) {
	        uniqueStr += eachChar ; 
	        System.out.println(eachChar);
	      }
	      
	      //System.out.println(eachChar);
	      
	    }
	}

}
