package day21;

public class ContinuePractice {

	public static void main(String[] args) {
	int in , jn , kn; 
		
		for (int i = 1; i <=50; i++) {
		      
		      if (i %2 !=0) {
		    	  System.out.print(i + "*");
		    	  System.out.println("");
		    	  
		      }
		      in = i+i;}
	     for (int j = 1; j <=50; j++) {
		      if(j %4 ==0) {
		    	  System.out.print(j+ "*");
		    	   
		      }
		      jn = j+j;
		      }
		      
	     for (int k = 1; k <=50; k++) {
	    	 System.out.println(k + "*");
		      if(k %3 ==0  && k %3 ==0 ) {
		    	  continue;
		      }
		    
		      kn = k+k;
		      }   
System.out.println(kn+in+jn);
	     
	     
	     
	     
	     
	     
	}
	}
