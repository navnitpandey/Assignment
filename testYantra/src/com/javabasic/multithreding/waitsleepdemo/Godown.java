package com.javabasic.multithreding.waitsleepdemo;

public class Godown {
	int product;

	public Godown(int product) {
		super();
		this.product = product;
	}
	public synchronized void store(int noOFItems) {
		product+=noOFItems;
		System.out.println("store the product successfully\nAvalible product = "+product);
		//System.out.println("avalible product = "+product);
		this.notify();
	}
	public synchronized void purchase(int noOfItems) {
		while (noOfItems>product){
			System.out.println("out of stock");
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		product-=noOfItems;
		System.out.println("Purchase sucessfully\nAvalible product = "+product);
		
	}

}
