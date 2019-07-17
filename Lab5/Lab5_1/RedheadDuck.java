package Lab5_1;

public class RedheadDuck extends Duck {

	RedheadDuck() {
		fly = new FlyWithWings();
		quack = new Quack();
	}
	
	@Override
	public void display() {
		System.out.println("  displaying");
	}

}
