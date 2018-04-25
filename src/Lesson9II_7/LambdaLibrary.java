package Lesson9II_7;

import java.util.List;
import java.util.stream.Collectors;

public class LambdaLibrary {
	public static final TriFunction<List<Employee>,Integer,Character, String> filter= 
			(listEmp,sal,startChar) -> listEmp.stream()
															.filter(emp -> emp.salary>sal && emp.lastName.charAt(0)>startChar)
															.map(emp -> emp.firstName + " " + emp.lastName)
															.sorted()
															.collect(Collectors.joining(", "));
	
}
