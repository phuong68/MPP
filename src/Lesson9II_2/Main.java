package Lesson9II_2;

import java.math.BigInteger;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] s) {
		Stream<BigInteger> primes = createInfintePrimes(5);
		primes.forEach(System.out::println);
	}
	
	public static Stream<BigInteger> createInfintePrimes(int l){
		return Stream.iterate(2, n -> Main.nextPrime(n)).limit(l).map(i->BigInteger.valueOf(i));
	}
	
	public static Integer nextPrime(int num) {
		if(num < 2) return 2;
		int next = num + 1;
		while(!isPrime(next)) {
			next = next + 1;
		}
		return Integer.valueOf(next);
	}
	
	public static boolean isPrime(int n) {
		for(int k = 2; k * k <= n; ++k) {
			if(n % k == 0) return false;
		}
		return true;
		
	}
}
