package Lesson5_Prob2;

public class DecoyDuck extends Duck {	
	
	public DecoyDuck() {
		setFlyBehavior(new CannotFly());
		setQuackBehavior(new MuteQuack());
	}	
	
	@Override
	public void display() {
		System.out.println("  displaying");		
	}
}
