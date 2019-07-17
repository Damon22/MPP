package Lab4_C;

import java.util.List;

public class Commissioned extends Employee {
	
	double commission;
	double baseSalary;
	List<Order> takes;
	
	@Override
	public double calcGrossPay() {
		int sum = 0;
		for (Order order : takes) {
			sum += order.orderAmount;
		}
		return baseSalary + sum * commission;
	}

}
