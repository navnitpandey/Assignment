package cmo.technoelevate.javabasic.multithredingdemo.synchronization;

public class Account {
	int balance;

	public Account(int balance) {
		super();
		this.balance = balance;
	}
	public void withdraw(int amount) {
		if (amount>balance) {
			System.out.println("Insufficient balance");
			return;
		}
		balance-=amount;
		System.out.println("withdraw successful");
		System.out.println("Balance="+balance);
	}
	public synchronized void deposite(int amount) {
		int temp=balance;
		temp+=amount;
		balance=temp;
		System.out.println("deposite successful");
		System.out.println("Avalible balance="+balance);
	}
	public void checkBalance() {
		System.out.println("Avalible balance="+balance);
		
	}

}
