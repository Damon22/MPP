package Lab7_2;

public class Circle implements Polygon {
	private double radius;
	public Circle(double radius) {
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double[] getSides() {
		double[] sides = {radius};
		return sides;
	}
}
