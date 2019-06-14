package day9;
import java.util.Scanner;
public class VariableAssignmnetBeforeUsing {

	public static void main(String[] args) {
		// local variables must be assigned to a value before usage
		// if local variable has a single chance not to get a value before usage, 
		//compiler will not compile the code
		int i;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Do you ant to give value to i");
		String yesNoAnswer = scan.next();
		
		if(yesNoAnswer.equals("yes")) {//equals.IgnoreCase 
			System.out.println("YOU SAID YES");
			i=10
		}else {
			System.out.println(i);
		}

	}

}
