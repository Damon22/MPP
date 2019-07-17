package Lab7_5;

public class DecoyDuck extends Duck implements CannotFly, MuteQuack {

	DecoyDuck() {
		
	}
	
	@Override
	public void display() {
		System.out.println("  displaying");
	}

}
