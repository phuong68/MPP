package Lesson4_ProbE;

import java.util.*;

public class Employee {
	
	private String name;
	private List<Account> accounts = new ArrayList<>();
	
	public String getName() {
		return name;
	}
	
	public Employee(String name) {
		this.name = name;
	}
	
	public void addAccount(Account acc)  {
		
		if(acc == null) {
			throw new NullPointerException("Cannot add null account");
		}
		
		accounts.add(acc);
	}
	
	public double computeUpdatedBalanceSum() {
		double sum = 0.0;
		for(Account a : accounts) {
			sum += a.computeUpdatedBalance();
		}
		return sum;
	}
	
}
