package Mentoring;

import java.util.ArrayList;

public class MethodArrayList {

	public static void main(String[] args) {
		
		ArrayList <Integer> list1 = new ArrayList<>();
		System.out.println(list1);
		
		// add all odd numbers between 1-10 into your array list
		
		for(int i=1; i<=10; i++ ) {
			
			if(!(i%2 == 0)) {
				list1.add(i);
			}
		}
		System.out.println(list1);

	}

}
