package Lesson4_ProbC;


public final class Paycheck {
	
	private final double grossPay;
	private final Employee emp;
	private final Tax fica;
	private final Tax state;
	private final Tax local;
	private final Tax medicare;
	private final Tax socialSecurity;
	
	public Paycheck(Employee emp, double grossPay, Tax fica, Tax state, 
			Tax local, Tax medicare, Tax socialSecurity) {
		this.emp = emp;
		this.grossPay = grossPay;
		this.fica = fica;
		this.state = state;
		this.local = local;
		this.medicare = medicare;
		this.socialSecurity = socialSecurity;
	}
	
	public void print() {
		System.out.println(this);
	}
	
	@Override
	public String toString() {
		return "Paystub for " + this.emp.getEmpId() + ": \n "
				+ " Gross Pay: " + String.format("$%.2f", grossPay) + "\n"
				+ "  Fica: " + String.format("%.0f%%", fica.getVal()*100)  + "\n" 
				+ "  State: " + String.format("%.0f%%", state.getVal()*100)  + "\n" 
				+ "  Local: " + String.format("%.0f%%", local.getVal()*100)  + "\n" 
				+ "  Medicare: " + String.format("%.0f%%", medicare.getVal()*100)  + "\n" 
				+ "  Social Security: " + String.format("%.1f%%", socialSecurity.getVal()*100)  + "\n" 
				+ "  NET PAY: " + String.format("$%.2f", getNetPay());
	}
	
	public double getNetPay() {
		return grossPay * (1 - fica.getVal()- state.getVal() - local.getVal()
				        -  medicare.getVal() -  socialSecurity.getVal());
	}
}
