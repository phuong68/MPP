package Problem1.Exam.PartB;

import java.util.function.Supplier;

//work with this lambda expression:   () -> "Hi this is MPP Final Exam"
public class PartB {
	// name and type of lambda goes here
	Supplier<String> supp1=()->"Hi this is MPP Final Exam";
	
	// representing lambda as a method reference
	Supplier<String> supp2=PartB::showdisplay;
	
		
	//representing lambda as a static nested class
	public class MySupp implements Supplier<String>{

		@Override
		public String get() {
			
			return "Hi this is MPP Final Exam";
		}
		
		
		
	}
	
		
	//evaluate with Double inputs 2,5
	public void evaluator() {
//		System.out.println("For lambda");
		System.out.println(supp1.get());
//		System.out.println("For Method ref");
		System.out.println(supp2.get());
//		System.out.println( "For class");
		System.out.println(new MySupp().get());
		
	}
	public static void main(String[] args) {
		PartB p = new PartB();
		p.evaluator();
	}
	
	public static String showdisplay() {
		return "Hi this is MPP Final Exam";
	}
	
}