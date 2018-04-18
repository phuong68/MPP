package AbstractInterface;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		ShapeFactory shapeFactory = new ShapeFactory();
		
		shapeFactory.createRectangleCircle();
		
		System.out.println(shapeFactory.getCircle().draw());
		System.out.println(shapeFactory.getRectangle().draw());
		

	}

}
