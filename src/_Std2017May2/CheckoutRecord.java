package _Std2017May2;

import java.util.ArrayList;
import java.util.List;

public class CheckoutRecord {
	List<CheckoutRecordEntry> cores = new ArrayList<CheckoutRecordEntry>();

	public List<CheckoutRecordEntry> getCheckoutEntryList() {
		return cores;
	}
	
	public void addCheckoutRecordEntry(CheckoutRecordEntry core) {
		cores.add(core) ;
	}
	
	
}
