package day30;

import java.util.Scanner;

public class task2 {
	
	
    public static void printTheDoubledNumber(int number) {

    	
    	
		System.out.println("Doubled Number is : "+  number*2);
		

	}
    
    public static void checkForAge(int age) {
    	
    	
    	if (age>18)
    		
    		System.out.println("Adult");
    	
    	else if (age>10)

    		System.out.println("Not Adult");
    	else 
    		System.out.println("Child");

	}

	public static void main(String[] args) {
		//task 1
		printTheDoubledNumber(5);
		
		//task 2
		
		checkForAge(6);
		
	}

}
