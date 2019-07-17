package Lab7_5;

public interface Quackable {
	public default void quack() {
		System.out.println("  quacking");
	}
}
