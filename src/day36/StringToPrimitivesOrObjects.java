package day36;

public class StringToPrimitivesOrObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str1 = "True";
		boolean b1 = Boolean.parseBoolean(str1);
		boolean b2 = Boolean.parseBoolean("ABC");
		boolean b3 = Boolean.parseBoolean("FALSE");
		
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
		/*
		 * From, String to wrapper class object valueOf method will take String and
		 * return ---->Wrapper class object
		 */
		
		
		String d ="3.14";
		Double d1 = Double.valueOf(d);
		System.out.println(d1.toString());
		
		
		
		
		
		
		
	}

}
