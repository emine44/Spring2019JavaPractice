package day16;

public class StringEquality {

	public static void main(String[] args) {
		
		String s1 = "abc";// string literal using quotation by hand
		String s2 = new String(s1);// using new keyboard
		System.out.println(s1);
		System.out.println(s2);

	}//string pool only includes unique string literals

}
