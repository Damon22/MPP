package Lab7_1.partE;

public interface C extends A {
	public default void method() {
		System.out.println("C");
	}
//	public void method();
}
