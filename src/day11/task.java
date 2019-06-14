package day11;
import java.util.Scanner;
public class task {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter number");
		int num = scan.nextInt();
		if(num%5==0 && num%3==0) {
			System.out.println("fizz buzz");
		}
		else if(num%5==0) {
			System.out.println("fizz");
		}
		
		else if(num%3==0) {
			System.out.println("buzz");
			}

	}

}
