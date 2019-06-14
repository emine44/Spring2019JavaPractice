package day16;

public class AnotherIndexOf {

	public static void main(String[] args) {
		//            01234567890123456789
		String str = "Ahmad Omar Al Alousi";
		
		int space1 = str.indexOf(" ");
		int space2 = str.indexOf(" ", space1 +1);
		int space3 = str.indexOf(" ", space2+1);
		
		System.out.println(str.indexOf("A"));
		
		System.out.println(str.indexOf("A",1));
		
		System.out.println(str.indexOf("A",14));
		
		System.out.println(str.substring((str.indexOf(" ")+1), 
				str.indexOf(" ", str.indexOf(" ")+1)));
		
	}

}
