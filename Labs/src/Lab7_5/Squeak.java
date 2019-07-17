package Lab7_5;

public interface Squeak extends Quackable {

	@Override
	public default void quack() {
		System.out.println("  squeaking");
	}

}
