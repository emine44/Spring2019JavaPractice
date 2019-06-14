package repl;

public class UniqueCharacters {
	 public static void main(String[] args) {
		    //test your code
		    System.out.println( uniqueChars("jaa") ) ;
		  }
		  
	 
	  public static String uniqueChars(String str) {
	    
	   char [] unique = str.toCharArray();
	    String result ="";
	    int count =0;
	for (int i = 0; i < unique.length; i++) {
	        for (var j = i+1; j < unique.length; j++) {
	            if (unique[i] == unique[j]) {
	                count++;
	                result+= unique[i];
	            }
	            
	            
	        }
	        
	        
	
	  }   
	 return result;
}
}