package Lab4_C;

public class Hourly extends Employee {

	double hourlyWage;
	double hoursPerWeek;
	
	@Override
	public double calcGrossPay() {
		return hourlyWage * hoursPerWeek * 4;
	}
	
}
