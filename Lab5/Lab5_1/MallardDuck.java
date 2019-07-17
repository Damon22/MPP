package Lab5_1;

public class MallardDuck extends Duck {

	MallardDuck() {
		fly = new FlyWithWings();
		quack = new Quack();
	}
	
	@Override
	public void display() {
		System.out.println("  display");
	}

}
