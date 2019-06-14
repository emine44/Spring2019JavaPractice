package day58;

public interface WebDriver {
/*
 * CONSTANT> PUBLIC STATIC FINAL VARIABLE
 * ABSTRACT METHOD
 * DEFAULT METHOD
 * STATIC METHOD
 * 
 */
	void navigate(String url); 
	void open();
	void close();
	default void quit() {
		System.out.println("default quit method");
	}
	
	
	
}

class ChromeDriver implements WebDriver{
	public void setChromeOptions(String[] str) {
		
	}

	@Override
	public void navigate(String url) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void open() {
		
		
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void quit() {
		// TODO Auto-generated method stub
		
	}
}

class FirefoxDriver implements WebDriver{
	
public void setFirefoxOptions(String[] str) {
		for(String each : str) {
			System.out.println("Setting chrome option " + each);
		}
	}

@Override
public void navigate(String url) {
	// TODO Auto-generated method stub
	
}

@Override
public void open() {
	// TODO Auto-generated method stub
	
}

@Override
public void close() {
	// TODO Auto-generated method stub
	
}

@Override
public void quit() {
	// TODO Auto-generated method stub
	
}
	
}

