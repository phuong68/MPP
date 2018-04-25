package Prob6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterItems 
{
	public static void main(String args[])
	{
		//Uncomment the code when you are ready and implement the generic filter method
		
		List<Integer> myInts =new ArrayList<Integer>();
		Integer[] otherInts = new Integer[] {0,1,2,3,4,5,6,7,8,9};
		myInts.addAll(Arrays.asList(otherInts));
		//Function filter called for List<Integer> with the applied criteria n -> n % 2 != 0
		Collection<Integer> onlyOdds = filter(n -> n % 2 != 0, myInts);
		System.out.println(onlyOdds);
		
		//Function filter called for List<Integer> with the applied criteria n -> n % 2 == 0
		Collection<Integer> onlyEvens = filter(n -> n % 2 == 0, myInts);
		System.out.println(onlyEvens);
		
		List<String> myString =new ArrayList<String>();
		String[] otherString = new String[] {"Ali","Zag","Micheal","Mahd","Kristy"};
		myString.addAll(Arrays.asList(otherString));
		//Function filter called for List<String> with the applied criteria n ->n.toString().length()>3
		Collection<String> onlyLong = filter(n ->n.toString().length()>3, myString);
		System.out.println(onlyLong);
		
		//Function filter called for List<String> with the applied criteria n ->n.toString().length()>3
		Collection<String> onlyM = filter(n ->n.toString().startsWith("M"), myString);
		System.out.println(onlyM);
		
		
		//		Expected output
		//				[1, 3, 5, 7, 9]
		//				[0, 2, 4, 6, 8]
		//				[Micheal, Mahd, Kristy]
		//				[Micheal, Mahd]
		
	}
	
	// Implement most generic filter function that can work well for the above code in main
	public static <T> Collection<T> filter(Predicate<T> fn,List<T> list){
//		Collection<T> ret = new ArrayList<T>();
//		for(T t: list) {
//			if (fn.test(t))
//						ret.add(t);
//		}
//		return ret;
		
		return list.stream()
			.filter(t -> fn.test(t))
			.collect(Collectors.toList());
		
		
	}
	
}
