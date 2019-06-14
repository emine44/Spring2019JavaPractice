package repl;
import java.util.Scanner;
public class Repl103 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
	    Scanner scan = new Scanner(System.in);
	    String  str = scan.nextLine();
	    String result = " ";
	    
	    for(int i = 0; i<str.length()-4; i++){
	      
	      result = str.substring(i, i+4);
	      if(result.equals("code") || result.equals("cope")
	      || result.equals("core")|| result.equals("cooe") || result.equals("cole")
	      || result.equals("coze")){
	        count++;
	      }
	      
	    }
	    System.out.println(count);

	}

}
