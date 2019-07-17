package Lab1;

import java.util.List;

public class Manager extends Employee {
	
	List<Project> projects;
	
	Manager(String firstName, String lastName, String id) {
		super(firstName, lastName, id);
		// TODO Auto-generated constructor stub
	}

	public void report() {
		System.out.println("Amount of Completed is: " + amountForCompleted());
		System.out.println("Amount of Remaining is: " + amountForRemaining());
	}
	
	private int amountForCompleted() {
		int sum = 0;
		for (Project p : projects) {
			sum += p.amountForCompleted();
		}
		return sum;
	}
	
	private int amountForRemaining() {
		int sum = 0;
		for (Project p : projects) {
			sum += p.amountForRemaining();
		}
		return sum;
	}
}
