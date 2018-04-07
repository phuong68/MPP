package Lesson5_Prob3;

public class Circle implements Shape {
	final private double radius;
	
	public double getRadius() {
		return radius;
	}

	public Circle(double radius){
		this.radius = radius;
	}
	
	@Override
	public double computeArea() {
		// TODO Auto-generated method stub
		return Math.PI * radius * radius;
	}
}
