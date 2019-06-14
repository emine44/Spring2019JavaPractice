package day60;

import day56.Shape;

public class ShapeUtility {
	public static void main(String[]args) {
		Shape s1 =new Triangle();

		describeTheS hape(s1);
	}
	public static void describeTheShape(Shape anyShape) {
		
		anyShape.draw();
	}
	

}
