package Lesson5_Prob2;

abstract public class Duck implements FlyBehavior, QuackBehavior {
	private FlyBehavior flyBehavior;
	private QuackBehavior quackBehavior;	
	
	public void fly() {
		flyBehavior.fly();
	}
	public void quack() {
		quackBehavior.quack();
	}
	protected void setFlyBehavior(FlyBehavior b) {
		flyBehavior = b;
	}
	protected void setQuackBehavior(QuackBehavior b) {
		quackBehavior = b;
	}

	public void swim() {
		System.out.println("  swimming");
	}

	abstract public void display();
}
