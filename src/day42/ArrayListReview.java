package day42;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListReview {

	public static void main(String[] args) {
		//Create an ArrayList object and add 5 whole numbers
        //try out adding one by one 
		 ArrayList<Integer> numList = new ArrayList<>(); 
		    numList.add(3);
		    numList.add(9);
		    numList.add(45); 
		    numList.add(2);
		    numList.add(6);
		    System.out.println(numList);
		    
		//also try adding in one shot 
		    
		 List<Integer> nums2 = Arrays.asList(10,45,9,6,87,5) ;
		  //List is more general than arrayList  
		  //Arrays.asList return a fixed size list and return type as List
		 //so it has to be stored in List variable

		    
		//update each number to doule of that number  1,3,5,6,7 --> 2 6 10 12 14    
		for(int i=0; i<numList.size(); i++) {
			
			numList.set(i, numList.get(i)*2);
			
		}
		    System.out.println(numList);
		    
		//// reverse this ArrayList using one of the utility method that we learned from Collections class    
		 Collections.reverse(numList);
	    System.out.println("reverses list: "+ numList);
	    
	    
	}

}
