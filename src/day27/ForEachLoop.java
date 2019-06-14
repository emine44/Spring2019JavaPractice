package day27;

public class ForEachLoop {

	public static void main(String[] args) {
		
		
		int [] nums = {1,3,567,11,22};
		
		for (int i = 0; i < nums.length; i++) {
			
			int eachItem = nums[i];
			System.out.println(eachItem);
			
		}
		//for each loop syntax
//		for(eachItemDataType variable name: collectionVariable) {
//			your action is here
//		}
//      for each loop or enhanced for loop
//		for each loop can only be used for looping through collection type
		
		for(int eachItem : nums) {
			System.out.println(eachItem);
		}
		
		String names[] = {"e", "m","i","n","e"};
	    for(String name : names) {
	    	System.out.print(name);
	    }

	}

}
