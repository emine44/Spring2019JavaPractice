package day53;

public class EBook extends Book {
	
	//SUB CLASS CAN HIDE CLASS'S FIELD BY REDECLARING IT
	//THE ONLY THING MATTER IS THE <NAME>
	float name =12.22f;
	long page=100;
	//@Override ONLY FOR INSTANCE METHOD
	static double weight =-1;
	
	
	public static void main(String[] args) {
		EBook e =new EBook();
		System.out.println(e.name);
		e.showValues();
		
	}
	
	public void showValues() {
		System.out.println(super.name + " " + this.name);
		System.out.println(super.page + " " + this.page);
		//static fields can be accesses directly in instance method
		//or we can make it obvious to call in static way EBook.weight
		System.out.println(super.weight + " " + this.weight);
	}
	
	
	

}


//-------------
// We can have more than one in class in one source file
//However only one should be public


class Book{
	String name ="emine";
	int page =23;
	double weight;
	
}