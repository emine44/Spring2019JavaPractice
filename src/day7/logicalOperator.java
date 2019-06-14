package day7;

public class logicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10, b = 20 , c = 10;
		
		boolean b1 = a>b;
		boolean b2= a>=c;
		System.out.println("a is more than " + b1);
		System.out.println("a is more than oer equal to c  " + b2);
		
		boolean bothMeetRequirement = b1 && b2;
		System.out.println("Are both condition met " + bothMeetRequirement);
		//Logical and operator && or & (ampersand)
		//Logical or operator  ||  |(pipe) 
		//Logical not operator  !
		
	}

}
