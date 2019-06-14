package day52;

public class Computer {
	
	public final void systemPolicy() {
		
		System.out.println("DO NOT CHANGE THE POLICY");
	}
	
      public final static void staticSystemPolicy() {
		
		System.out.println("DO NOT CHANGE THE POLICY");
	}
	
	
	
	
	

}


class MacBook extends Computer {
	
//	@Override
//   public void systemPolicy() {
//		
//		System.out.println("I AM JUST REBELLIOUS");
//	}
//	
	
	//cannot hide final static method
	
	
}