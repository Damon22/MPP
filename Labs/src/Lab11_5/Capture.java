package Lab11_5;

import java.util.Arrays;
import java.util.List;

public class Capture {

	public static <T extends Comparable<T>> T secondSmallest(List<T> list) {
		T first = list.get(0);
		T second = list.get(0);
		for (T t : list) {
			if (first.compareTo(t) > 0) {
				second = first;
				first = t;
			} else {
				if (second.compareTo(first) == 0 && t.compareTo(second) > 0) {
					second = t;
				} else {
					if (second.compareTo(t) > 0) {
						second = t;
					}
				}
			}
		}
		return second;
	}
	
	public static void main(String[] args) {
		List<Integer> ints = Arrays.asList(1,2,3,4,5,6,-1,0);
		int a = secondSmallest(ints);
		System.out.println(a);
	}

}
