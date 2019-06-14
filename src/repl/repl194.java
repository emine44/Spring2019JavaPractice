package repl;

public class repl194 {

	public static void main(String[] args) {
		String check ="Nurses Run";
		 //check =check.toLowerCase();
		  check= check.replaceAll(" ","");

		 // check.trim();
		  String reversed = "";
		  boolean isPal =true;
		  
		  for(int i = check.length()-1; i>=0; i--){
		    reversed = reversed +check.charAt(i);
		    
		  }
		  
		  System.out.println(reversed);
		  if(reversed.equalsIgnoreCase(check)){
		   System.out.println(isPal);
		    }
		  else
			  System.out.println(!isPal);

	}

}
