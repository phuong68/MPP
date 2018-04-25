package Lesson9II_6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Set<String> s1 = new HashSet<String>();
		s1.add("A");
		s1.add("B");
		
		Set<String> s2 = new HashSet<String>();
		s2.add("D");
		
		Set<String> s3 = new HashSet<String>();
		s3.add("1");
		s3.add("3");
		s3.add("5");
		

		List<Set<String>> listSet = new ArrayList<>();
		listSet.add(s1);
		listSet.add(s2);
		listSet.add(s3);
		
		Set<String> s4=union(listSet);
		s4.stream().forEach(System.out::println);
	}
	
	public static  Set<String> union(List<Set<String>> sets){
		
		return sets.stream().map(setStr ->setStr.stream())
									.reduce((a,b)->Stream.concat(a,b)).get()
									.collect(Collectors.toSet());

		
	}

}
