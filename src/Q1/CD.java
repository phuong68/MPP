package Q1;

public class CD extends LendingItem{
	private String productId;
	private String tittle;
	private String company;
	public CD(String productId, String tittle, String company) {
		super();
		this.productId = productId;
		this.tittle = tittle;
		this.company = company;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (obj ==null)  return false;
		if (this.getClass() != obj.getClass()) return false;
		
		CD item = (CD) obj;
		
		return this.productId==item.productId && this.tittle==item.tittle && this.company == item.company;
	}
	
}
