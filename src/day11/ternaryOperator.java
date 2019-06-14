package day11;
import java.util.Scanner;
public class ternaryOperator {

	public static void main(String[] args) {
//		int score = 98;
//		String abc ="";
//		abc = (score>75)? "pass" : "fail";
//        System.out.println(abc);
//  TASK      
		
		/*
		 * Scanner scan = new Scanner(System.in); System.out.println("Enter number");
		 * int number = scan.nextInt();
		 * 
		 * String result;
		 * 
		 * result = (number%5==0 && number%5==0)? "fizzBuzz" : "noFizzBuzz";
		 * System.out.println(result);
		 */
		Scanner scan = new Scanner(System.in);
	    System.out.println("Enter number1:");
			int num1 = scan.nextInt();
			System.out.println("Enter number2:");
			int num2 = scan.nextInt();
			
	    int value = (num1 >num2) ?  num1:num2 ;
			System.out.println(value); 
	}

}
