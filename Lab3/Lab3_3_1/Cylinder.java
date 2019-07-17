package Lab3_3_1;

public class Cylinder extends Circle {
	private double height = 1.0;
	Cylinder() {
		super();
	}
	
	Cylinder(double radius) {
		this(radius, 1);
	}
	
	Cylinder(double radius, double height) {
		super(radius);
		this.height = height;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getVolume() {
		return height * this.getArea();
	}
}
