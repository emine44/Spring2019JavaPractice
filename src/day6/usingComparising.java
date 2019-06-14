package day6;

import java.util.Scanner;

public class usingComparising {

	public static void main(String[] args) {
		
		Scanner type = new Scanner(System.in);
		
		System.out.println("Enter number of tomatoes");
		int num1 = type.nextInt();
		
		System.out.println("Enter number of onions" );
		
		int num2 = type.nextInt();
		
        System.out.println("Enter number of cucumbers" );
		
		int num2 = type.nextInt();
		
		boolean isGreater = num1>num2;
		
		System.out.println("IS NUMBER1 GREATER THAN NUMBER2? 12" + isGreater );
	}

}
