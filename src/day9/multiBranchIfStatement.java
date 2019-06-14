package day9;
import java.util.Scanner;
public class multiBranchIfStatement {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to Okta to Slack");
		
		int lengthOfName = scan.nextInt();
		
		if(lengthOfName>22) {
			System.out.println("Slack cannot take more than 22 char21");
			//lengthOfName = 21;
			System.out.println("Username has been adjusted");
		}
		System.out.println("Succesfully added user");
		
	}

}
