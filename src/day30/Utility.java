package day30;
import java.util.*;
public class Utility {
	
	public static void printUsersInput() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name please");
  		
        String name =scan.next();
        System.out.println("You entered : " + name);
		
	}

	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) {
			printUsersInput();	
		}
		
		
		
		
		
	}

}
