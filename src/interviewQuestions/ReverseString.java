package interviewQuestions;

public class ReverseString {

	public static void main(String[] args) {
		 String str = "emine";
		 String reversed = " ";
		 int l = str.length();
		 int i = l-1;
		 while(i>=0) {
			 
			reversed = reversed + str.charAt(i); 
			i--; 
		 }
        System.out.println(reversed);
	}

}
