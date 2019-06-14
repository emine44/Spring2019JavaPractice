package day23;

public class CreatingArray3 {

	public static void main(String[] args) {
		// one array is created whit a given size
		//it cannot be changed
		
		int [] numbers = new int[2];
		
		// second way to create an array with predefined items
		
		int[] nums = new int[] {1,2,3,4,5,-6,0,4,} ;
		
		//getting the size of any array
		
		int size = nums.length; // there is no parenthesis
		System.out.println(size);
		
		// final way to create an array
		int[] num2 = {5,23,458,-96,965,357,1,5,6,7};
		int l = num2.length;
		System.out.println(l);
		
		
		
	}

}
 