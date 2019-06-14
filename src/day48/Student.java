package day48;

public class Student {

	private String name;
	private int age;
	private float height;
	private char gender;
	private int id ;
	
	static int counter;
	
	public Student(String name, int age, float height, char gender, int id) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.gender = gender;
		this.id = id;
		counter++;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", height=" + height + ", gender=" + gender + ", id=" + id
				+ "]";
	}
	
}
