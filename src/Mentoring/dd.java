package Mentoring;

import java.util.ArrayList;

public class dd {

	public static void main(String[] args) {
		  ArrayList <Boolean> arr2 = new ArrayList <>();
		arr2.add(true);
		arr2.add(false);
		arr2.add(false);
		arr2 =repeatAl(arr2);
		
	}
	public static ArrayList<Boolean> repeatAl(ArrayList<Boolean> arr){
		  ArrayList <Boolean> arr2 = new ArrayList <>();
		  
		  for(int i=0; i<arr.size(); i++){
		    arr2.add(arr.get(i));
		    
		  }
		   for(int i=0; i<arr.size(); i++){
		    arr2.add(arr.get(i));
		    
		  }
		  
		  
		}
}
