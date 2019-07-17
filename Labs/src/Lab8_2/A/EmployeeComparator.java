package Lab8_2.A;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.equals(o2) == true ? 0 : 1;
	}

}
