package Lesson11_6;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class Main {
	
	public static boolean contains1(List<String> list, String s) {
		//could return list.contains(s), but this does not generalize
		for(String x: list) {
			if(x == null && s == null) return true;
			if(s == null || x == null) return false;
			if(x.equals(s)) return true;
		}
		return false;
		
	}
	
	private static void test1() {
		List<String> list = Arrays.asList("Bob","Joe","Tom");
		boolean result = Main.contains1(list,"Tom");
		
		System.out.println(result);
		
	}
	
	private static <T> boolean contains3(List<? extends T> list, T e, BiPredicate<T, ? super T> bf){ 
		for(T emp: list) {
			if (e == null && emp ==null) return true;
			if (e ==null || emp == null) continue;
			if (bf.test(emp,e)) return true;
		}
		return false;
	}
	
	
	public static void main(String[] a) {
		
		
		System.out.println("====== test 1 =======");
		Main.test1();
		System.out.println("====== test 2 =======");
		Main.test2();
		System.out.println("====== test 3 =======");
		Main.test3();
		
		
	}

	
	private static void test2() {
		List<Employee> list = new ArrayList();
		list.add(new Employee(1001,"Bob",4000));
		list.add(new Employee(1002,"Joe",5000));
		list.add(new Employee(1003,"Tom",6000));
		
		Employee e = new Employee(1003,"Tom",6000);
		
		//boolean result = Main.contains2(list,e,(e1,e2)->e1.id == e2.id );
		
		//System.out.println(result);
		
	}
	
	private static void test3() {
		List<Employee> list = new ArrayList();
		list.add(new Employee(1001,"Bob",4000));
		list.add(new Employee(1002,"Joe",5000));
		list.add(new Employee(1003,"Tom",6000));
		
		Employee e = new Employee(1003,"Tom",6000);
		
		boolean result = Main.contains3(list,e,(Employee e1, Employee e2)->e1.id == e2.id );
		
		System.out.println(result);
		
	}

	
	
	
	

}
