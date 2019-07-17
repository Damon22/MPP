package Lab9_8;

import java.util.List;
import java.util.stream.Collectors;

public class LambdaLibrary {

	public static final TriFunction<List<Employee>, Integer, Character, Long> COUNT_SAL_NAME =
			(list, minSalary, ch) ->
				list.stream()
				.filter(e -> e.getSalary() > minSalary)
				.filter(e -> e.getLastName().charAt(0) > ch)
				.count();
	
	public static final TriFunction<List<Employee>, Integer, Character, List<String>> LIST_SAL_NAME =
			(list, minSalary, ch) ->
				list.stream()
				.filter(e -> e.getSalary() > minSalary)
				.filter(e -> e.getFirstName().charAt(0) < ch)
				.map(e -> String.format(e.firstName + " " + e.lastName).toUpperCase())
				.sorted()
				.collect(Collectors.toList());
	         
}
