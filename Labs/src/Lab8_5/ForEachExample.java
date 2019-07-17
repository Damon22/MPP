package Lab8_5;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachExample {
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", 
				"Away", "On Vacation", "Everywhere you want to be");
		
		// implement Consumer
		MyConsumer myCon = new MyConsumer();
		myCon.andThen(System.out::println).accept(list);
		
		// lambda
		list.forEach(s->System.out.println(s.toUpperCase()));
		// method reference
		Consumer<List<String>> myFunctional = ForEachExample::transferToUpperCase;
		myFunctional.accept(list);
		// 
		consumer.accept(list);
	}
	
	public static void transferToUpperCase(List<String> t) {
		for (int i = 0; i < t.size(); i++) {
			String s = t.get(i).toUpperCase();
			t.set(i, s);
		}
		t.forEach(System.out::printf);
    }
	
	static final Consumer<List<String>> consumer = (a) -> {
		a.stream().map(x->x.toUpperCase()).forEach(System.out::println);
	};
	
	//implement a Consumer
	static class MyConsumer implements Consumer<List<String>> {
		@Override
		public void accept(List<String> t) {
			for (int i = 0; i < t.size(); i++) {
				String s = t.get(i).toUpperCase();
				t.set(i, s);
			}
		}
	}
}
