package day15;

public class castingPrimitives {

	public static void main(String[] args) {
		// char, boolean
		//byte,<short, <int, <long, <float, <double
		
		//type conversion--casting
		// byte ----> int  upcasting/ tyoe widening
		// this happent implicitly by compiles we do not need to do anything
		byte b =12;
		int i =b; // small cup i bigger cup a yerlestirmek is ok
		int y = (int)b; // if you want to emphasis your upcasting/explicitly by programmer
		
       // int --->byte    downcasting /type narrowing
		int a = 20;
		byte c = (byte)a;// explicitly
		
		double d =12.2;
		int k =(int)d;
		System.out.println(k);// 12 data loss
		
		// char to int
		
		char c1 = 'A';
		int cNum = c1;
		System.out.println(cNum);
	}

}
