package Lesson5_Prob2;

public class RubberDuck extends Duck {

	public RubberDuck() {
		setFlyBehavior(new CannotFly());
		setQuackBehavior(new Squeak());
	}

	@Override
	public void display() {
		System.out.println("  displaying");
	}

}
