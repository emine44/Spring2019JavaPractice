package day24;

public class NestedLoopPractice {

	public static void main(String[] args) {
		// WARM UP TASKS
	    /*
	     * 1, print java 5 times in one row java java java java java 
	     * print total of 5 rows of above message *
	     */
		String result = " ";
	    for (int i = 1; i <= 5; i++) {
	    
	      for (int j = 1; j <= 5; j++) {
	        System.out.print("java ");
	      }
	      System.out.println();
	    }
		
	 // WARM UP TASKS
	    /*
	     * 2, print 1-5 in one line print above line 5 more times as we did in class NOW
	     * : modify this code to print 
	     * 1 
	     * 12 
	     * 123 
	     * 1234 
	     * 12345
	     */
	    
    for (int i = 1; i <= 5; i++) {
	      for (int j = 1; j <= i; j++) {
	        System.out.print(j + " ");
	      }
	      System.out.println();
    }
		
	 // WARM UP TASKS
        /*
         *  3, Print A-Z  26 times in 26 rows
         *    NOW :
         *     Modify the code to print as below
         *     A
         *     AB
         *     ABC
         *     ABCD
         *     ABCDE
         *     ...
         *     ...
         *     ALL THE WAY TILL Z
         * */
////for (int i = 1; i <= 26; i++) {
////for (int i = 65; i <= 91; i++) {
for (int i = 'Z'; i <= 'A'; i++) {

  for (int c = 'A'; c <= i; c++) {
    System.out.print( (char)c + " ");
  }
  System.out.println();
  
}
	}

}
