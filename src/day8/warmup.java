package day8;

import java.util.Scanner;

public class warmup {

	public static void main(String[] args) {
		/* TASK 1
		 * Scanner input = new Scanner(System.in);
		 * System.out.println("Please enter 2 numbers"); int num1 = input.nextInt(); int
		 * num2 = input.nextInt();
		 * 
		 * 
		 * if((num1+num2)>100) { System.out.println("You entered great numbers"); } else
		 * { System.out.println("Looks like your sum is less that 100"); }
		 */
		// TASK 2
		int i = 10 ,  j = 10;
		if((i>5) && (j%2==0) && (j+i == 30)) {
			
			System.out.println("meet the requirements");
			
		}
		else {
			System.out.println("does not meet the requirements");
		}
	}

}
