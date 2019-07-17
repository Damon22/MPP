package Lab7_5;

public interface Flyable {
	public default void fly() {
		System.out.println("  fly with wings");
	}
}
