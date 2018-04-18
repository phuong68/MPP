package AbstractInterface;

public class Circle extends Shape {

	@Override
	public String draw() {
		
		return "Circle::draw";
	}

	@Override
	public String move() {
		return "Circle::move";
	}

	@Override
	public String clear() {
		return "Circle::clear";
	
	}

}
