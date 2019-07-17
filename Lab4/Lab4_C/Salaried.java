package Lab4_C;

public class Salaried extends Employee {
	
	double salary;
	
	@Override
	public double calcGrossPay() {
		return salary;
	}

}
