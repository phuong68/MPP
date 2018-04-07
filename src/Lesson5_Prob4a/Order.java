package Lesson5_Prob4a;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Order {
	private LocalDate orderDate;
	private List<Item> items;
	
	//use a factory method
	private Order(LocalDate orderDate) {
		this.orderDate = orderDate;
		items = new ArrayList<Item>();	
	}
	public static Order newOrder(Customer cust, LocalDate date) {
		if(cust == null) throw new NullPointerException("Customer should not be null");
		
		Order ord = new Order(date);
		cust.addOrder(ord);
		
		return ord;
	}
	
	public void addItem(String name){
		items.add(new Item(name));
	}
	
	@Override
	public String toString() {
		return orderDate + ": " + 
	              items.toString();
	}
}
