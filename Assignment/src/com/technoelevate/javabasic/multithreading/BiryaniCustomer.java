package com.technoelevate.javabasic.multithreading;

public class BiryaniCustomer extends Thread {
	Home home;
	int quantityProduct;

	public BiryaniCustomer(Home home, int quantityProduct) {
		super();
		this.home = home;
		this.quantityProduct = quantityProduct;
	}

	@Override
	public void run() {
		home.purchase(quantityProduct);
	}

}
