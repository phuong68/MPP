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
				new Order(LocalDate.of(2017, 11, 1), 20000.0),
				new Order(LocalDate.of(2017, 12, 3), 10000.0),
				new Order(LocalDate.of(2018, 1, 5), 15000.0),
				new Order(LocalDate.of(2018, 2, 7), 25000.0),
				new Order(LocalDate.of(2018, 3, 9), 50000.0)
		);
		
		Employee commEmp =  new Commissioned("103",  0.10, 50000.0, orders);
		
		employees[0] = salariedEmp;
		employees[1] = hourlyEmp;
		employees[2] = commEmp;
		
		double sumSal = 0.0;
		int month = 2;// LocalDate.now().getMonthValue();
		int year = 2018;//LocalDate.now().getYear();
		
		for (Employee emp: employees) {
			
			sumSal += emp.calcCompensation(month, year).getNetPay();
		}
		
		System.out.println("Sum net pay for " + month + "/" + year + ": " + sumSal);
		
	}

}
