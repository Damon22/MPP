package Lab7_5;

public class RubberDuck extends Duck implements CannotFly, Squeak {

	RubberDuck() {

	}
	
	@Override
	public void display() {
		System.out.println("  displaying");
	}

}
