package day8;
import java.util.Scanner;
public class stringEquality {

	public static void main(String[] args) {
		/*
		 * String name = "emine";
		 * 
		 * // boolean(b = (name == "Lachyn")) // we use a method from String class
		 * called equals
		 * 
		 * boolean b = name.equals("emine"); System.out.println(b);
		 */
		String myName = "emine";
		Scanner input = new Scanner(System.in);
	    System.out.println("Please enter a name"); 
	    String name = input.next();
	    if(name.equals(myName)) {
	    	System.out.println(name);
	    		    }
	    else {
	    	System.out.println("It is not my name");
	    }
		  
	}

}
