package Lesson8_1J2;

import java.util.function.Supplier;

public class Main {

	/*
	@FunctionalInterface
	public interface Supplier<T> {
	    
	     // Gets a result.
	     //
	     // @return a result	     
	    T get();
	}
	*/
	
	public static void main(String[] args) {
		Supplier<Double> supplier = Math::random;
		System.out.println(supplier.get());
	}

}
