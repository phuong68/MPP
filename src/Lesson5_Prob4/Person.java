package Lesson5_Prob4;

final public class Person {
	private String name;
	private BirthInfo birthInfo;
	
	Person(String name) {
		this.name = name;
	}

	String getName() {
		return name;
	}

	final BirthInfo getBirthInfo() {
		return birthInfo;
	}

	void setBirthInfo(BirthInfo birthInfo) {
		this.birthInfo = birthInfo;
	}

	
	
	
	 
	 
}
