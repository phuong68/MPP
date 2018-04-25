package Prob4;
import java.math.BigInteger;
import java.util.*;
public class TestCode {
	@SuppressWarnings("serial")
	public static void main(String[] args) {
		List<Person> testData = new ArrayList<Person>() {
			{
				add(new Person("Jim", 40));
				add(new Person("Tom", 25));
				add(new Person("Bill", 30));
				add(new Person("Rich", 35));
				add(new Person("Anna", 20));
				add(new Person("Ricardo",17));
				add(new Person("Jimenez", 26));
				add(new Person("Jesus", 45));
				add(new Person("Michelle", 30));
				add(new Person("Angelina", 33));
				add(new Person("Julio", 49));
				add(new Person("Andrew", 34));
			}
		};
		// Uncomment the next line when you are ready and implemented getNamesLen
		System.out.println("Total length of Names is:"+ getNamesLen(testData));
		
		// Expected output is: 
		// Total length of Names is:64
	}
	
	// This method takes list of Persons and returns total length of Names
	
	//Use reduce method to accomplish it, in case you are not using reduce with single stream pipeline 
	//without any free variables you will loose 50% of marks
	public static int getNamesLen(List<Person> testData)
	{
		return testData.stream()
				.map(p->p.getName().length())
				.reduce(0,( a, b)-> a+b);
			
		
	}
}
