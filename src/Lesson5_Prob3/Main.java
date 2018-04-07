package Lesson5_Prob3;

public class Main {
	
	public static void main(String[] args) {
		Shape[] shapes = {new Circle(5), new Triangle(3, 4), new Rectangle(10, 9)};
		double totalArea = 0;
		
		for(Shape s: shapes){
			totalArea += s.computeArea();
		}
		
		System.out.println("Sum of Areas = " + totalArea);
	}
}