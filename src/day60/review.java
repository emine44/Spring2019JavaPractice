package day60;

import day42.Dog;

public class review {

	public static void main(String[] args) {
		//Polymorphism is ability of the object taking many form
		//AKA an object can be refreed by its own type of it's super class type
		//or it's interface type that the class implemented
		
		//Power of Polymorphism----
		//making correct decision at runtime according actual object ytpe to call the overriden
		//version of the method
		//Animal a1 = new Dog();
		//a1.makeNoise();
		
		//This will give us alot of flexibility while writing code
		//we can easily swap the implementation to get correct behavior at runtime
		//we can group objects together by it's general types and take general actions without worrying about details
		
		//Animal a2 =new Horse();
		//What you can access using a2 reference
		
		//ONLY themembers that available in Animal class
		// in order to access to access Horse specific members we must have a Horse reference
		
		
		//ONLY REFERENCE TYPE DECIDES WHAT IS ACCESSIBLE US
		Object o =new Dog();
		System.out.println(o.toString());
		
		
		
		
		
		
		
		
		
		

	}

}
