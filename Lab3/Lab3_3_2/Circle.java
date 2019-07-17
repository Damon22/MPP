package Lab3_3_2;

public class Circle {
	private double radius = 1.0;
	private String color = "red";
	
	Circle() {
		
	}
	
	Circle(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getArea() {
		return Math.PI * radius * radius;
	}
	
	public String toString() {
		return "Circle's color is " + color;
	}
}
