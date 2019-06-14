package day53;

public class TropicalFruit extends Fruit{


	
	public static void main(String[] args) {
		
		generateJuice();
		Fruit.generateJuice();
		TropicalFruit.generateJuice();

	}
	
	 // hiding static method
	 public static void generateJuice() {
		 
		 System.out.println("generate Triopical juice"); 
	 }
	 
	 
}
	
	
	
	
	 class Fruit{
		 
		 
		 public static void generateJuice() {
			 
			 System.out.println("generate general juice"); 
		 }
		 
		 
		 
	 }

	 
	 

