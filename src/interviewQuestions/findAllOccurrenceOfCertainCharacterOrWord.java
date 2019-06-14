package interviewQuestions;
import java.util.Scanner;
public class findAllOccurrenceOfCertainCharacterOrWord {

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
		  String str = scan.nextLine();
		  
		     int i = 0;
		    int count =0;
		    
		    if(str.length()<=1){
		      System.out.println("0");
		    }
		    else{
				do {
					
					String c = str.substring(i,i+2) ;
					
					if(c.equals("hi")) {
						System.out.println("Bingo!!" + c);
						count++;
						
					}
					if(i+2==str.length()){break;}
					i++;
					
				}while(i<str.length());
				System.out.println(count);
		    
		  }
	
	}

}
