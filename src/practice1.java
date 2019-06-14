import java.util.Scanner;
public class practice1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    String email = scan.next();
	    String f= email.substring(0,1);
	    String l = email.substring((email.indexOf("_")+1),(email.indexOf("_")+2));
	    String d =email.substring((email.indexOf("@")+1),(email.indexOf(".")));
	    //String tl=email.substring((email.indexOf(".")+1 ), (email.indexOf(".")+4 ));
	    String firstName = f.toUpperCase()+ "" + email.substring(1,email.indexOf("_"));
	    String lastName =  l.toUpperCase()+"" + email.substring((email.indexOf("_")+2) , email.indexOf("@") );

	   System.out.println("First name: " + firstName);
	   System.out.println("Last name: " + lastName);
	   System.out.println("Domain: " +d );
	  //System.out.println("Top-Level Domain: " +tl );

	}

}
