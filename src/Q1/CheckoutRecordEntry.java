package Q1;

import java.time.LocalDate;

public class CheckoutRecordEntry {
	private LocalDate checkoutDate;
	private LocalDate dueDate;
	private ItemType type;
	private LendingItem item;
	public LocalDate getCheckoutDate() {
		return checkoutDate;
	}
	public LocalDate getDueDate() {
		return dueDate;
	}
	public ItemType getType() {
		return type;
	}
	public LendingItem getItem() {
		return item;
	}
	
	public CheckoutRecordEntry( LendingItem item, LocalDate checkoutDate, LocalDate dueDate, ItemType type) {
		super();
		this.checkoutDate = checkoutDate;
		this.dueDate = dueDate;
		this.type = type;
		this.item = item;
	}
	
	
	
}
