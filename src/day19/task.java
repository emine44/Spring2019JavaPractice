package day19;

import java.util.Scanner;

public class task {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter canim biseyler");
		
		 String  star =scan.nextLine();
		 
		 String result = " " ;
		 
		 
		 int counter = 5;
		 
		 while(counter>0) {
			 
			counter --;
			System.out.println(star); 
			star = star + "*";
		 }
	 
	}
}
