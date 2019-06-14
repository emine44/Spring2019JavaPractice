package Mentoring;

import java.util.ArrayList;

public class ArrayListReview {

	public static void main(String[] args) {
//	EX-1	Create a method that:  is called twoTimes(repl 221)
//			returns a new ArrayList of Integers
//			takes in a single parameter - an ArrayList of Integers
//
//			This method should create a new ArrayList of Integers that 
//			contains every value of the ArrayList parameter repeated twice.
		//(1,5,3,7)------(1,1,5,5,3,3,7,7)
  
		
		
		
//		
//  EX-2 Create a method that:
//	  is called timesTwo
//	  returns nothing
//	  takes in a single parameter - an ArrayList of Integers called nums
//
//	  This method should take the ArrayList parameter and multiply every value by two.
//	 	 
		
		
		
		
//EX-3 search method accepts ArrayList of Strings and String find. 
//		and returns a String.
//		It will look for an element within ArrayList that contains value of find
//		if it finds it, methods needs to return whole Element value.
//		if  an instance of find doesn't exist return:"search failed"
		
		
		 
	    ArrayList<String>  arr = new ArrayList<String>();
	    arr.add("2");
	    arr.add("6");
	    arr.add("foo bar");
	    arr.add("abc");
	    
	  
	    String find_tst = search(arr,"foo");
	    System.out.print(find_tst);//foo bar
		
	}
}
