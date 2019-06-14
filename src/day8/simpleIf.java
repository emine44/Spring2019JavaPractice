package day8;

import java.util.Scanner;
import javax.sound.midi.SysexMessage;
// command shift  o--takes out anything if it is not used
public class simpleIf {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter numbers");
		int x = 10;
		// Curly braces for if and else blocks are optional
		// ONLY WHEN WE HAVE SINGLE STATEMENT
		// Command shift F helps you to line up all statements
		if (x != 10)
			System.out.println("NOT 10 !");

		else
			System.out.println("YES IT IS 10   ");

	}

}
