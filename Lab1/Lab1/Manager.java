package Lab1;

import java.util.List;

public class Manager extends Employee {
	Manager(String firstName, String lastName, String id) {
		super(firstName, lastName, id);
		// TODO Auto-generated constructor stub
	}

	List<Project> projects;
	
	public void report() {
		System.out.println("Amount of Completed is: " + amountForCompleted());
		System.out.println("Amount of Remaining is: " + amountForRemaining());
	}
	
	private int amountForCompleted() {
		return 0;
	}
	
	private int amountForRemaining() {
		return 0;
	}
}
