package Lab5_2;

public final class Circle implements ComputeArea {
	private double radius;
	
	Circle(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double computeArea() {
		return Math.PI * radius * radius;
	}
}
