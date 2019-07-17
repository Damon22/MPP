package Lab5_1;

public abstract class Duck {
	public QuackBehavior quack;
	public FlyBehavior fly;
	
	public void quack() {
		quack.quack();
	}
	
	public void fly() {
		fly.fly();
	}
	
	public void swim() {
		System.out.println("  swimming");
	}
	
	abstract public void display();
}
