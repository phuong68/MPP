package Lesson5_Prob3;

import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
	
	public static void main(String[] args) {
		Shape[] shapes = {new Circle(5), new Triangle(3, 4), new Rectangle(10, 9)};
		double totalArea = 0;
		
		for(Shape s: shapes){
			totalArea += s.computeArea();
		}
		
		Stream<Shape> stream = Arrays.asList(shapes).stream();
		
		System.out.println( stream.map(sh -> sh.computeArea()).reduce(Double.valueOf(0),(a,b)-> a+b));
	}
}