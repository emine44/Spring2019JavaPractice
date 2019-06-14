package day19;

import java.util.Scanner;

public class BreakingOutOfLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter username");
		String word = scan.next();
		
		while(!(word.equals("username"))){
			
			System.out.println("Enter username");
			word = scan.next();
			break;
		}

	}

}
