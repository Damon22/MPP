package Lab8_1.j;

import java.util.function.DoubleSupplier;
import java.util.function.Supplier;

public class Main {
	public static void main(String[] args) {
		DoubleSupplier d = Math::random;
		Supplier<Double> s = Math::random;
		System.out.println(d.getAsDouble());
		System.out.println(s.get());
	}
}
