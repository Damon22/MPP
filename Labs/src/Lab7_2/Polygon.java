package Lab7_2;

public interface Polygon {
	public double[] getSides();
	public default double computePerimeter() {
		double[] sides = getSides();
		if (sides.length == 1) {
			return 2 * Math.PI * sides[0];
		} else {
			double sum = 0;
			for (int i = 0; i < sides.length; i++)
				sum += sides[i];
			return sum;
		}
	}
}
