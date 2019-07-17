package Lab8_1.j;

import java.util.function.Supplier;

public class MyMath {

	public static void main(String[] args) {
		MyMath my = new MyMath();
		System.out.println(my.getRandom());
	}
	
	Double getRandom() {
		Supplier<Double> sd = new Supplier<>() {
			@Override
			public Double get() {
				return Math.random();
			}
		};
		return sd.get();
	}

}
