package Lesson5_Prob4a;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Main {
	public static void main(String[] args) {
		
		Customer cust = CustOrderFactory.createCustomer("Bob");
		Order order = CustOrderFactory.createOrder(cust, LocalDate.now());
		
		order.addItem("Shirt");
		order.addItem("Laptop");
		order.addItem("Pants");
		order.addItem("Table");
		
		order = CustOrderFactory.createOrder(cust, LocalDate.now().plusDays(1));
		
		order.addItem("Pants");
		order.addItem("Knife set");

		System.out.println(cust.getOrders());
	}
	
	String findBestSeller(List<Order> ords){
		
		Map<Item,Integer> map = new HashMap<>();
		int count ;
		
		for(Order od: ords)
		{
			for(Item it: od.getItems())
			{
				if (map.containsKey(it.getName())) {
					 count = map.get(it.getName());
					 map.put(it, ++count);
					
				}else
				{
					
				}
			}
			
		}
		
		return null;
		
	}
	
}

		
