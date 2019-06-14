package day30;

import Fridays.callingMethod;

public class task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		reportName("ali","ayse");
		reverseString("abcdef");
		
		callingMethod.callMe("fatma");
		
		
		

	}
	
	public static void reportName(String firstName, String lastName) {
		
		System.out.println("Your first name length is: " 
		+firstName.length() + " Your last name length is: "
				 + lastName.length());
		
		System.out.println("Your initial is: " +  firstName.charAt(0) + "" + lastName.charAt(0));
		
		
	}
	
	public static void reverseString(String str) {
		String reversed = " ";
		for(int i=str.length()-1; i>=0; i--) {
			
	    reversed = reversed + str.charAt(i) ;
			
			
		}
		System.out.println("Your reversed is: " + reversed);
		
		
		
	}
	
	
	
	
	
	

}
