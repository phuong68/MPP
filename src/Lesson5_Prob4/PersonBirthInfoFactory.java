package Lesson5_Prob4;

import java.time.LocalDate;

public class PersonBirthInfoFactory {

	public  static Person createPerson(String name, LocalDate dob) {
		
		Person p = new Person(name);
		p.setBirthInfo(new BirthInfo(dob));
		
		return p;
		
	}
	
	public  static void printPerson ( Person p) {
		
		System.out.println("Name: " + p.getName() + " - DOB: " + p.getBirthInfo().printDOB());
		
	}
	
}
