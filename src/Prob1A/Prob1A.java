package Prob1A;

import java.util.function.Function;

//import Problem1.Exam.PartA.SampleProblem1.BiFunc;

//work with this lambda expression:   (Double x, Double y) -> x * y < x + y
public class Prob1A {
	
	public class TwoNum{
		private Double firstNum;
		private Double secondNum;
		
		public Double getFirstNum() {
			return firstNum;
		}

		public Double getSecondNum() {
			return secondNum;
		}

		public TwoNum(Double firstNum, Double secondNum) {
			super();
			this.firstNum = firstNum;
			this.secondNum = secondNum;
		}
		
		
		
	} 
	
	public static Boolean calculate(TwoNum tn)
	{
		
		return tn.getFirstNum() * tn.getSecondNum()< tn.getFirstNum() + tn.getSecondNum();
	}
	
	public class myCalculation implements Function<TwoNum,Boolean>{

		@Override
		public Boolean apply(TwoNum tn) {
			return tn.getFirstNum() * tn.getSecondNum() < tn.getFirstNum() + tn.getSecondNum();
			
		}
		
	}
	
	// name and type of lambda goes here
	Function<TwoNum,Boolean> func1 = (tN)-> tN.getFirstNum() * tN.getSecondNum()< tN.getFirstNum() + tN.getSecondNum();
	
	// representing lambda as a method reference
	Function<TwoNum,Boolean> func2 = Prob1A::calculate;
		
	//representing lambda as a static nested class
	Function<TwoNum,Boolean> func3 = (tn)->new myCalculation().apply(tn);
	
		
	//evaluate with Double inputs 2.1, 0.35
	public void evaluator() {
		System.out.println("Use lambda here");
		System.out.println(func1.apply(new TwoNum(2.1,0.35)));
		
		System.out.println("Use method reference here");
		System.out.println(func2.apply(new TwoNum(2.1,0.35)));
		
		System.out.println("Use static class here");
		System.out.println(func3.apply(new TwoNum(2.1,0.35)));
		
	}
	public static void main(String[] args) {
		Prob1A p = new Prob1A();
		p.evaluator();
	}
	
	
}
