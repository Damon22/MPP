package Lab3_3_2;

public class Cylinder {
	private double height = 1.0;
	private Circle circle;
	
	Cylinder() {
		circle = new Circle();
	}
	
	Cylinder(double radius) {
		this(radius, 1);
	}
	
	Cylinder(double radius, double height) {
		circle = new Circle(radius);
		this.height = height;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getVolume() {
		return height * circle.getArea();
	}
}
