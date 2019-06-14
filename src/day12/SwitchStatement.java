package day12;
import java.util.Scanner;
public class SwitchStatement {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers: "); 
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println("Enter operator");
        String operator = scan.next();
        switch(operator) {
        case("+"):
        System.out.println("The result is: " + (num1 +num2));
        break;
        
        case("-"):
            System.out.println("The result is: " + (num1 -num2));
            break;
        
        case("*"):
            System.out.println("The result is: " + (num1 *num2));
            break;
           
        case("/"):
            System.out.println("The result is: "+  (num1 /num2));
            break;
        
        default:
        	System.out.println("Invalid operator");
        }
	}

}
