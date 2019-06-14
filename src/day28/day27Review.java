package day28;
import java.util.*;
public class day27Review {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter words");
//		String [] arr = {scan.next(),scan.next(),scan.next(),scan.next()};
//        String [] narr = Arrays.copyOf(arr, arr.length);
//		
//		System.out.println(Arrays.toString(arr));
//		System.out.println(Arrays.toString(narr));
//		Arrays.sort(narr);
//		
//		System.out.println(Arrays.toString(narr));
		
		 /*
	     * Arrays Class methods to work with array object 
	     * 
	     * toString(arrObject) --->> return string rep of array items 
	     * sort(arrObject) ; --->  sort the array 
	     * copyOf(arrObject , lengOfNewArr) ---> new array with length defined 
	     *               and everything copied from original 
	     * copyOfRange(arrObject, from,to)  --> works like subString
	     * equals(arr1, arr2) ---> true false if all elements are the same and in same order
	     * 
	     * binarySearch
	     * */
	    String[] words = {"coding", "start", "to", "Day", "Perfect", "Sunday"}; 
	     
	     Arrays.sort(words);
	     System.out.println( Arrays.toString(words) );
	     
	     String[] first2words = Arrays.copyOf(words, 2) ;
	     System.out.println( Arrays.toString(first2words) );
	     
	     String[] tenItem = Arrays.copyOf(words,10) ;
	     System.out.println( Arrays.toString(tenItem) );
	     
	     
	     
	     
	     
	     
	    
	    
		
	}

}
