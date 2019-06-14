package day47;

public class InstanceBlock {

	int num;
	
	// a block that run every time an object is being created
	//instance block
	
	{
//	System.out.println("Initializing launch");	
//	System.out.println("setting protocols");	
	System.out.println("All system go!!");
		
		
		
	}
	
	public InstanceBlock() {
		System.out.println("constructor");
	}
	
	public InstanceBlock(String name) {
		System.out.println("constructor " + name);
	}
	
	
}
