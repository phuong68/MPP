package Lesson4_ProbE;

import java.util.ArrayList;
import java.util.List;


public class Main {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("Steven");
		Employee e2 = new Employee("Dao");
		Employee e3 = new Employee("Jack");
		
		Account[] someCheckingAccounts = new CheckingAccount[2];
		someCheckingAccounts[0] = new CheckingAccount("c123", 5.0, 100);
		someCheckingAccounts[1] = new CheckingAccount("c456", 5.0, 100);
		
		Account[] someSavingsAccounts = new SavingsAccount[3];
		someSavingsAccounts[0] = new SavingsAccount("s1234", 0.01, 1000);
		someSavingsAccounts[1] = new SavingsAccount("s5678", 0.02, 1500);
		someSavingsAccounts[2] = new SavingsAccount("s6789", 0.03, 2000);
		
		
		e1.addAccount(someCheckingAccounts[0]);
		e1.addAccount(someSavingsAccounts[0]);
		
		e2.addAccount(someCheckingAccounts[1]);
		e2.addAccount(someSavingsAccounts[1]);
		
		e3.addAccount(someSavingsAccounts[2]);
		
		List<Employee> employees = new ArrayList<>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		
		System.out.println("Sum all Employee balance: "+Admin.computeUpdatedBalanceSum(employees));
		
		
	}

}
