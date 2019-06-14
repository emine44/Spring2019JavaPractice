package day39;

import java.util.ArrayList;
import java.util.List;

public class ListWithMethods {

	public static void main(String[] args) {
		List<String> lst = new ArrayList<>();
		lst.add("apple");
		lst.add("orange");
		lst.add("banana");
		lst.add("kiwi");
		
		printItems(lst);
	    System.out.println(getListFrom(30));
				
	}
	
	
	
	public static void printItems(List<String> strLst) {
		
	for(String each : strLst) {
		
		System.out.print(each + "-");
	}
	}
	// create a method that accept a number as ending point
	//and return List of integer from 1- that number
	public static ArrayList<Integer> getListFrom(int x ){
	    
	    ArrayList<Integer> numList = new ArrayList<>(); 
	    for (int i = 1; i <= x ; i++) {
	      numList.add(i); 
	    }
	    
	    return numList; 
	    
	  }
		
	}	
		
		
		
	
	
	
	


