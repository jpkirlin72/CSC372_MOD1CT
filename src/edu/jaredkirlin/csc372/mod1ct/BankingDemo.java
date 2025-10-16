package edu.jaredkirlin.csc372.mod1ct;

public class BankingDemo {
	
	//test 1: simple setters/getters

	public static void main(String[] args) {
		BankAccount account = new BankAccount();
		account.setFirstName("Harry");
		account.setLastName("Potter");
		account.setAccountID(1000000001);
		account.deposit(200);
		account.withdrawal(50);
		account.accountSummary();
		
		System.out.println("-------------------------");
		System.out.println("-------------------------");
		System.out.println("-------------------------");
		System.out.println("-------------------------");
	

	//test 2: checking account/overdraft
		CheckingAccount chk = new CheckingAccount();
		chk.setFirstName("Ron");
		chk.setLastName("Weasley");
		chk.setAccountID(1000000002);
		chk.setInterestRate(0.04);
		chk.deposit(200);
		chk.processWithdrawal(300);
		chk.displayAccount();
		
	}
		
}
