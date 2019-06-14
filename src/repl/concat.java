package repl;

public class concat {

	public static void main(String[] args) {
		   System.out.println(coverString("java methods", "me") ) ; //java [me]thods
	  }
	  
	  public static String coverString(String main, String coverME) {
	    String s1="[";  
	    String s2=s1.concat(coverME);  
	    String s3 = s2.concat("]");
	    
	    
	    
	    String result = main.replaceAll(coverME,s3);
	    
	    return result;
	    
	  }

}
