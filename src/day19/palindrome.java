package day19;
import java.util.Scanner;
public class palindrome {
	
	// in order to reverse a String
	//we can getting the chars in reversed order
	// since the order is decrementing , we use--
	// in order to save the reversed word, we need a container 
	//before we reverse the word, just put empty value in container
	// while we looping through each chars
	//

	public static void main(String[] args) {
		
		Scanner  scan = new Scanner(System.in);
		System.out.println("Enter a name");
		String name =scan.nextLine();
		
		String reversed = " ";
		int count = name.length();
		
		while(count>0) {
			
        count --;
		//System.out.println(name.charAt(count));
		reversed = reversed + name.charAt(count);
		//System.out.println(reversed);
	}
		System.out.println("Palindrome " + name.equals(reversed));
	
	}

}
