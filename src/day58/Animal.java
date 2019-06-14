package day58;

public class Animal {

	public void makeNoise() {
		System.out.println("Let sub class object make noise");
	}
}

class Cat extends Animal{
	
	@Override
	public void makeNoise() {
		System.out.println("cat make noise");
	}
	
}

class Dog extends Animal{
	
	@Override
	public void makeNoise() {
		System.out.println("dog make noise");
	}
	
}

class Horse extends Animal{
	
	@Override
	public void makeNoise() {
		System.out.println("horse make noise");
	}
	
}