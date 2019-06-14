package day56;

import java.util.ArrayList;
import java.util.List;

public class ShapeTest {

	public static void main(String[] args) {
		
		
		List <String> lst =new ArrayList<>();
		
		
		
		
		Circle c1=  new Circle("yellow", 6);
		Rectangle r1 = new Rectangle("blue", 8,9);
		
		c1.calculatePerimeter();
		System.out.println(r1.toString());
		

	}

}
