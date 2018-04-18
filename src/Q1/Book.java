package Q1;

public class Book extends LendingItem{
	private String isbn;
	private String tittle;
	private String authorFirstName;
	private String authorLastName;
	public Book(String isbn, String tittle, String authorFirstName, String authorLastName) {
		super();
		this.isbn = isbn;
		this.tittle = tittle;
		this.authorFirstName = authorFirstName;
		this.authorLastName = authorLastName;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (obj ==null)  return false;
		if (this.getClass() != obj.getClass()) return false;
		
		Book item = (Book) obj;
		
		return this.isbn==item.isbn && this.tittle==item.tittle && this.authorFirstName == item.authorFirstName && this.authorLastName == item.authorLastName ;
	}
	
	
}
