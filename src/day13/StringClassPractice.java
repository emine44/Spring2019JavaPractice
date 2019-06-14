package day13;

public class StringClassPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  s1 ="abc";
		String  s2 ="ABC";
		
		boolean b1=s1.equals("abc");
		boolean b2=s1.equals(s2);
		boolean b3=s1.equalsIgnoreCase("abc");
		
	System.out.println(s1.toUpperCase());	
	System.out.println(s1.toLowerCase());	
    System.out.println(s1);
    // get a certain character inside a string
    char c1 = s1.charAt(0);
    char c2 = s1.charAt(1);
    char c3 = s1.charAt(2);
    System.out.println(c1); 
    System.out.println(c2); 
    System.out.println(c3); 
    //getting the length of String object
    int countOfCharacter =s1.length();
	}

}
