package day12;
import java.util.Scanner;
public class DayPrinter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the day number:");
		
		int daynum =scan.nextInt();
        String dayWord;
		
		switch(daynum) {
		case 1:
		case 5:
			
		   dayWord="Weekday";
		    break;		
		case 2:
			 dayWord="Weekday";
			break;
		case 3:
			 dayWord="Weekday";
			break;
		case 4:
			 dayWord="Weekday";
			break;
		case 5:
			 dayWord="Weekday";
			break;
		case 6:
			 dayWord="Weekend";
			break;
		case 7:
			 dayWord="Weekend";
			break;
		default:
			 dayWord="Invalid entry";
       
		    break;
		   
		}
		 System.out.println(dayWord);

	}

}
