package day50;

public class Vehicle {
	
	private String brand;
	private String model;
	protected int year ;
	

/// provide getters and setters
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}

	/// add constructors to set all the fields
	
	public Vehicle(String brand, String model, int year) {
		
		this.brand = brand;
		this.model = model;
		this.year = year;
	}
	

}
