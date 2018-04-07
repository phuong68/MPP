package Lesson5_Prob4;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Person p = PersonBirthInfoFactory.createPerson("Jack", LocalDate.of(1960, 4, 12));
		
		PersonBirthInfoFactory.printPerson(p);

	}

}
