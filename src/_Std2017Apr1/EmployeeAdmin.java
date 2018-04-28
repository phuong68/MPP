package _Std2017Apr1;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeAdmin {

	// returns a list of social security numbers, sorted in ascending order,
	// that belong to an Employee in the input table but that are not on the
	// socSecNums input list
	public static List<String> prepareSsnReport(HashMap<String, Employee> table, List<String> socSecNums) {
		//implement
//		return table.values().stream()
//										.filter(emp -> !socSecNums.contains(emp.getSsn()))
//										//.map(emp ->emp.getSsn() )
//										//.sorted( Comparator.comparing(s-> Long.getLong(s)))
//										.sorted(Comparator.comparing(Employee::getName, (s1, s2) -> s2.compareTo(s1)))
//										.map(emp ->emp.getSsn() )
//										.collect(Collectors.toList());
		
		return table.values().stream()
				.filter(emp -> !socSecNums.contains(emp.getSsn()))
				.map(emp ->Integer.parseInt(emp.getSsn()))
				.sorted()
				.map(i -> i.toString())
				.collect(Collectors.toList());
				
	}			
		//return a list of Employees whose social security number is on the input list socSecNums
				//and whose salary is >80000; the return list does not need to be sorted  
	public static List<Employee> prepareEmpReport(HashMap<String, Employee> table, List<String> socSecNums) {
		//implement
		return table.values().stream()
				.filter(emp->socSecNums.contains(emp.getSsn()) && emp.getSalary()>80000)
				.collect( Collectors.toList());
	}
}