package day31;

import java.util.Arrays;

public class Task {

	public static void main(String[] args) {
		ArrayPrinterWithDash(new int[] {6,8,1,6,9,2});
		
		
	   /*methods:
		*reusable code,maintainable code, write once use it whenever needed
		*3 questions to ask while creating a method
		*-does this method needs an object or not when being called
		*--->if not we use static keyword
		*-does this method take external data or not?
		*--->if it does not we just end method name with empty()
		*--->if yes put data type and name; parameters are separated by comma
		*-does this method return a value after being called
		*--->if not use void
		*--->if yes out the type of the variable it return
		*
		*/

	}
	
	
	
public static void ArrayPrinterWithDash(int[] manyItems) {

		for(int each : manyItems) {
			System.out.print(each +"-");
}
		
		System.out.println();
		
	}


}
