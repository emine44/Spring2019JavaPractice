package day34;

import java.util.Scanner;

     public class warmuP {

	  public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("enter a word");
		String st = scan.next();
		System.out.println(isPalindrome(st));
		
		System.out.println(reverseString(st));

	}
	public static boolean isPalindrome(String str) {
		String reversed = "";
		str =str.replaceAll(" ","");
		
		for(int i=str.length()-1; i>=0; i--) {

			reversed = reversed + "" +str.charAt(i) ;
				}
           
		
		if(str.equals(reversed)) {
			return true;}
			
		     else {
				return false;
			}
		}
	
	
	
	public static String reverseString(String target) {
		String reversed ="";
		//target= target.replaceAll(" ", "")
		 for(int i=target.length()-1; i>=0; i--) {
			 reversed = reversed + target.charAt(i);
			 
		 }
		 return reversed;
		 }
		
		
	}
		
	
	
	
	


