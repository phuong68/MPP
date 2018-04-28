package _Std2017May2;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Admin {
	//Returns phone numbers (in sorted order) of the Library Members who have ever checked out the specified lending item
	public static List<String> getPhoneNums(LibraryMember[] members, LendingItem item) {

		
		return Arrays.asList(members).stream()
													.filter(m -> m.getCheckoutRecord().getCheckoutEntryList().stream()
																																	.filter(core -> core.lendingItem==item).count() >0)
													.map(m->m.getPhone())
													.sorted()
													.collect(Collectors.toList());
	}
}