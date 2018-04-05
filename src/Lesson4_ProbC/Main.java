package Lesson4_ProbC;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;



public class Main {

	public static void main(String[] args) {
		
		Employee[] employees = new Employee[3];
		Employee salariedEmp = new Salaried("101", 50000.0);
		
		Employee hourlyEmp =  new Hourly("102", 10.0, 40);
		
		List<Order> orders = Arrays.asList(
				new Order(LocalDate.of(2017, 12, 1), 20000.0),
				new Order(LocalDate.of(2018, 2, 6), 10000.0),
				new Order(LocalDate.of(2017, 12, 24), 15000.0),
				new Order(LocalDate.of(2018, 1, 10), 25000.0),
				new Order(LocalDate.of(2018, 2, 18), 50000.0)
		);
		
		Employee commEmp =  new Commissioned("103",  0.10, 50000.0, orders);
		
//		bobSalariedEmp.print();
//		//bobSalariedEmp.calcCompensation(2, 2018).print();		
//		anaHourlyEmp.print();
//		carlosCommEmp.print();
	}

}
