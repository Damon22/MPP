package Lab5_1;

public class RubberDuck extends Duck {

	RubberDuck() {
		fly = new CannotFly();
		quack = new Squeak();
	}
	
	@Override
	public void display() {
		System.out.println("  displaying");
	}

}
