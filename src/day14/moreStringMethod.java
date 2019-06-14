package day14;

public class moreStringMethod {

	public static void main(String[] args) {
		// subString(beginning index, EndingIndex)
		// beginning index is always included
		// ending index is always eclusive
		            //012345
        String name ="Emine";
        
        
        System.out.println(name.substring(name.length()-1));
        System.out.println(name.substring(3,5));
        System.out.println(name.substring(0,2));
        System.out.println(name.substring((name.length())/2 , 5));// comma is required
	}

}
