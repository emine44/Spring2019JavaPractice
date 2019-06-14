package day54;

public class finalKeyword {
	
	
	private final String SCHOOL_NAME ;
	public static final int MAX_NUMBER_OF_STUDENTS;
	static {
		MAX_NUMBER_OF_STUDENTS=55;
	}
	
	public static final String FEBRUARY ="February";
	
	String name;
	public finalKeyword() {
		SCHOOL_NAME = "Cybertek";
		//MAX_NUMBER_OF_STUDENTS=100;// it will not work
	}
	

	public static void main(String[] args) {
		
		final int MAX;
		MAX=110;
		System.out.println(MAX);

	}

}
