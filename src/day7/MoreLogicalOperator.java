package day7;

public class MoreLogicalOperator {

	public static void main(String[] args) {
	//Logical and operator && or & (ampersand)-As long as one operand is false whole thing will be false
	//Logical or operator  ||  |(pipe) -only when both opperands are true then whole thing will be true
	//Logical not operator  !
		// difference bitween single &,|  or &&,|| will only evaualte first part
		//if the whole result can be already decided
		// just using the first boolean value
		// & will check for both side whether it can be always 
		System.out.println("the result of true&&true: " + (true&&true));
		System.out.println("the result of false&&true: " + (false&&true));
		System.out.println("the result of false&&false: " + (false&&false));
		
		System.out.println("the result of true||true: " + (true||true));
		System.out.println("the result of false||true: " + (false||true));
		System.out.println("the result of false||false: " + (false||false));
		
		System.out.println("the result of !true: " + (!true));
		System.out.println("the result of !false: " + (!false));
	}

}
