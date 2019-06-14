package repl;

public class SkippingWord {

	public static void main(String[] args) {
		System.out.println(clean("foo bar", "foo"));

	}
	 public static String clean(String text ,String badWord) {


		   String  [] uniqueStr=text.split(" ");
		    String result ="";
		   for (int i = 0; i < uniqueStr.length; i++) {
			      String target = uniqueStr[i];
			      if(target.contains(badWord) ) {
			      continue;
			      }
			      result +=target + " " ; 
			      //System.out.println(eachChar);
			      
			    }
		   result.trim();
			    return result;



		  }
}
