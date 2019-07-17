package Lab1;

public class Employee {
	
	String firstName;
	String lastName;
	String id;
	
	Employee(String firstName, String lastName, String id) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getId() {
		return id;
	}
}
