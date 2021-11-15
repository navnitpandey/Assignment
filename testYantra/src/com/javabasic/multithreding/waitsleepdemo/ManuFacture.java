package com.javabasic.multithreding.waitsleepdemo;

public class ManuFacture extends Thread {
	Godown godown;
	int noOfItems;
	public ManuFacture(Godown godown, int noOfItems) {
		super();
		this.godown = godown;
		this.noOfItems = noOfItems;
	}
	public void run() {
		godown.store(noOfItems);
	}

}
