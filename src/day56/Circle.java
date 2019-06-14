package day56;

public class Circle extends Shape {
	double radius;
	
	public Circle(String color, double radius) {
		super(color);
		this.radius=radius;
		
		
	}

	@Override
	public void calculatePerimeter() {
		
		System.out.println("Calculated perimeter: " + (3.14*2*radius));
		
	}

	@Override
	public void calculateArea() {
		// TODO Auto-generated method stub
		System.out.println("Calculated area: " + (3.14*radius*radius));
		
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + "]";
	}

	
}
