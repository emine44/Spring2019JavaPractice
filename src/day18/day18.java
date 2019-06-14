package day18;
import java.util.Scanner;
public class day18 {

	public static void main(String[] args) {
		
		
		
		//DRY Principle
		// DO NOT REPEAT YOURSELF
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter number");
//		int bill = scan.nextInt();
//		if(bill==5 || bill==10) {
//			System.out.println("");
//		}
//		
//		else {
//		
//        while(bill!=5 || bill!=10) {
//			
//			System.out.println("enter again");
//			bill=scan.nextInt();
//			
//		}}
		Scanner scan = new Scanner(System.in);
		System.out.println("seviyorum de!!");
		String theAnswer = "";
		 while(!(theAnswer.equalsIgnoreCase("evet"))) {
			 
			 System.out.println("seviyorum de");
			 theAnswer = scan.next();
		 }
			
		System.out.println("yalan soyluyorsun!");
	}

}
