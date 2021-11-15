package com.technoelevate.javabasic.exceptionhandling;

public class BankAccount {
	double balance;

	public BankAccount(double balance) {
		super();
		this.balance = balance;
	}
	public void withdraw(double amount) throws InSufficientBalance{
		if(amount<=balance) {
			System.out.println("s withdraw");
			System.out.println("Balance="+(balance-amount));
			
		}else {
			throw new InSufficientBalance("The amount exceeds");
		}
	}
	

}
