package Lesson5_Prob4;

import java.time.LocalDate;

final public class BirthInfo {
	private LocalDate dateOfBirth;	
	
	 BirthInfo(LocalDate dob) {
		dateOfBirth = dob;
	}

	final LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	
	 String printDOB() {
		return  dateOfBirth.toString();
	}
	
	

	
	 
	 
}
