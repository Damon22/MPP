package Lab9_4;

import java.util.stream.IntStream;

public class SquareStream {
	
	public void printSquares(int num) {
		IntStream.iterate(1, x -> (int)Math.pow((int)Math.sqrt(x) + 1, 2))
									  .limit(num)
									  .forEach(System.out::println);
	}

	public static void main(String[] args) {
		SquareStream ss = new SquareStream();
		ss.printSquares(4);
	}

}
