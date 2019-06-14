package day34;

public class VarArgs2 {

	public static void main(String[] args) {

	//printNames("e","df","dff","trgch");	
	//printNames(null,"empty");
		sentenceBuilder("emine " , "loves " ,"hasan");
		wordBuilder("emine" , "loves" ,"hasan");
	}
	
	public static void printNames(String ...names) {
	//names are treated as String[]	
	System.out.println(names[3]);
	System.out.println(names[0]);
	
	}
	
	
	public static void sentenceBuilder(String...word) {
		String all ="";
		for(int i=0; i<word.length; i++) {
			
			all += word[i];
		}
		System.out.println(all);
		
	}
	
	
	  public static void wordBuilder(String...str) 
	  { String s ="";
	  for(int i=0;i<str.length; i++) {
	  
	  s += str[i].charAt(str[i].length()-1); } System.out.println(s);
	  
	  }
	 
}
