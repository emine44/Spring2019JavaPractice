package day57;

public class WebDriverTest {

	public static void main(String[] args) {
		
		ChromeDriver c1 =new ChromeDriver(5,16.0);
		c1.findElementById(5);
		c1.navigateTo("http");
		c1.quitAccept();
		ChromeDriver c2 =new ChromeDriver();
		c2.clickButton("emine");
		WebDriver.showPurpose();
	}}
