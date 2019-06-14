package day20;
import java.util.Scanner;
public class TASK {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int entry = scan.nextInt();
		int x = 0;
		int result = 0 ; 
		
		do{
			result = x + result ;
			System.out.println("x: " + x + " sum: " + result);
			x++;
			if(result>40) {break;}
			
		}while(x<=entry);
		
		System.out.println(result);
	}

}
