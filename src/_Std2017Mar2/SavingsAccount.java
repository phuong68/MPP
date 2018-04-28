package _Std2017Mar2;

public class SavingsAccount extends Account {
	String accId;
	double balance;
	double interestRate;
	
	
	String getAccountID() {
		// TODO Auto-generated method stub
		return accId;
	}

	
	double getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}

	@Override
	double updateComputedBalance() {
		// TODO Auto-generated method stub
		return balance + (balance * interestRate);
	}


	public SavingsAccount(String accId, double balance, double interestRate) {
		super();
		this.accId = accId;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	
}
