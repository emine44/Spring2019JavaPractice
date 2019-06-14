package day12;

import java.util.Scanner;

public class task {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the weather condition:");
		String weather = scan.nextLine();
		String action;
		
		action = (weather.equals("sunny"))? "Go out":"Stay at home";
		System.out.println(action);

	}

}
