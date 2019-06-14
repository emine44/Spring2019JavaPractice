package day15;

import java.util.Scanner;

public class SearchForJavaVerifySearchResult {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Which items you are looking for?");
		String search = sc.nextLine();
        String a =search.substring(0,5);
		if(search.indexOf("About") ==0) {//(search.substring(0,5)).equals("About") 
			System.out.println("it started with about");
		}
		else
		{System.out.println("it did not start with about");}
		
		if(search.indexOf("results")>=0) {
			
			System.out.println("it contains result");
		}
		else
		{System.out.println("it does not contain result");}

	}

}
