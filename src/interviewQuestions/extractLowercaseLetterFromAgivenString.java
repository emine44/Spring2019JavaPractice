package interviewQuestions;

public class extractLowercaseLetterFromAgivenString {

	public static void main(String[] args) {
		//write a program to extract lowercase letter
        //from a given String — a1b2c3 --> abc
		
//		String str = " a1b2c3";
//		char  temp;
//		int i=0;
//		String temp2 = " ";
//		
//		do {
//			
//		char c = str.charAt(i);	
//	
//				if (Character.isLowerCase(c)) {
//		            System.out.println(c + " is a lowercase letter.");
//		        	temp2 = temp2 + "" +c;
//		        }
//
//			i++;
//		}while(i<str.length());
//System.out.println(temp2);
		String str = "eneAS89b74";
		for(int i =0; i<str.length(); i++) {
		char eachChar =str.charAt(i);
		
		if(eachChar>='A' && eachChar<='Z') {
		
			System.out.print(eachChar);
		}
		
		}
		

		
		
		
		
		
		
		
		
	}

}
