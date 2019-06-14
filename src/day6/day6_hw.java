package day6;

import java.util.Scanner;

public class day6_hw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String adminUser = "admin";
		int adminPassword = 235;
		String user = "emine";
		int pass = 123456;
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter your username");
		String userName = input.nextLine();
		System.out.println("Enter your password");
		int passWord = input.nextInt();
		if (userName.equals(adminUser)) {

			System.out.println("Log in is successful");
		} else {

			if (userName.equals(user) && (passWord == pass)) {

				System.out.println("Log in is succesfull");
			} else {
				System.out.println("Access is denied");
			}

		}

	}

}
