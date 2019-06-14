package day16;
import java.util.Scanner;
public class task {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name");
		String str = scan.nextLine();

	
		boolean yesOrNo = ((str.startsWith("A")) && (str.endsWith("x")))? 
		true:false ;
		System.out.println(yesOrNo);
		
		System.out.println(str.lastIndexOf("a"));
		
		if(str.length()>2) 
				System.out.println(str.charAt(str.length()/2));
		if(str.length()%2!=0) {
			System.out.println(str.charAt(str.length()/2));
		}
		else {
			int a = str.length()/2;
			System.out.println(str.substring(a-1,a+1));
		}
			  
			
	}

}
