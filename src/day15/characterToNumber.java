package day15;
import java.util.Scanner;
public class characterToNumber {

	public static void main(String[] args) {
		
		char c1 = 'A';
		int cNum = c1;
		System.out.println(cNum);
		//TASK
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name");
		String name=scan.next();
		char first =name.charAt(0);
		char last = name.charAt(name.length()-1);
		int f = first;
		int l = last;
		
		System.out.println("first letter:" + f + " last letter: " + l);


	}

}
