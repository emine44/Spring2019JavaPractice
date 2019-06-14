
package day7;
import java.util.Scanner;
//converting from one data type to another data type
//Changing  from smaller data type to bigger type is called widening /upcasting
//Converting drom bigger data type to smaller type is called type narrowing/downcasting
//downcasting require explicit casting operation for example
// long grande 1000L; int medium- (int)grande;
public class day7{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  /*int score=10;
  
 
  System.out.println(score++);
  System.out.println(score);
  System.out.println(++score);
  System.out.println(score--);
  System.out.println(score);
  */
		//int medium = 10; 
		//byte, short, int,long
		//shot,tall,medium,grande// cupsizes
		//long grande = medium;
		
		//System.out.println(grande);
		
		/// type widening/upcasting
	    //short tall = 5L; cannot put a long value inside any variable that has smaller range
		
		
		//short tall = (short) grande; // type narrowing/downcasting
		//double superGrande = 15.67d;
		//int mediumCup = (int) superGrande;
		//System.out.println(mediumCup);
		byte tinyExpressoCup=2;
//     int mediumCup = tinyExpressoCup;
		//System.out.println(mediumCup);//type widening/upcasting -this will happen implicitly
		Scanner input = new Scanner(System.in);
		  int areaCode = input.nextInt();
		  int localNumber = input.nextInt();
		  
		  String phoneNumber = "(" + areaCode + ")-" + localNumber ;
		  System.out.println("Calling number " + phoneNumber );
		  
	}

}
