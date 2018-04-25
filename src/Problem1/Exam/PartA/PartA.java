package Problem1.Exam.PartA;

import java.util.function.BiFunction;
import java.util.function.Function;

//work with this lambda expression:   (Integer x, Integer y) -> x * y
public class PartA {
	// name and type of lambda goes here
	BiFunction<Integer,Integer,Integer> bifunc1= (x,y)->x*y;
	
	// representing lambda as a method reference
	BiFunction<Integer,Integer,Integer> bifunc2= PartA::Multiply;
		
	//representing lambda as a static nested class
	public static class MyBiFunc implements BiFunction<Integer,Integer,Integer>{
		@Override
		public Integer apply(Integer x,Integer y) {
			return x*y;
		}
	}
	
	public class MyTwo<T>{
		T x;
		T y;
		public MyTwo(T x, T y) {
			super();
			this.x = x;
			this.y = y;
		}
		public T getX() {
			return x;
		}
		public T getY() {
			return y;
		}
		
		
	}
	
	Function<PartA.MyTwo<Integer>,Integer> func1 = ( mt) -> mt.getX()*mt.getY();
	
	Function<PartA.MyTwo<Integer>,Integer> func2 = PartA::Multiply;
	
	public  class MyFunc implements Function<MyTwo<Integer>,Integer>{

		@Override
		public Integer apply(MyTwo<Integer> t) {
			
			 return t.getX()*t.getY();
		}
		
	}
	//evaluate with Double inputs 2,5
	
	public void evaluator() {
//		System.out.println("For lambda");
		System.out.println(bifunc1.apply(2, 3));
//		System.out.println("For Method ref");
		System.out.println(bifunc2.apply(2, 3));
//		System.out.println( "For class");
		System.out.println(new MyBiFunc().apply(2, 3));
		

		//System.out.println("For lambda");
		System.out.println(func1.apply(new MyTwo<Integer>(2,3)));
//		System.out.println("For Method ref");
		System.out.println(func2.apply(new MyTwo<Integer>(2,3)));
//		System.out.println( "For class");
		System.out.println(new MyFunc().apply(new MyTwo<Integer>(2, 3)));
		
	}
	public static void main(String[] args) {
		PartA p = new PartA();
		p.evaluator();
	}
	
	public static Integer Multiply(Integer x, Integer y) {
		return x*y;
	}
	public static Integer Multiply(MyTwo<Integer> mt) {
		return mt.getX()*mt.getY();
	}
}
