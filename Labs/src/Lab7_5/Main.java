package Lab7_5;

import java.util.Arrays;
import java.util.Comparator;

public class Main implements Runnable {

	public static void main(String[] args) {
		
		int[] a = new int[] {1,2,3,4,5};
		// imperative programming
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		// declarative programming
		Arrays.stream(a).forEach(System.out::println);
		
		Duck[] ducks = {new MallardDuck(), new DecoyDuck(), new RedheadDuck(), new RubberDuck()};
		for (Duck d: ducks) {
			System.out.println(d.getClass().getSimpleName() + ":");
			d.display();
			d.fly();
			d.quack();
			d.swim();
		}
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
