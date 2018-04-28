package _Std2017May2;

public class Book extends LendingItem{
	String isbn;
	String tittle;
	String authorFirstName;
	String authorLastName;
	public Book(String isbn, String tittle, String authorFirstName, String authorLastName) {
		super();
		this.isbn = isbn;
		this.tittle = tittle;
		this.authorFirstName = authorFirstName;
		this.authorLastName = authorLastName;
	}
	
}
