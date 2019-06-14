package day35;

public class warmUp {

	public static void main(String[] args) {
		
		
		System.out.println(findLongestWord("emine " , "lovesdfgh " ,"hasan"));


	}
	
	public static  String findLongestWord(String ...word) {
		
		String  longest = word[0];
		
		for(int i=1; i<word.length; i++) {
			if(longest.length()<word[i].length()) {
				
				longest= word[i];
			}
			
		}
		return longest;
		

	}

}
