package Lesson4_ProbC;

import java.time.LocalDate;

public abstract class Employee {
	
	private String empId;
	
	
	public Employee(String empId) {
		this.empId = empId;
		
	}
	
	public String getEmpId() { 
		return empId; 
	}
	

	public void print() {
		LocalDate now = LocalDate.now();
		Paycheck paycheck = calcCompensation(now.getMonthValue(), now.getYear());
		paycheck.print();
	}
	public Paycheck calcCompensation(int month, int year) {
		double grossPay = calcGrossPay(month, year);
		return new Paycheck(this, grossPay, Tax.FICA, Tax.State, Tax.Local, Tax.Medicare, Tax.SocialSecurity);
	}

	abstract public double calcGrossPay(int month, int year);
}
