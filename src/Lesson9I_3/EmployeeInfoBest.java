package Lesson9I_3;

import java.util.*;
import java.util.function.Function;


@SuppressWarnings("rawtypes")
public class EmployeeInfoBest {
	static enum SortMethod {
		BYNAME, BYSALARY
	};

	final Function<Employee, String> sortByName = e -> e.getName();
	final Function<Employee, Integer> sortBySalary = e -> e.getSalary();

	final Pair<Function, Function> funSortByName = new Pair<>(sortByName, sortBySalary);
	final Pair<Function, Function> funSortBySalary = new Pair<>(sortBySalary, sortByName);
	@SuppressWarnings("serial")
	final HashMap<SortMethod, Pair<Function, Function>> mapSort = new HashMap<SortMethod, Pair<Function, Function>>() {
		{
			put(SortMethod.BYNAME, funSortByName);
			put(SortMethod.BYSALARY, funSortBySalary);
		}
	};

	@SuppressWarnings("unchecked")
	public void sort(List<Employee> emps, final SortMethod method) {
		Collections.sort(emps, Comparator.comparing(mapSort.get(method).first).thenComparing(mapSort.get(method).second));

	}

	public static void main(String[] args) {
		List<Employee> emps = new ArrayList<>();
		emps.add(new Employee("Joe", 100000));
		emps.add(new Employee("Tim", 50000));
		emps.add(new Employee("Andy", 60000));
		EmployeeInfoBest ei = new EmployeeInfoBest();
		ei.sort(emps, EmployeeInfoBest.SortMethod.BYNAME);
		System.out.println(emps);
		// same instance
		ei.sort(emps, EmployeeInfoBest.SortMethod.BYSALARY);
		System.out.println(emps);
	}
}
