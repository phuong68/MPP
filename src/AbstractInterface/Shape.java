package AbstractInterface;

public abstract class Shape implements IDrawable {

	protected int x;
	protected int y;
	protected int color;
	
	public abstract  String draw() ;
	
	public abstract String move() ;

	public abstract String clear() ;

}
