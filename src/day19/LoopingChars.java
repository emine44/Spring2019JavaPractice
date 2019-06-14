package day19;
import java.util.*;
public class LoopingChars {

	public static void main(String[] args) {
		
//		Scanner scan = new Scanner(System.in);
//		
//		String str = scan.nextLine();
//		
//		char firstChar = str.charAt(0);
//		
//		System.out.println('a'>'b');
//		
//		if(firstChar>= 'a' && firstChar<'z') {
//			
//			System.out.println("lowe case letter");
//		}
//		else {
//			
//			System.out.println("NOT a-z");
//		}
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your string");
		String str = scan.nextLine();
		
		char firstChar = str.charAt(0);
		if(Character.isDigit(firstChar)) {
			
			System.out.println(str + " starts with a number");
		}
		else {
			
			System.out.println(str + " does not start with a number");
		}
		
		if(Character.isUpperCase(str.charAt(str.length()-1))) {
			System.out.println(str + " ends with an upper case letter");
		}
		else {
			
			System.out.println(str + " does not end  with an upper case letter");
		}
		
		

	}

}
