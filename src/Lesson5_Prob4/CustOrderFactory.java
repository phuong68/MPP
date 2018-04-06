package Lesson5_Prob4;

import java.time.LocalDate;

public class CustOrderFactory {
	
	public static Customer createCustomer(String name) {
		return new Customer(name);
	}
	
	public static Order createOrder(Customer cus, LocalDate orderDate) {
		
		if(cus == null) throw new NullPointerException("Null customer");
		Order ord = Order.newOrder(cus,orderDate);
		cus.addOrder(ord);
		return ord;
	}
	
	public static void addItemToOrder(Order order, String item) {
		
		order.addItem(item);
	}
}
