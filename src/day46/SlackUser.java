package day46;

public class SlackUser {

	private String name;
	private String email;
	private int groupNum;
	// ********GETTERS AND SETTERS*********
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getGroupNum() {
		return groupNum;
	}
	public void setGroupNum(int groupNum) {
		this.groupNum = groupNum;
	}
	//********CONSTRUCTORS*****************
	
   public SlackUser() {
		   this("Zukhra" ,"z@gmail.com",26);
		   
	   }
	
   public SlackUser(String a, String b, int c) {
	   this.name=a;
	   this.email =b;
	   this.groupNum =c;
   }
	
  
  
  public void sendMessage(String channel, String content) {
	  
	  System.out.println(name + " send this message:  " + content + " to this channel " + channel);
	  
  }

  public String toString() {
	return "SlackUser [name=" + name + ", email=" + email + ", groupNum=" + groupNum + "]";
}
  
 
}
