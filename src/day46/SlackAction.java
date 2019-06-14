package day46;

import java.util.ArrayList;

public class SlackAction {

	public static void main(String[] args) {
		
		
	SlackUser p1 = new SlackUser ();
	System.out.println(p1.toString());
	//below code will be seen as above code for compiler
	System.out.println(p1);
	
 
	
	SlackUser p2 = new SlackUser ("magician", "akbar@cybertek.com", 0);
	SlackUser p3 = new SlackUser ("instructor", "instructor@cybertek.com", 0);
	SlackUser p4 = new SlackUser ("student", "student@cybertek.com", 29);
	
	
	ArrayList <SlackUser> userList = new ArrayList <>();
	userList.add(p1);
	userList.add(p2);
	userList.add(p3);
	userList.add(p4);
	
	for (SlackUser each : userList) {
		System.out.println(each);
		each.sendMessage("general", "Good morning!" );
	}
	
	
	}

}
