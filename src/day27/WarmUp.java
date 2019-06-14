package day27;
import java.util.Arrays;
public class WarmUp {

	public static void main(String[] args) {
		//Task1 : 
//		create an array of int with 5 items ,
		//return true if all items are more than 10
//		return false if not
		
		 int[] nums = { 1, 2, 13, 4, 55 };
		 for(int i = 0; i<nums.length; i++) {
			 if(nums[i]>10)
				 System.out.println("true");
			 else
				 System.out.println("false");
			 
		 }
		
		
		
		

	//Task 2 :
//	given : 
//	String str = "Cybertek Batch Spartan is most hardworking Batch ever";
//
//	use the method your learned to get each words
//	and store it into String array: 
//
//	loop through each items -- 
//	  in each iteratrion loop : 
//	  	 turn each word into char array 
//	  	 print each char out with seperated by -
//	output : 
//		C-y-b-e-r-t-e-k-
//		B-a-t-c-h-
//		S-p-a-r-t-a-n-
//		i-s-
//		m-o-s-t-
//		h-a-r-d-w-o-r-k-i-n-g-
//		o-n-e-
//		e-v-e-r-
//
//	// Optional : Reverse each word in sentence
//	your output should be 
//	ketrebyC hctaB natrapS si tsom gnikrowdrah eno reve
		 
		 String str = "Cybertek Batch Spartan is most hardworking Batch ever";
		 String[] str2 = str.split(" ");
		 char[] nameChars = str.toCharArray(); 
		 String store = " ";
			    
//			    for (int i = 0; i < nameChars.length; i++) {
//			    	store = nameChars[i] + "-";
//
//			      System.out.println
//			      (store);
//			      
//			    }
		 for(int k =0 ; k<str2.length; k++) {
			  System.out.print(" "); 
			    
			    for (int j = str2[k].length()-1; j >=0; j--) {
			    	store =store + str2[k].charAt(j);
	    	
 }
			   store += " " ; 
			  
		 }  
		 System.out.print(store);	    
	}

}
