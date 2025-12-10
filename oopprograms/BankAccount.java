package com.codegnan.oopprograms;

public class BankAccount {
	// instance variables
	String accountHolder;
	long accountNumber;
	double balance;
	
	// methods to initialize account details
	public void createAccount(String name,long accNumber,double initialBalance) {
		accountHolder=name;
		accountNumber=accNumber;
		balance=initialBalance;
		}
	public void deposit(double amount) {
		balance+=amount;
		System.out.println(amount+"deposite Successfully.");
	}
	
	public void withdraw(double amount) {
		if (amount <= balance) {
	balance -= amount;
	System.out.println(amount + "Withdrawn Successfully");
		}else {
			System.out.println("in sufficient funds");
			}
	}
    public void displayAccountDetails() {
    	System.out.println("Account Holder:"+accountHolder);
    	System.out.println("Account Number:"+accountNumber);
	}

}
