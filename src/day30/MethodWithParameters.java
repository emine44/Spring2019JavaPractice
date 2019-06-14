package day30;

public class MethodWithParameters {

	public static void main(String[] args) {
		
		
//		String s ="abc";
//		System.out.println(s.substring(1,3));
		
		printTheSum(10.6,56.2);

	}
	
	public static void printTheSum(double a, double b) {
		
		double sum = a+b;
		System.out.println("the sum of the numbers " + sum);
	}

}
