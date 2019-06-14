package day31;

import java.util.Scanner;

public class MethodWithMUltipleParameter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str= scan.next();
		int num =scan.nextInt();
		
	//repeat("java",5)
		repeat(str,num);
		
		
		
		

	}
	public static void repeat(String str, int num) {
		
		for(int i=0; i<num; i++) {
			System.out.print(str+ " ");
		}
		
		
		
	}
}
