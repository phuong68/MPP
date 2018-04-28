package _Std2017Mar1;

import java.util.List;
import java.util.stream.Collectors;

public class Admin {
	public static List<Student> obtainHonorRoll(List<Student> list) {
		//implement
		return list.stream().filter(s->s.getGpa()>3 && s.getMajor()==Majors.CS)
        .collect(Collectors.toList());
	}
}
