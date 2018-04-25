package Problem6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.BiFunction;
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
		//Function operation is called
		Collection<Integer> squares = operation(n -> n*n, myInts);
		System.out.println(squares);
		
		//Function operation is called
		Collection<Integer> digits = operation(n -> (n+n/100), myInts);
		System.out.println(digits);
		
		List<String> myString =new ArrayList<String>();
		String[] otherString = new String[] {"Ali","Zag","Micheal","Mahd","Kristy"};
		myString.addAll(Arrays.asList(otherString));
		
		//Function operation is called
		Collection<String> uppercase = operation(n ->n.toString().toUpperCase(), myString);
		System.out.println(uppercase);
		
		//Function operation is called
		Collection<String> modified = operation(n ->n.toString().concat(";"), myString);
		System.out.println(modified);
		
		//		Expected output
//				[0, 1, 4, 9, 16, 25, 36, 49, 64, 81]
//				[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
//				[ALI, ZAG, MICHEAL, MAHD, KRISTY]
//				[Ali;, Zag;, Micheal;, Mahd;, Kristy;]
		
	}
	
	// Implement most generic function that can work well for the above code in main
	//This is generic method that takes lambda expression and collection as input
	public static <T> Collection<T> operation(Function<T,T> bf,List<T> list){
		
//		Collection<T> ret = new ArrayList<>();
//		
//		for(T t:list) {
//			ret.add(bf.apply(t));
//		}
//		return ret;
		
		return list.stream()
			.map(t->bf.apply(t))
			.collect( Collectors.toList());
		
	}
	
}
