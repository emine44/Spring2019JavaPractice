package day8;
import java.util.Scanner;
public class MultiBranchIfStatementIntro {

	public static void main(String[] args) {
		// 
	

	Scanner grade = new Scanner(System.in);
	System.out.println("What is your score");
	int score =grade.nextInt();
	if(score >90 && score<100) {
		
		System.out.println("Your grade is A");
	}
	else if (score >80 && score<89){
		
		System.out.println("Your grade is B");
	}
	else {
		System.out.println("Your grade is C");
	}
	}

}
