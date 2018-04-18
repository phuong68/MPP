package Q1;

import java.util.*;

public class Admin {
	//Returns phone numbers (in sorted order) of the Library Members who have ever checked out the specified lending item
	public static List<String> getPhoneNums(LibraryMember[] members, LendingItem item) {
		List<String> phoneNums = new ArrayList<>();
		
		
		for (LibraryMember m: members) {
			Iterator<CheckoutRecordEntry> iter = m.getCheckoutRecord().getCheckoutEntryList().iterator();
			
			while( iter.hasNext()) {
				if (iter.next().getItem().equals(item)) {
					phoneNums.add(m.getPhone());
				}
				
			}
			
		}
		
		if (phoneNums.size()>1)		Collections.sort(phoneNums);
		
		return phoneNums;
	}
	
	

}