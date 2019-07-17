package Lab7_1.partE;

/**
public class D implements C, B {

	public static void main(String args[]) {
		D d = new D();
		d.method();
	}

	@Override
	public void method() {
		// B.super.method();
		System.out.println(super.getClass().toString());
	}

}
*/

public interface D extends C, B {

	@Override
	default void method() {
		// TODO Auto-generated method stub
		
	}

}
