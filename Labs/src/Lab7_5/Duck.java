package Lab7_5;

public abstract class Duck implements Flyable, Quackable {
	
	public void swim() {
		System.out.println("  swimming");
	}
	
	abstract public void display();
}
