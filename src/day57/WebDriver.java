package day57;

import java.util.List;

public interface WebDriver {

	public static final String purpose = "Automating Browser";
	
	
	public void openBrowser();// automatically public abstract
	
	void navigateTo(String url);
	
	void quitAccept();
	
	public abstract String findElementById(int id);
	
	public abstract List<String> findElementByTagName(String TagName);
	
	//DEFAULT METHOD
	public default void clickButton(String name) {
		System.out.println("Do your implementation");
	}
	
	public static void showPurpose() {
		
		System.out.println("purpose is" + purpose);
		
	}
	
	
}
