package _Std2017Mar2;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	String name;
	List<Account> accounts;
	
	public String getName() {
		return name;
	}
	
	public Employee(String name) {
		super();
		this.name = name;
	}

	public void addAccount(Account acc) {
		if ( accounts == null) accounts = new ArrayList();
		accounts.add(acc);
	}

	public double computeUpdatedBalanceSum() {
		//implement
		return accounts.stream().map(acc -> Double.valueOf(acc.updateComputedBalance())).reduce(Double.valueOf(0),(a,b) -> a+b);
	}
	
	
}
