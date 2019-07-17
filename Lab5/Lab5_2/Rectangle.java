package Lab5_2;

public final class Rectangle implements ComputeArea {
	private double width;
	private double length;
	
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getLength() {
		return length;
	}
	
	public double computeArea() {
		return width * length;
	}
}
