package repl;

public class repl174 {
	
	 public static void main(String[] args) 
	   {
	    
	  
	     
	   }
	 public static int findMax(int[] arr){
		  
		  int max = arr[0];
		  for(int i=1; i<arr.length; i++){
		    if(max<arr[i]){
		      max=arr[i];
		    }
		  }
		  return max;
		  
		  
		}
		public static double findMax(double [] arr2){
		  double max = arr2[0];
		  for(int i=1; i<arr2.length; i++){
		    if(max<arr2[i]){
		      max=arr2[i];
		    }
		  }
		  return max;
		  
		  
		}



}
