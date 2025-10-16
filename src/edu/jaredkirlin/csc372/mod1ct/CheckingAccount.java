package edu.jaredkirlin.csc372.mod1ct;

public class CheckingAccount extends BankAccount {
	 
	private double interestRate;
	 
	public void processWithdrawal(double amount) {
		withdrawal(amount);
		if (getBalance() < 0 );
			withdrawal(30.0);
			System.out.println("Overdraft! $30 has been charged to your account.");
			System.out.println("New balance: $" + getBalance());	    	
	    }
	public void displayAccount() {
		accountSummary();
		System.out.println("Interest Rate: " + interestRate);
		}
	public void setInterestRate(double rate) {
		interestRate = rate;
	}
	public double getInterestRate() {
		return interestRate;
	}
	
}
