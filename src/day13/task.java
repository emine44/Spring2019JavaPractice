package day13;
import java.util.Scanner;
public class task {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the first name");
	String name1 = scan.next();
	System.out.println("Enter the second name");
	String name2 = scan.next();
	
	int name1Count = name1.length();
	int name2Count = name2.length();
	
	char result = ( name1Count>name2Count)? name1.charAt(1): name1.charAt(2);
	System.out.println(result);
	
	
	char lastCharacter = name2.charAt(name2.length()-1);
	switch(lastCharacter) {
	case 'a':
		System.out.println(name2 + "  a ");
	    break;
	case 'b':
		System.out.println(name2 + "  b " );
	    break;
	
	case 'c':
		System.out.println(name2 + "  c ");
	    break;
	    
	   default :
		   System.out.println(name2 + "  invalid");
	    break;
	}
	
	
     
}
}