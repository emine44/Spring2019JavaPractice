package day46;

public class PersonCounting {

	public static void main(String[] args) {

		Person p1 =new Person("Emine", 6.11f , 'M');
		Person p2 =new Person("Zukhra", 5.88f , 'M');
		//Person p3 =new Person("fgh", 5.88f , 'M');
		Person p3 =new Person();
		//System.out.println(p1.counter);
		//System.out.println(p2.counter);
		System.out.println(Person.counter);

	}

}
