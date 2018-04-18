package AbstractInterface;

public class Rectangle extends Shape {
	
	int width;
	int height;
	
	@Override
	public String  draw() {
		return "Rectangle:: draw";
	}
	
	@Override
	public String move() {
		return "Rectangle:: move";
	}
	
	@Override
	public String clear() {
		return "Rectangle:: clear";
	}

}
