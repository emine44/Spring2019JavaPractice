package day57;

import java.util.List;

public class ChromeDriver implements WebDriver{
	
	int screenSize;
	double positionX;
	
	public ChromeDriver(int screenSize, double positionX) {
		this.screenSize=screenSize;
		this.positionX =positionX;
	}
	public ChromeDriver() {
		openBrowser();
		System.out.println("no arg constructor");
	}

	@Override
	public void openBrowser() {
		System.out.println("open browser method");
		
	}

	@Override
	public void navigateTo(String url) {
		System.out.println("navigate to method" + url);
		
	}

	@Override
	public void quitAccept() {
		System.out.println("quit accept method");
		
	}

	@Override
	public String findElementById(int id) {
		// TODO Auto-generated method stub
		return "find element by id method" + id ;
	}

	@Override
	public List<String> findElementByTagName(String TagName) {
		// TODO Auto-generated method stub
		return null ;
	}
    @Override
    public void clickButton(String name) {
    	System.out.println("overriden implementation");
    }


}
