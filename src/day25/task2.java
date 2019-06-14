package day25;

import java.util.*;

public class task2 {

	public static void main(String[] args) {
//		String[] courses = {
//				"Welcome Kit",
//				"Online-Java Programming",
//		    	"Online-Software Development Lifecycle",
//		    	"Online-Software QA Testing",
//		    	"Online-Team Activity",
//		    	"Online-Mentoring", 
//		    	"Online-Selenium",
//		    	"Online-SQL",
//		    	"Online-API Testing"
//				} ;
//	int[] courseId = {143,166,168,170,163,203,169,171,164} ; 
//	
//
//    int count =0;
//	for(int i =0; i<courses.length; i++) {
//		
//		System.out.println("<" + courses[i] + "> is " + courseId[i]);
//		
//		if(courseId[i]== 164 ) {
//			System.out.println(courses[i]);	
//		
//			break;
//		}
//		if(courses[i].contains("Software")) {
//			count++;
//			
//		}
//	
//	}
//	System.out.println(count);

	    Scanner input = new Scanner(System.in);
	    int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
	    int count =0;
	    int x =0;
	    
	    for(int i = 0; i<nums.length-1 ; i++){
	      
	     if((nums[i]==5) && (nums[i+1]==5 )){
	     count++;
	 }
	     x++;
	      }
	      
	      
	if(count==1)
	  System.out.println("true"); 
	if(x==4)
	System.out.println("false");
	}

}
