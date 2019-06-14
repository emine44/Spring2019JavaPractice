package day31;

import java.util.Arrays;

public class MwethodThatTakeArray {
	
	  public static void reportBiggerArray(int[] nums1,int[] nums2) {
			
	        if(nums1.length>nums2.length) 
		      System.out.print(Arrays.toString(nums1));
	        
	        else
		      System.out.print(Arrays.toString(nums2));

		}

	public static void main(String[] args) {
		reportBiggerArray(new int[]{2,6,9,8,12} ,new int[] {5,9,6} );

	}

}
