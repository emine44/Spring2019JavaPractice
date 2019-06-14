package day42;

public class CpiyingA_VariableValue {

	public static void main(String[] args) {
		
		
		
		Dog d1 = new Dog();
		d1.name ="puppy";
		d1.breed = "pitball";
		
		

		Dog d2 = d1;
	
		d2.name = "yumak";
		
		
		
   System.out.println(d2.name);
		
		

	}

}
