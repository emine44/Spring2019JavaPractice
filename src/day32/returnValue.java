package day32;

public class returnValue {

	public static void main(String[] args) {
		givemeLastChar("emine");

	}

	
	public static char givemeLastChar(String name) {
		
          char last = name.charAt(name.length()-1);
          System.out.println(last);
          return last;
	}

	
	
	
}
