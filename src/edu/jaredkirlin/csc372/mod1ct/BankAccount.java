package edu.jaredkirlin.csc372.mod1ct;



public class BankAccount {
	private String firstName;
    private String lastName;
    private int accountID;
    private double balance;

//constructor    
    public BankAccount() {
        balance = 0.0;
    }
    
//deposit and withdrawal
    public void deposit(double amount) {
    	balance += amount;
    }
    public void withdrawal(double amount) {
    	balance -= amount;
    }
    
//setters
    public void setFirstName(String name) {
    	firstName = name;
    }
    public void setLastName(String name) {
    	lastName = name;
    }
    public void setAccountID(int id) {
    	accountID = id;
    }
    
//getters    
    public String getFirstName() {
    	return firstName;
    }
    public String getLastName() {
    	return lastName;
    }
    public int getAccountID() {
    	return accountID;
    }
    
//balance getter
    public double getBalance() {
    	return balance;
    }
    
//account summary
    public void accountSummary() {
    	System.out.println("Name: " + firstName + " " + lastName);
    	System.out.println("Account ID: " + accountID);
    	System.out.println("Balance: $" + balance);
    }
}
