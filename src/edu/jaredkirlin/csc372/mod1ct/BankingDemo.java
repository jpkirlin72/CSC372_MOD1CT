package edu.jaredkirlin.csc372.mod1ct;

public class BankingDemo {
	
	public static void main(String[] args) {


    // test 1: simple account using constructor
    BankAccount account = new BankAccount("Harry", "Potter", 1000000001, 200.0);
    account.withdrawal(50.0);
    account.accountSummary();

    System.out.println("-------------------------");
    System.out.println("-------------------------");
    System.out.println("-------------------------");
    System.out.println("-------------------------");

    // test 2: checking account with overdraft
    CheckingAccount chk = new CheckingAccount("Ron", "Weasley", 1000000002, 200.0, 0.04);
    chk.processWithdrawal(300.0);
    chk.displayAccount();
}
}