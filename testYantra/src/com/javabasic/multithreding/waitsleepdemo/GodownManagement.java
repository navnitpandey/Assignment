package com.javabasic.multithreding.waitsleepdemo;

public class GodownManagement {
	public static void main(String[] args) {
		Godown godown=new Godown(100);
		new Customer(godown, 80).start();
		new Customer(godown, 50).start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		new ManuFacture(godown, 50).start();
	}

}
