package day31;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner scan =new Scanner (System.in);
		System.out.println("enter num1");
		int num1 =scan.nextInt();
		
		System.out.println("enter num2");
		int num2 =scan.nextInt();
		
		System.out.println("enter sign");
		String sign = scan.next();
		
		Add(num1,num2);
		Substract(num1,num2);
		Multiply(num1,num2);
		Divide(num1,num2);
		Mod(num1,num2);
		System.out.println("**********");
		Calculate(sign, num1,num2);
		
	}
	
	public static void Add(int a, int b){
		System.out.println("num1+num2: "+ a+b);
	
	}
	public static void Substract(int a, int b){
		System.out.println("num1-num2: "+ (a-b));
	}
	public static void Multiply(int a, int b){
		System.out.println("num1*num2: "+ a*b);
	}
	public static void Divide(int a, int b){
		System.out.println("num1/num2: "+ a/b);
	}
	public static void Mod(int a, int b){
		System.out.println("num1 mod(num2): "+ a%b);
	}
	
	public static void calculate(char operator,int firstNum, int secNum) {
	    
	    switch (operator) {
	    case '+':
	      System.out.println("result of addition is : " + (firstNum+secNum));
	      break;
	    case '-':
	      System.out.println("result of addition is : " + (firstNum-secNum));
	      break;
	    case '*':
	      System.out.println("result of addition is : " + (firstNum*secNum));
	      break;
	    case '/':
	      System.out.println("result of addition is : " + (firstNum/secNum));
	      break;
	    case '%':
	      System.out.println("result of addition is : " + (firstNum%secNum));
	      break;

	    default:
	      System.out.println("INVALID OPERATOR");
	      break;
	    }
	    
	    
	  }
	  
}
