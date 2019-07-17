package Lab9_7.b;

import java.util.List;
import java.util.stream.Collectors;

public class LambdaLibrary {
	public static final TriFunction<List<Employee>, Integer, Character, String> SALARY_AND_LASTNAME =
			(list, salary, c) -> list.stream().filter(x->x.getSalary()>salary)
								.filter(x->x.getLastName().charAt(0)>c)
								.map(x->x.firstName + " " + x.lastName)
								.sorted()
								.collect(Collectors.joining(", "));
}
