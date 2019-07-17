package Lab4_C;

public final class Paycheck {
	double grossPay;
	double fica;
	double state;
	double local;
	double medicare;
	double socialSecurity;
	
	Paycheck(double gross, double fica, double state, double local, double medicare, double ss) {
		this.grossPay = gross;
		this.fica = fica;
		this.state = state;
		this.local = local;
		this.medicare = medicare;
		this.socialSecurity = ss;
	}
	
	public void print() {
		
	}
	
	public void getNetPay() {
		double netPay = grossPay - fica - state - local - medicare - socialSecurity;
		System.out.println("NetPay is " + netPay);
	}
}
