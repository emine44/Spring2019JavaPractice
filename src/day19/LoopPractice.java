package day19;
import java.util.Scanner;
public class LoopPractice {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER A WORD");
		String str = scan.nextLine();
		String word1 =" ";
		String word2 = " ";
		int i = str.length()-1;
		while (i>=0) {
			word1=str.charAt(i--) + " ";
		System.out.print(word1);
		//++i; //i++
		}
		System.out.println(" ");
		int k = 0;
		while (k<=str.length()-1) {
			word2=str.charAt(k++) + " ";
		System.out.print(word2);
		//++i; //i++
		}
		
		System.out.println(" ");
		if(str.equals(word2)) {System.out.println(str + " is PALINDROM");}
		else 
		{System.out.println(str + " is not PALINDROM");}
	}

}
