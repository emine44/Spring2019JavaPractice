package day19;
import java.util.Scanner;
public class palindromeAgain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter canim biseyler");
		String name =scan.nextLine();
		 String reversed = " ";
		 int counter = name.length();
		 while(counter>0) {
			 counter --;
			 reversed =  reversed + name.charAt(counter);
			 System.out.println(reversed);
			
			 
		 }
		 System.out.println("Palindrome " + name.equals(reversed));
	}

}
