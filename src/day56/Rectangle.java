package day56;

public class Rectangle extends Shape {

	int width;
	int height;
	
	public Rectangle(String color, int width, int height) {
		super(color);
		this.width =width;
		this.height =height;
	}
	@Override
	public void calculatePerimeter() {
		System.out.println("Rect Perimeter is: " + 2*(width+height));
		
	}

	@Override
	public void calculateArea() {
		// TODO Auto-generated method stub
		System.out.println("Rect Area is: " + width*height);
	}
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", color=" + color + "]";
	}

	

}
