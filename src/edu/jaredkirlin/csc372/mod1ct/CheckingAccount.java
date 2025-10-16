package edu.jaredkirlin.csc372.mod1ct;

public class CheckingAccount extends BankAccount {
	 
	private double interestRate;
	
//process withdrawal	 
	public void processWithdrawal(double amount) {
		withdrawal(amount);
		if (getBalance() < 0 );
			withdrawal(30.0);
			System.out.println("Overdraft! $30 has been charged to your account.");
			System.out.println("New balance: $" + getBalance());	    	
	    }
	
//display account with interest rate added	
	public void displayAccount() {
		accountSummary();
		System.out.println("Interest Rate: " + interestRate);
		}
	
//get and set interest rate (not sure if we were supposed to just set a base interest rate for all checking accounts)	
	public void setInterestRate(double rate) {
		interestRate = rate;
	}
	public double getInterestRate() {
		return interestRate;
	}
	
}
