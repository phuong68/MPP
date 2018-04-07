package Lesson5_Prob4a;

import java.time.LocalDate;

public class CustOrderFactory {
	
	public static Customer createCustomer(String name) {
		return new Customer(name);
	}
	
	public static Order createOrder(Customer cus, LocalDate orderDate) {
		
		return  Order.newOrder(cus,orderDate);
	}
}
