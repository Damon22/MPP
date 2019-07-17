package Lab8_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.function.*;

public class C implements B {

	@Override
	public void Btest() {
		// TODO Auto-generated method stub
		
	}
	
	static class ComparableConsumer implements Consumer<Comparable<?>> {

		List<Comparable<?>> nonNullComparables = new ArrayList<>();

		public ComparableConsumer(List<Comparable<?>> comps) {
			this.nonNullComparables = comps;
		}
		
		@Override
		public void accept(Comparable<?> t) {
			if (t != null) nonNullComparables.add(t);
		}
		
	}
	
	public static void main(String[] args) {
//		int a = Stream.of(2,1,4,5,3).max((v,k) -> {
//            int result = Integer.compare(v, k);
//            System.out.printf("this is %d and %d\n",v, k);
//            return result;
//        }).get();
//		System.out.println(a);

		Function<String, Predicate<String>> fun = letter -> name -> name.startsWith(letter);
		boolean resu = fun.apply("a").test("harry");

		
		List<Integer> myIntStream = Arrays.asList(1,3,5,7,9);
//		int max = myIntStream.stream().max(Integer::compare).get();
//		int min = myIntStream.stream().min(Integer::compare).get();
		int max = myIntStream.stream().mapToInt(i->i).max().getAsInt();
		int min = myIntStream.stream().mapToInt(i->i).min().getAsInt();
		System.out.printf("this is %d and %d\n",max, min);
		
		List<Integer> numbers = Stream.iterate(0, x -> x + 1).limit(10).collect(Collectors.toList());
        System.out.println(numbers);
//        Integer dd = numbers.stream().reduce(0, (a, b) -> a + b, (a, b) -> a - b);
        Optional<Integer> dd1 = numbers.stream().reduce((a, b) -> a + b);
//        System.out.println(dd);
        System.out.println(dd1.get());
        
        List<Comparable<?>> nonNullComparables = new ArrayList<>();
        List<Integer> ints = Arrays.asList(1, 2, 3);
        List<String> strings = Arrays.asList("A", "B", "C");
        ints.forEach(new ComparableConsumer(nonNullComparables));
        strings.forEach(new ComparableConsumer(nonNullComparables));
        System.out.println(nonNullComparables);
	}
	
}
