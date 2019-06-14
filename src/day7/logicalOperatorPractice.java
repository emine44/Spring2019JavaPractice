package day7;

public class logicalOperatorPractice {

	public static void main(String[] args) {
		

		int score=10;
		boolean result1 = score>4;
		boolean result2 = score>4 && score<11;// double does not check next one as long as the first side is wrong
		boolean result3 = score>4 || score<11;//one will check two side even if yhe frst one is not correct
		boolean result5 = score++ >10 && score<12;
		boolean result6 = ++score >10 || score<12;
		boolean result9= (score>5) && (score<=11) && (score/2==5);
		boolean result10= (score>5) && (score<=11) && (score/2==5);
		
	//	System.out.println("result1 is: " + result1);
	//	System.out.println("result2 is: " + result2);
	//	System.out.println("result3 is: " + result3);
	//	System.out.println("result5 is: " + result5);
	//	System.out.println("result6 is: " + result6);
	//	System.out.println("result9 is: " + result9);
		
	}

}
