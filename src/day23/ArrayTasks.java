package day23;
import java.util.Scanner;
public class ArrayTasks {

	public static void main(String[] args) {
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("enter a name");
//		
//		String name = scan.next();
//		
//		char nam [] = name.toCharArray();
//		
//		for(int i=0; i<nam.length; i++) {
//			
//			System.out.println(nam[i]);
//			
//		}
		
		char name[] = {'e', 'm','i' ,'n','e'};//1st way
		
		System.out.print(name);
		System.out.println();
		
		char []name2 = new char[5];//second way
		        name2[0] = 'e';
				name2[1] = 'm';		
				name2[2] = 'i';
				name2[3] = 'n';
				name2[4] = 'e';
				
		System.out.print(name2);
		
		System.out.println();
		
		char[] name3 = new char[] {'e', 'm','i' ,'n','e'};	//third way	
				
		for(int i =name3.length-1; i>=0 ; i--) {
			System.out.print(name3[i]);
		}		
				
	}

}
