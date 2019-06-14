package day7;

import java.util.Scanner;

public class conditionalStatement {

	public static void main(String[] args) {

		/*
		 * if()// put some boolean expression { // do some actions else { //do something
		 * else if it is false } }
		 */
		// TASK1
		/*
		 * Scanner input = new Scanner(System.in);
		 * System.out.println("Please enter your score"); int score = input.nextInt();
		 * 
		 * if(score>70) { System.out.println("YOU PASSED !"); } else {
		 * System.out.println("YOU FAILED!"); }
		 * 
		 */ // command + shift+f
		Scanner input = new Scanner(System.in);

		double priceIphone = 599.99;
		double priceIpad = 899.99;

		System.out.println("Please enter number of Iphone");
		int countIphone = input.nextInt();
		
		System.out.println("Please enter number of Iphone");
		int countIpad = input.nextInt();
		
		double totalPrice = (countIphone * priceIphone) + (countIpad * priceIpad);
		System.out.println("Your total price is: " + totalPrice);
		
		System.out.println("Please enter your budget");
		double budget = input.nextDouble();

		
		
		double difference = totalPrice - budget;
		if (totalPrice > budget) {
			System.out.println("You are overbudget");
			System.out.println("You need extra: " + difference+ "$");

		}

		else {

			System.out.println("You are not over your budget");

		}
       
	}

}
