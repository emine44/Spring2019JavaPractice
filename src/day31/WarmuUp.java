package day31;
public class WarmuUp {

	public static void main(String[] args) {
		countFrom1To10();
		System.out.println();
		countFrom1ToN(5);
		System.out.println();
		CountDown(7);
	}
	
	//
	//WARM UP TASK 
	//
	//Create few static methods with no return type with below name and logic
	//
	//1, create a method called countFrom1To10
	//take no parameters 
	//print 1-10 in one line with space

	
	public static void countFrom1To10() {
		 
		 for(int i=0; i<10; i++)
			 System.out.print(i+ " ");
	 }

	//
	//2, create a method called countFrom1ToN
	//take 1 int as parameter  
	//print 1-N(number user passed) in one line with space
	//
	public static void countFrom1ToN(int k) {
		 
		 for(int i=1; i<k; i++)
			 System.out.print(i+ " ");
	 }
	//3, create a method called CountDown
	//take 1 int as parameter 
	//and count down till 1 in method body
	
	public static void CountDown(int l) {
		 
		 for(int i=l; i>0; i--)
			 System.out.print(i+ " ");
	 }
	
}
