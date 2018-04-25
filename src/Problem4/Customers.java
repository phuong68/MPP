package Problem4;

import java.util.ArrayList;
import java.util.List;

public class Customers {
	private String name;
	private int age;
	private List<Orders> myorders;
	public Customers(String name, int age) {
		this.name = name;
		this.age = age;
		myorders=new ArrayList<Orders>();
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	public List<Orders> getOrders() {
		return myorders;
	}
	
	public void placeorder(double amount)
	{
		myorders.add(new Orders(this.name,amount));
	}
	@Override
	public String toString() {
		return "(name:"+name + ", " + age + ")";
	}
}
