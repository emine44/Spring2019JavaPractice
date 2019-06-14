package day33;

import java.util.Arrays;

public class ReturningMultipleValue {

	public static void main(String[] args) {
		double b[] = {5,5,6,9};
		double z[] = {5,56,89,13};
		int aa[] = perform();
		// calling the method in one shot
		System.out.println(Arrays.toString(perform()));
		System.out.println(Arrays.toString(combineArray(b, z)));
	}
	
	public static int[] perform() {
		System.out.println("Action");
		int arr[] = new int [] {1,2,3} ;
		return arr;
		
		//System.out.println();
	}
	
	
	public static double[] combineArray(double [] arr1, double []arr2) {
		
		double[] both1 = new double [arr1.length + arr2.length];
		
		for(int i =0; i<arr1.length; i++) {
			both1[i]= arr1[i];
			
		}

		for(int i =0; i<arr2.length; i++) {
			both1[arr1.length+i]= arr2[i];
			
		}
		
		
		return both1;
		
	}
	
	

}
