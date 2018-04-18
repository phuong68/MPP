package AbstractInterface;

public class ShapeFactory {
	private Shape _rectangle;
	private Shape _circle;
	
	public ShapeFactory() {
		
	}
	
	public Shape createRectangle() {
		return _rectangle= new Rectangle();
	}
	
	public Shape createCircle() {
		return _circle = new Circle();
	}
	
	public Circle getCircle() {
		return (Circle)_circle;
	}
	
	public Rectangle getRectangle() {
		return (Rectangle)_rectangle;
	}
	
	public void createRectangleCircle() {
		
		createRectangle();
		createCircle();
	}
	
}
