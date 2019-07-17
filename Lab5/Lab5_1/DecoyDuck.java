package Lab5_1;

public class DecoyDuck extends Duck {

	DecoyDuck() {
		fly = new CannotFly();
		quack = new MuteQuack();
	}
	
	@Override
	public void display() {
		System.out.println("  displaying");
	}

}
