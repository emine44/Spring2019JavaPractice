package day16;

public class replace {

	public static void main(String[] args) {
		
		
		String str = "Date is 03_25_2019";
		
		str = str.replace('_', '-');
		System.out.println(str);
		
		str = str.replace("is", "will be");
		System.out.println(str);
		
		
		str = str.replace("Date will be", "");
		System.out.println(str);
		
		String str2 = "AAABBBVVVVCCCC";
		System.out.println(str2);

	}

}
