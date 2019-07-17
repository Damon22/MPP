package Lab7_5;

public interface CannotFly extends Flyable {

	public default void fly() {
		System.out.println("  cannot fly");
	}
}
