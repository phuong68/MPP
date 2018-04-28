package _Std2017Mar2;

public class CheckingAccount extends Account {
	String accId;
	double balance;
	double monthlyfee;
	
	
	String getAccountID() {
		// TODO Auto-generated method stub
		return accId;
	}

	double getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}

	
	double updateComputedBalance() {
		// TODO Auto-generated method stub
		return balance - monthlyfee;
	}

	public CheckingAccount(String accId, double balance, double monthlyfee) {
		super();
		this.accId = accId;
		this.balance = balance;
		this.monthlyfee = monthlyfee;
	}
	
	

}
