package Lesson4_ProbE;

public abstract class Account {
	
	public Account(){
		
	}
	
	abstract public String getAcctID();
	
	abstract public double getBalance();
	
	abstract public double computeUpdatedBalance();
}
