package day11;

import java.util.Scanner;

public class taskBadLogic {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter number");
		int num = scan.nextInt();
		if(num%5==0 && num%3==0) {
			System.out.println("fizz buzz");
		}
		if(num%5==0) {
			System.out.println("fizz");
		}
		
		if(num%3==0) {
			System.out.println("buzz");
			

	}

}
