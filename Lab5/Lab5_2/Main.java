package Lab5_2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComputeArea[] list = {new Triangle(3, 4), new Rectangle(1, 2), new Circle(1)};
		double sum = 0;
		for (ComputeArea a: list) {
			sum += a.computeArea();
		}
		System.out.printf("Sum of Areas = %.2f", sum);
	}

}
