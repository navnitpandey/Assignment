package com.javabasic.multithreding.waitsleepdemo;

public class Customer extends Thread {
	Godown godown;
	int noOfItems;
	public Customer(Godown godown, int noOfItems) {
		super();
		this.godown = godown;
		this.noOfItems = noOfItems;
	}
	public void run() {
		godown.purchase(noOfItems);
		
	}

}
