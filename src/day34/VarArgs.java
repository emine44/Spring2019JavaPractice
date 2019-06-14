package day34;

public class VarArgs {

	public static void main(String[] args) {
		// Vararg---> variable number of arguments
		
		// we are passing 2 external data to a method that have 
		//two parameters
		
		//varArgs is used to create a method
		//
		           //argument
		add2Numbers(5,9);
		addManyNumbers(new int[] {1,5,98,63});
		addManyNumbers(9856,45,989,465,12);

	}
	
	                               //method parameter
	public static void add2Numbers(int num1, int num2) {
		
		System.out.println(num1+num2);

	}
	
	public static void addManyNumbers1(int [] manyNums) {
		
		int sum =0;
		for(int eachNum :manyNums) {
			sum += eachNum;
			
		}
		System.out.println(sum);
		}
     public static void addManyNumbers(int... manyNums) {
		//VARARGS are seen exactly the same 
    	 // as an array inside method body

 		int sum =0;
 		for(int eachNum :manyNums) {
 			sum += eachNum;
 			
 		}
 		System.out.println(sum);

	}	
		
		
	}


