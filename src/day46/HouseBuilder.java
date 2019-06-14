package day46;

public class HouseBuilder {

	public static void main(String[] args) {
		
	CyberHouse h1 =new CyberHouse(1,"Victorian");
	CyberHouse h2 =new CyberHouse(2,"Spanish");
		
	
	// accessing static variable
	//we access static members using static way
	//className.staticFieldName
	//className.staticMethodName(args...)
	//CyberHouse.neigborhoodName = "Cybertek Corner";	
		
	System.out.println(CyberHouse.neigborhoodName);	
		
	System.out.println(h1.houseNumber);
	System.out.println(h2.houseNumber);
	

	// can we use object to access static variable
	//even though it is recommended use static way
	//which is className.staticVarible
	
	System.out.println(h1.neigborhoodName);
	System.out.println(h2.neigborhoodName);
	
	//it affects on h2 also
	h1.neigborhoodName ="Cybertek Tower";
	System.out.println(h2.neigborhoodName);
	}

}
