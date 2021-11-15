package com.technoelevate.javabasic.synchrnization;

public class Accounts {

	private int balance = 5000;

	public int getBalance() {
		return balance;
	}

	public void withdraw(int amount) {
		balance = balance - amount;
	}
}
