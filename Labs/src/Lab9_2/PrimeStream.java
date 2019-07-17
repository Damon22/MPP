package Lab9_2;

import java.math.BigInteger;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrimeStream {

	final Stream<BigInteger> primes = Stream.iterate(BigInteger.valueOf(2), b->b.nextProbablePrime());
	
	public void printFirstNPrimes(long n) {
		Supplier<Stream<BigInteger>> supplier = ()->primes;
		supplier.get().limit(n).collect(Collectors.toList()).forEach(System.out::println);;
	}
	
	public static void main(String[] args) {
		PrimeStream ps = new PrimeStream(); //PrimeStream is enclosing class 
		ps.printFirstNPrimes(10);
		System.out.println("====");
		ps.printFirstNPrimes(5);
	}

}
