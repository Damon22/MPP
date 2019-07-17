package Lab7_4;

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
	}
	
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