package Lab7_2;

public class Ellipse implements Polygon {
	private double a, E;
	public Ellipse(double a, double E) {
		this.a = a;
		this.E = E;
	}
	
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}

	public double getE() {
		return E;
	}
	public void setE(double e) {
		this.E = e;
	}

	@Override
	public double[] getSides() {
		return new double[] {a, E};
	}
	
	@Override
	public double computePerimeter() {
		double[] sides = getSides();
		return 4 * sides[0] * sides[1];
	}

}
