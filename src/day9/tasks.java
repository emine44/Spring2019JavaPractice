package day9;
import java.util.Scanner;
public class tasks {

	public static void main(String[] args) {
		System.out.println("*****Welcome Amazon Shopper*****");
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your total price");
		double price = scan.nextDouble();
		
		System.out.println("Are you prime member?");
		
		boolean isPrimeMember =scan.nextBoolean();
		if(isPrimeMember==true) {// if(isPrimeMember) works also
			System.out.println("Free Shipping!!");
		}
		else if(price>35) {
			
				System.out.println("Free Shipping!!");
			}
			
			else {
				price+=5;
				System.out.println("Shipping fee: $5 -- Total: " + price);
			}
		}

	}


