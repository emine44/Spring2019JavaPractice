package day28;

public class TwoDArray3rdArray {

	public static void main(String[] args) {
		
		
		//int [] nums = {1,23,4};
		
		int [][] data = {{2,14,3} , {4,5}, {9,7}};
		
		for(int[] slice: data) {
			
			for(int topping : slice) {
			
			System.out.print(topping + " ");
		}
		
		System.out.println(" ");
	}
		
	
	for(int j = 0; j< data.length; j++) {
		
		System.out.print("Row Number" + (j+1) + " : ");
	
	    for(int k =0; k<data[j].length ; k++) {
	    	
	    	System.out.print(data[j][k] + " ");
 }
	
	
	
	
	
	
	
	}
	
	
	
	
	
	}
	

}
