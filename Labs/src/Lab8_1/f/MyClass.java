package Lab8_1.f;

import java.util.function.*;

public class MyClass {
	public static void main(String[] args) {
		MyClass m1 = new MyClass();
		MyClass m2 = new MyClass();
		System.out.println(m1.myMethod(m2));
	}
	
	boolean myMethod(MyClass cl) {
		Predicate<MyClass> pre = this::equals;
		return pre.test(cl);
	}
}
