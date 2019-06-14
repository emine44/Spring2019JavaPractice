package day9;

import java.util.Scanner;

public class warmup {

	public static void main(String[] args) {
		long preAccountNum = 111222333L;
		String prePassword = "emine456";

		System.out.println("Welcome to Cybertek Banking App");
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your account number");
		long accountNum = input.nextLong();
		System.out.println("Please enter your password");
		String password = input.next();
		if((accountNum==preAccountNum) && (password.equals(prePassword))) {
			
			System.out.println("Login is succesfull");
		}
		else {
			System.out.println("Login is failed");
		}
	}

}
