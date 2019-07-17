package Lab7_5;

public interface MuteQuack extends Quackable {

	@Override
	public default void quack() {
		System.out.println("  cannot quack");
	}

}
