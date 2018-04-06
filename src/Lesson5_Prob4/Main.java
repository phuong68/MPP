package Lesson5_Prob4;

import java.time.LocalDate;


public class Main {
	public static void main(String[] args) {
//		Customer cust = new Customer("Bob");
//		Order order = Order.newOrder(cust, LocalDate.now());
//		order.addItem("Shirt");
//		order.addItem("Laptop");
//
//		order = Order.newOrder(cust, LocalDate.now());
//		order.addItem("Pants");
//		order.addItem("Knife set");
//
//		System.out.println(cust.getOrders());
		
		Customer cust = CustOrderFactory.createCustomer("Bob");
		Order order = CustOrderFactory.createOrder(cust, LocalDate.now());
		
		CustOrderFactory.addItemToOrder(order, "Shirt");
		CustOrderFactory.addItemToOrder(order, "Laptop");

		Order order1 = CustOrderFactory.createOrder(cust, LocalDate.now());
		
		CustOrderFactory.addItemToOrder(order1, "Pants");
		CustOrderFactory.addItemToOrder(order1, "Knife set");

		System.out.println(cust.getOrders());
	}
}

		
