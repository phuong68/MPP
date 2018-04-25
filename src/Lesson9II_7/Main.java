package Lesson9II_7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

		public static void main(String[] args) {
			List<Employee> list = Arrays.asList(new Employee("Joe", "Davis", 120000), new Employee("John", "Sims", 110000),
					new Employee("Joe", "Stevens", 200000), new Employee("Andrew", "Reardon", 80000),
					new Employee("Joe", "Cummings", 760000), new Employee("Steven", "Walters", 135000),
					new Employee("Thomas", "Blake", 111000), new Employee("Alice", "Richards", 101000),
					new Employee("Donald", "Trump", 100000));

			// 9II_7a
			String str = list.stream()
				.filter(s->s.salary>100000 && s.lastName.charAt(0)>'M' && s.lastName.charAt(0)<'Z')
				.map(s->s.firstName+" "+s.lastName).sorted().collect(Collectors.joining(", "));
			
			System.out.println(str);
			
			
			//9II_7b
			System.out.println(LambdaLibrary.filter.apply(list,100000,'M'));
			

	}

}
