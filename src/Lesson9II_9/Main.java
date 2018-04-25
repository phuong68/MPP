package Lesson9II_9;

import java.util.List;

public class Main {
	public static void main(String[] argv) {

		// set up
		Book book = new Book("test", 3);
		List<BookCopy> copies = book.getCopies();
		copies.forEach(copy -> copy.changeAvailability());

		// test
		System.out.println(book.isAvailable());
	}
}
