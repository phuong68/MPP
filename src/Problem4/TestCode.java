package Problem4;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

import Lesson5_Prob4a.Customer;
public class TestCode {
	@SuppressWarnings("serial")
	public static void main(String[] args) {
		
		Customers jim=new Customers("Jim", 40);
		jim.placeorder(200);
		jim.placeorder(200);
		jim.placeorder(200);
		Customers tom=new Customers("Tom", 25);
		tom.placeorder(500);
		Customers michelle=new Customers("Michelle", 30);
		michelle.placeorder(700);
		michelle.placeorder(700);
		michelle.placeorder(700);
		michelle.placeorder(700);
		michelle.placeorder(700);
		List<Customers> testData = new ArrayList<Customers>() {
			{
				add(jim);
				add(tom);
				add(michelle);
				
			}
		};
		System.out.println("Valued customers:"+ getValueCustomers(testData));
		
		// Expected output is 
		// Valued Customers:2
	}
	
	// This method takes list of Customers and returns total # of value customers
	
	//Use reduce method to accomplish it, in case you are not using reduce with single stream pipeline 
	//without any free variables you will loose 50% of marks
	public static int getValueCustomers(List<Customers> testData)
	{
		return testData.stream()
				.filter(c -> c.getOrders().size()>=3)
				.map(c->1)
				.reduce(0,(a,b)-> a+b);
				
		
		
				
	}
}
