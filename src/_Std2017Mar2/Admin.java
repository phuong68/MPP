package _Std2017Mar2;

import java.util.List;

public class Admin {
	public static double computeUpdatedBalanceSum(List<Employee> list) {
		//implement
		return list.stream().map(e -> Double.valueOf(e.computeUpdatedBalanceSum())).reduce(Double.valueOf(0), (a,b)-> a+b);
	}
}
