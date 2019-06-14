package day19;
import java.util.*;
public class WarmUp {

	public static void main(String[] args) {
		
		
	
		Scanner scan = new Scanner(System.in);
		
		String theAnswer = "";
		 while(!(theAnswer.toUpperCase() .contains("JAVA"))) {
			 
			 System.out.println("What is your sentence");
			 theAnswer = scan.next();
		 }
			
		System.out.println("You said java!");

	}
	}


