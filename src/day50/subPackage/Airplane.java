package day50.subPackage;

import day50.Vehicle;

public class Airplane extends Vehicle {

	private int wingCount;
	
	public static void main(String[] args) {
		
		Airplane a1 =new Airplane("d","d",2054,2);
		System.out.println(a1.toString());
		Vehicle v =new Vehicle("dc","sdf",45);
		System.out.println(v.toString());
	}

	

	public int getWingCount() {
		return wingCount;
	}


	public void setWingCount(int wingCount) {
		this.wingCount = wingCount;
	}


	public Airplane(String brand, String model, int year,int wingCount) {
		super(brand, model, year);
		this.wingCount =wingCount;
	}


	@Override
	public String toString() {
		return "Airplane [wingCount=" + wingCount + 
				", brand()=" + getBrand() + ", model()=" + getModel()
				+ ", year()=" + getYear() + "]";
	}
	
	
	
}
