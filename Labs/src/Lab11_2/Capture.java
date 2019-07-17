package Lab11_2;

import java.util.Arrays;
import java.util.List;

public class Capture {

	public static void reverse(List<?> list) {
		reverseList(list);
	}
	
	private static <T> void reverseList(List<T> list) {
		for (int i = 0; i < list.size()/2; i++) {
			T t = list.get(i);
			list.set(i, list.get(list.size()-1-i));
			list.set(list.size()-1-i, t);
		}
	}
	
	public static void main(String[] args) {
		List<Integer> ints = Arrays.asList(1,2,3,4,5,6);
		reverse(ints);
		System.out.println(ints);
	}

}
