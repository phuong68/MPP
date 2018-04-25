package Lesson9II_4;

import java.util.function.UnaryOperator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main.printSquares(4);
		Main.printSquares2(4);
	}
	
	public static void printSquares2(int num) {
		
		IntStream.iterate(1, n -> n+1 )
						.limit(num)
						.map(n->n*n)
						.forEach(System.out::println);
	}
	
	public static void printSquares(int num) {
		
		UnaryOperator<Integer> u =x->x+1;
		
		Stream.iterate(1, u).limit(num)
									.map(x -> x * x)
									.forEach(System.out::println);
	}
	

}
