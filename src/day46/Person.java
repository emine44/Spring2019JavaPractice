package day46;

public class Person {

	
	String name;
	float hight;
	char gender;
	
	static String race = "human";
    static int counter;
	
    public Person() {
    	
    	//counter++;
    }
    
    
    
	public Person(String name, float hight, char gender) {
		this.name = name;
		this.hight = hight;
		this.gender = gender;
		
		counter++;
	}
	
	
}
