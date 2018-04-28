package _Std2017May2;

public class LibraryMember {
	String memberId;
	String lastname;
	String firstname;
	String phone;
	CheckoutRecord cor; 
	
	public CheckoutRecord getCheckoutRecord() {
		return cor;
	}

	public void setCheckoutRecord(CheckoutRecord cor) {
		this.cor = cor;
	}

	public String getMemberId() {
		return memberId;
	}

	public String getLastname() {
		return lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getPhone() {
		return phone;
	}

	public LibraryMember(String memberId, String firstname, String lastname,String phone) {
		super();
		this.memberId = memberId;
		this.lastname = lastname;
		this.firstname = firstname;
		this.phone = phone;
	}
	
}
