package day50;

public class SlackUser {
   
	String displayName;
	String status;
	int timeZone;
	
	public SlackUser() {
		
	System.out.println("Slack user no arg constructor");	
	}
	
    public SlackUser(String displayName, String status, int timeZone) {
    	
	this.displayName =displayName;
	this.status =status;
	this.timeZone =timeZone;
		
	} 
    
    public void sendMessage(String message) {
    	
    System.out.println(displayName + " is sending " + message);	
    }
    
    public void changeStatus(String updatedStatus) {
    	
    	this.status = updatedStatus;
    	
    }
    
    
    
    
    
    
	
	
}
