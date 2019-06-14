package day28;

import java.util.Arrays;

public class ForEachLoopmODIFYiTEM {

	public static void main(String[] args) {
		// for each loop should never to be used to mofify
		//array items
		
		int i = 10;
		int j = i;
		j=20;
		
		System.out.println(i);
		
		int arr[] = {1,2,3,4,5};
		
	for (int k = 0; k < arr.length; k++) {
		
		int eachItem =arr[i];
		eachItem = 20;
		
		
	}
	System.out.println(Arrays.toString(arr));	

	}

}
