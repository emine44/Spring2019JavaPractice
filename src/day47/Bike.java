package day47;

public class Bike {
	
	private String brand;
	private int gear;
	private int id;
	private int speed;
	
	//**STATIC FIELD***
	static int countOfBike;
	
	//**GETTERS AND SETTERS **
	
	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public int getGear() {
		return gear;
	}


	public void setGear(int gear) {
		this.gear = gear;
	}


	public int getId() {
		return id;
	}

	public double getSpeed() {
		return speed;
	}


	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
//***************************************
  
	
	public Bike(String brand, int gear, int speed) {
		this();
		this.brand =brand;
		this.gear =gear;
		this.speed =speed;
		
		++countOfBike;
		this.id =countOfBike;
		
	}
	
	private Bike() {
		 System.out.println("no arg is being called" );
		
	}
	
	public static void showCurrentCount() {
		System.out.println("Current count of bikes " + countOfBike);
		
	}
	
	public static void resetCount() {
		
		countOfBike =0;
	}
	
	
	
	
	public void speedUp(int x) {
		this.speed =speed +x;
		
	}
	
	public void slowDown(int x) {
		this.speed =speed -x;
		
	}
	
	@Override
	public String toString() {
		return "Bike [brand=" + brand + ", gear=" + gear + ", id=" + id + ", speed=" + speed + "]";
	}
	

}
