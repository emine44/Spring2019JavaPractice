package day15;
import java.util.Scanner;
public class amazonSearchTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Which items you are looking for?");
		String itemToSearchFor = sc.nextLine();
		System.out.println("Amazon.com : " + itemToSearchFor);
		
		String expectedResult = "Amazon.com : iPad";
		String actualResult = "Amazon.com : " + itemToSearchFor;
		
		
		if(expectedResult .equalsIgnoreCase(actualResult )) {
			System.out.println("Test pass for iPad");
		}
		else
		{System.out.println("Test fail for iPad");}
	}

}
