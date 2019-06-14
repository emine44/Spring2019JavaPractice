package day21;
import java.util.Scanner;
public class WarmUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); 
        int num1 =0;
        int num2 =0;
        int i = 0;
        boolean b = (num1+num2)<100;
        
        do {
        	System.out.println("Enter first number:");
            num1 = scan.nextInt();
            
             System.out.println("Enter second number:");
             num2 = scan.nextInt();
              i++;
              System.out.println(i);
             if(i==3) {break;}
  
	
        }while(b);

        System.out.println("END");  
        
        }

        } 
	
   
        
        
        
     
