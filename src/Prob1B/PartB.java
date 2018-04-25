package Prob1B;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


//The lambda:   (CheckoutRecord record) -> record.getCheckoutEntries()
public class PartB {
	//provide a functional interface type for the lambda
	Function<CheckoutRecord, List<CheckoutRecordEntry>> func1= cor -> cor.getCheckoutEntries();
	
	//provide a method reference and the type of method reference
	//TYPE: class::instanceMethod
	Function<CheckoutRecord, List<CheckoutRecordEntry>> func2= CheckoutRecord::getCheckoutEntries;
	
	
	// provide inner static class that behaves the same way as the lambda
	Function<CheckoutRecord, List<CheckoutRecordEntry>> func3= cor -> new MyCheckoutRecord().apply(cor);
	
	public static class MyCheckoutRecord implements Function<CheckoutRecord, List<CheckoutRecordEntry>>{

		@Override
		public List<CheckoutRecordEntry> apply(CheckoutRecord t) {
			return t.getCheckoutEntries();
			
		}
		
	}

	
	
	public void evaluator() 
	{
		System.out.println("Use lambda here");
		func1.apply(record);
		for (CheckoutRecordEntry core: func1.apply(record)) {
			System.out.println(core.toString());
		}
		
		System.out.println("Use method reference here");
		//func2.apply(record);
		for (CheckoutRecordEntry core: func2.apply(record)) {
			System.out.println(core.toString());
		}
		
		System.out.println("Use static class here");
		//func3.apply(record);
		for (CheckoutRecordEntry core: func3.apply(record)) {
			System.out.println(core.toString());
		}
	}
	
	
	@SuppressWarnings("serial")
	public static void main(String[] args) {
		List<Book> allBooks = new ArrayList<Book>() {
			{
				add(new Book("28-12331", "Antartica", 2, 7));
				add(new Book("99-22223", "Thinking Java", 1, 21));
				add(new Book("48-56882", "Jimmy's First Day of School", 1, 7));
				
			}
		};
	
		List<CheckoutRecordEntry> allEntries = new ArrayList<CheckoutRecordEntry>() {
			{
				add(new CheckoutRecordEntry(
					allBooks.get(0).getCopies().get(0), LocalDate.of(2011,12,1), LocalDate.of(2011,12,22)));
				add(new CheckoutRecordEntry(
					allBooks.get(0).getCopies().get(1), LocalDate.of(2014,6,22), LocalDate.of(2014,7,13)));
				add(new CheckoutRecordEntry(
						allBooks.get(1).getCopies().get(0), LocalDate.of(2015,12,2), LocalDate.of(2015,12,23)));
				add(new CheckoutRecordEntry(
						allBooks.get(2).getCopies().get(0), LocalDate.of(2015,6,24), LocalDate.of(2015,7,15)));
			}
		};
		record = new CheckoutRecord();
		record.addEntry(allEntries.get(0));
		record.addEntry(allEntries.get(1));
		record.addEntry(allEntries.get(2));
		
		PartB pa = new PartB();
		pa.evaluator();
	}
	private static CheckoutRecord record;
}
