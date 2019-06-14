package day29;
import java.util.Arrays;
public class warmUp {

	public static void main(String[] args) {
		
		//task 1
		String [][] pizza= {{"mushroom","black olive","green pepper"},
		          {"spinach","green pepper","mushroom"},
		          {"black olive","black olive","spinach"},
		          {"mushroom","mushroom","red pepper"},
		          {"banana pepper","spinach","red pepper"},
		          {"mushroom","green pepper","green pepper"},
		          {"spinach","green pepper","mushroom"}};
		//task 2
		
		System.out.println(Arrays.deepToString(pizza));
		
		
		//Task 3 print all the value inside using for loop
		
		for(String [] slice : pizza) {
			
			for(String topping : slice ) {
				
				System.out.println(topping + "|");
				
				
			}
		}
		
		//Task 4 print all the value inside using for loop 
		//and skip 3rd slice of pizza
		
		
		
		for(int i=0; i<pizza.length; i++) {
			
			System.out.println("Slice number: " +(i+1));
			if(i==2) {continue;}
			
			for(int j =0; j< pizza[i].length; j++ ){
				
				System.out.println(pizza[i][j] + "|");
			}
			System.out.println();
		}
		
		
	
	}

}
