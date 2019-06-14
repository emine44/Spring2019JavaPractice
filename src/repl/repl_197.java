package repl;

import java.util.Arrays;

public class repl_197 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int[] addElements(int[] ints1, int[] ints2) {
	    
	    int [] arr = new int[ints1.length];
	    
	    for(int i=0; i<ints1.length; i++){
	      
	      arr[i] = ints1[i]+ints2[i];
	      System.out.println(arr[i]);
	      
	    }
	    
	       
	    
	    return  arr;
	    
	    
	  }
}
