package day23;

import java.util.Random;

import java.util.Arrays;

public class RandomNumbers {

	public static void main(String[] args) {
		
		
		int[] numbers = new int[5];

        for (int i = 0; i <= numbers.length-1; i++) {
            numbers[i] = (int)(Math.floor(Math.random() * 100));
            //System.out.print(numbers[i] + " ");
        }
        System.out.println(Arrays.toString(numbers));
		
		
		

	}

}
