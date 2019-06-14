package day18;
import java.util.Scanner;
public class WhileLoopMultipleCondition {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
		int user = scan.nextInt();
		
		if(user ==5) {
			int x=1;
			while(x<=5) {
				System.out.print(x);
				x++;
			
			}	
		}
		if(user ==7) {
			int x=1;
			while(x<=7) {
				System.out.println(x);
				x++;
				
			}

	}
	}
}

