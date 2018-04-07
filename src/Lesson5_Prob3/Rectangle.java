package Lesson5_Prob3;

public class Rectangle implements Shape {
	final private double width;
	final private double length;
	
	public Rectangle(double width, double length){
		this.width = width;
		this.length = length;
	}
	
	public double getWidth() {
		return width;
	}

	public double getLength() {
		return length;
	}

	@Override
	public double computeArea() {
		// TODO Auto-generated method stub
		return width * length;
	}
}
