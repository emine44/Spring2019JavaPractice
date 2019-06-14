package day11;
import java.util.Scanner;
// if you do not use the if statement with curly 
//braces id displays first line

public class conditionalValueAssignments {

	public static void main(String[] args) {
	    String result;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your score");
		int score = scan.nextInt();
		if(score>75) {
		result = "pass";	
				System.out.println("Your result is: "  + result);
		}
		else {
			result = "fail";
			System.out.println("Your result is: "  + result);
		}
	   

	}

}
