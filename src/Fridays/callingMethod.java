package Fridays;
import day30.WarmUp;
public class callingMethod {

	public static void main(String[] args) {
		
		 WarmUp.sayGoodBye();
		 
		 callMe("emine");
		
		
	}
	
	public static void callMe(String name) {
		
		System.out.println("You called me " + name);
		
		
		
	}

}
