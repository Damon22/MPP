package Lab5_2;

public final class Triangle implements ComputeArea {
	private double base;
	private double height;
	
	Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	
	public double getBase() {
		return base;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double computeArea() {
		return base * height * 0.5;
	}
}
