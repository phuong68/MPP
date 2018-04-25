package Lesson11_5;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList();
		list.add(2);
		list.add(3);
		list.add(1);
		list.add(5);
		System.out.println(secondSmallest(list)); 

	}

	private static <T extends Comparable> T secondSmallest(List<T> list) {
		T secondSmall = null;
		if (list.size()>2) {
			Collections.sort(list);
			secondSmall = list.get(1);
		}
		return secondSmall;
	}

}
