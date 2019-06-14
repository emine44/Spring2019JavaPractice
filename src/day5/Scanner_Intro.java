package day5;//interactive programs with scanner
import java.util.Scanner;// import
public class Scanner_Intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner userInput = new Scanner(System.in);//create scanner object
		//System.out.println("Please enter your name");//prompt
	/*	//int i = 100;
		// next() method will read one word
       String firstName = userInput.next();//keyboard input
        //String sentence  =  userInput.nextLine();
        
        System.out.println("Welcome " + firstName);
        //System.out.println(sentence);
      
        */
		
		//First import scanner
		//Second define scanner name Scanner userInput = new Scanner(System.in);
        //Assign  variable to that scanner name String firstName = userInput.next();
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter your first name");
		String name=userInput.next();
		
		System.out.println("Enter your last name");
		String lastName=userInput.next();
		
		System.out.println("Your full name is " + name +" " + lastName);
	}

}
