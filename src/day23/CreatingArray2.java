package day23;

public class CreatingArray2 {

	public static void main(String[] args) {
		
		int[] numbers = new int [2];
		//Assigning value to array
		
		numbers[0] = 10;
		numbers[1] = 10;
		
		// ArrayIndexOfBoundsException will occur
		//when you go out of range
		// After creating array's capacity, you are not 
        //allowed to change it 
		
		numbers [0] =100;// last value always wins
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		
		
		numbers = new int [4];
		System.out.println(numbers[0]);

	}

}
