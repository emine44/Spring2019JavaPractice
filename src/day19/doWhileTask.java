package day19;
import java.util.Scanner;
public class doWhileTask {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int i =scan.nextInt();
		int target =scan.nextInt();
		do {
			System.out.print(i++);
		}
   while(i<101);
		
		System.out.println(" ");
		int k = 5;
		do {
			System.out.print(k--);
		}
   while(k>6);
	
	}

}
