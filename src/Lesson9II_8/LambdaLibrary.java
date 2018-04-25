package Lesson9II_8;

import java.util.List;
import java.util.stream.Collectors;

public class LambdaLibrary {
	public static final TriFunction<List<Employee>,Double,Character, Long> triFunction1= 
			(listEmp,sal,startChar) -> listEmp.stream()
															.filter(emp -> emp.salary>sal && emp.lastName.charAt(0)>startChar)
															.count();
			
	public static final TriFunction<List<Employee>,Double,Character, String> triFunction2= 
					(listEmp,sal,startChar) -> listEmp.stream()
																	.filter(emp -> emp.salary>sal && emp.lastName.charAt(0)>startChar)
																	.map(emp -> (emp.firstName + " " + emp.lastName).toUpperCase())
																	.sorted()
																	.collect(Collectors.joining(", "));
	
}
