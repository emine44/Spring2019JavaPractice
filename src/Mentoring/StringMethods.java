package Mentoring;

import java.util.Scanner;

public class StringMethods {

	public static void main(String[] args) {

		
		
	//EX-3 Given a string and an int n, return a string made of n 
		//repetitions of the last n characters of the string.
       //You may assume that n is between 0 and the length of the string, inclusive.
	    //Example
		//:        0 1 2 3 4
		//input: H e l l o
		//input: 2
		//output: lolo	
		
//		
//		Scanner scan =new Scanner(System.in);
//	   System.out.println("Enter input");
//	    int n =scan.nextInt();
//	    
//	    String name = "Sabiha";//haha
//	    
//	    String lastStr = name.substring(n,name.length());
//	    
//	   for(int i=0; i<n; i++) {
//		   System.out.print(lastStr);
//		   
//	   }

	
	
	 //EX-4 Write a program that will print out the longest word.
		
	   
	   String w1 ="live";
	   String w2="the";
	   String w3 ="moment";
	   
	   int w1l = w1.length();
	   int w2l = w2.length();
	   int w3l = w3.length();
	   
	   
	   if(w1l>w2l && w1l>w3l) {
		   System.out.println("longest is: " + w1 ); 
	   }
	   
	   
	   if(w2l>w1l && w2l>w3l) {
		   System.out.println("longest is: " + w2 ); 
	   }
	   
	   if(w3l>w2l && w3l>w1l) {
		   System.out.println("longest is: " + w3 ); 
	   }
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
		
		
		
	//EX-1 Write a program that will swap first and 
		//last characters in the string. Use substring method to slice the string.
		//Print out result into the console. (input: apple
//		                                      //output: eppla)
//		               // 0 1 2 3 4
//		  String name ="Marat Abi";
//		  String firstChar = name.substring(0,1);//m
//		  String lastChar = name.substring(name.length()-1,name.length());
//		  String middleStr = name.substring(1,name.length()-1);
//		  
//		  System.out.println(name);
//		  name = lastChar.concat(middleStr);
//		  
//		  System.out.println(name);
//		  
//		  name=name.concat(firstChar);
//		  
//		  System.out.println(name);
		  

		
	//EX-2 Given a String variable email, write code using split method to print email id
		//and domain in separate lines.	   
		//email -> info@cybertekschool.com
		//Print:  
//			//Email id: info
//			//Email domain: cybertekschool.com  
//		
//		
//		String email = "info@cybertekschool.com";
//		//Email id: info
//		//Email domain : cybertekschool.com
//		
//		email.substring(email.indexOf("@") +1 , email.length());
////		
//		int at = email.indexOf("@");
//		 String indexInfo= email.substring(0,at );
//		 
//		 System.out.println(indexInfo);
//	
//		
//		
//		System.out.println(email.substring(email.indexOf("@") +1 , email.length()) );
////		
//		
//		
//		
//		
	}

}
