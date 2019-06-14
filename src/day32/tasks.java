package day32;

public class tasks {

	  public static void main(String[] args) {

         boolean ageOr = isAdultOrNot(15);
	     System.out.println(ageOr);
	     
	     
	     System.out.println(tasks.isAdultOrNot(36));
	     
	     
	     
	     
	     int bigger = giveMeBiggerNumber(236, 225);
	     System.out.println(bigger);
	     System.out.println(tasks.giveMeBiggerNumber(5, 2000));
	     
	    
	  }
	  // TASK 2 
	  
	  
	  
	  public static boolean isAdultOrNot(int number) {
	    
	   if(number>18) {
		   return true;
	   
	   }
	   
	   else
		   return false;
	    
	  }
	  
	  
	  
	  public static int giveMeBiggerNumber(int number1, int number2) {
		    
		   if(number1>number2) {
			   return number1;
		   
		   }
		   
		   else
			   return number2;
		    
		  }
	  
	  
	  

	}