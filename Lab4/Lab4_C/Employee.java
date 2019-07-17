package Lab4_C;

public abstract class Employee {
	public String empId;
	
	public void print() {
		
	}
	
	public Paycheck calcCompensation(int month) {
		double grossPay = calcGrossPay();
		double fica = grossPay * 23 / 100;
		double state = grossPay * 5 / 100;
		double local = grossPay * 1 / 100;
		double medicare = grossPay * 3 / 100;
		double ss = grossPay * 7.5 / 100;
		return new Paycheck(grossPay, fica, state, local, medicare, ss);
	}
	
	public abstract double calcGrossPay();
}
