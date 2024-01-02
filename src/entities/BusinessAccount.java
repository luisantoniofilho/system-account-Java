package entities;
//Extends functions of Account to BusinessAccount
public class BusinessAccount extends Account {

	private Double loanLimit;
	
	public BusinessAccount() {
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		//Constructor of class account
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan(double amount) {
		if (amount<= loanLimit) {
			balance += amount- 10.00;
		}
	}
	
	@Override //Indicates the subscription of the super class method
	public void withdraw(double amount) {
		super.withdraw(amount);
		balance-=2;
	}

}