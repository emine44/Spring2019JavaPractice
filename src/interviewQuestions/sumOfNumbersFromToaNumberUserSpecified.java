package interviewQuestions;
import java.util.Scanner;
public class sumOfNumbersFromToaNumberUserSpecified {

	public static void main(String[] args) {
		
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter a number");
    int number =scan.nextInt();
    int sum = 0;
    for(int i=0; i<=number; i++) {
    	
    	sum= sum + i;
    }
    System.out.println(sum);	
    	

	}

}
