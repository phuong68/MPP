package _Std2017May2;

import java.time.LocalDate;

public class CheckoutRecordEntry {
	LocalDate checkoutDate;
	LocalDate dueDate;
	ItemType type;
	LendingItem lendingItem;
	public CheckoutRecordEntry(LendingItem lendingItem, LocalDate checkoutDate, LocalDate dueDate, ItemType type) {
		super();
		this.checkoutDate = checkoutDate;
		this.dueDate = dueDate;
		this.type = type;
		this.lendingItem = lendingItem;
	}
	
	
}
