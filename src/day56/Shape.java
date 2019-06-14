package day56;

public abstract class Shape {
	
	static String color;
	
	public Shape(String color) {
		this.color=color;
	}
	

    public abstract void calculatePerimeter();
    public abstract void calculateArea();
    public abstract String toString();


	public abstract void draw();
	
	
	
}
