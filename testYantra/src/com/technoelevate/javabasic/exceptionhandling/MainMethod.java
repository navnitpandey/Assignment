package com.technoelevate.javabasic.exceptionhandling;

public class MainMethod {
	public static void main(String[] args) throws InSufficientBalance {
		BankAccount account=new BankAccount(5000);
		account.withdraw(2000);
	}

}
