package day31;

import java.util.Scanner;

public class MethidWithMoreParams {
	
	public static void login(String user, String password, boolean rememberMe) {
		
		System.out.println("You entered user name : " + user);
		System.out.println("You entered password : " + password);
		System.out.println("You checked remember me checkbox"
				+ "if it is true : " + rememberMe);
		if(!rememberMe) {System.out.println("You did not check rememberMe checkbox " + rememberMe);}
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter username:");
		String user =scan.next();
		
		System.out.println("Enter password:");
		String password =scan.next();
		
		System.out.println("Mark the checkbox :");
		boolean rememberMe =scan.nextBoolean();
		
		login(user,password,rememberMe);

	}

}
