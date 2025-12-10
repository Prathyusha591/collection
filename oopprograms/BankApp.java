package com.codegnan.oopprograms;

public class BankApp {

	public static void main(String[] args) {
        BankAccount acc1 = new BankAccount();
        acc1.createAccount("malli",19415473,50000);
        acc1.deposit(30000);
        acc1.displayAccountDetails();
        acc1.withdraw(100000);
        acc1.displayAccountDetails();
        
        BankAccount acc2=new BankAccount();
        acc2.createAccount("pathu",45367896,50000);
        acc2.deposit(2000);
        acc2.displayAccountDetails();
	}
}
        



	


    