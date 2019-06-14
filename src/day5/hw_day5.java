package day5;
import java.util.Scanner;

public class hw_day5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your name and lastname");
		String fullName = input.nextLine();
		System.out.println("Your name is " + fullName );
		System.out.println("Please enter your city");
		String city = input.next();
		System.out.println("Your city is " + city);
		System.out.println("Please enter  your state");
		String state = input.next();
		System.out.println("Your state is " + state);
		System.out.println("Please enter your nationality");
		String nation = input.next();
		System.out.println("Your nationality is " + nation);
		System.out.println("***************************");
		System.out.println(fullName + " " + city +  " " + state + " "+ nation );
		
		

	}

}
