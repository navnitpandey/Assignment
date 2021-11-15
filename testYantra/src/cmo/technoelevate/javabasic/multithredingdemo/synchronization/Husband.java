package cmo.technoelevate.javabasic.multithredingdemo.synchronization;

public class Husband extends Thread {
	Account acc;

	public Husband(Account acc) {
		super();
		this.acc = acc;
	}

	@Override
	public void run() {
		Thread.currentThread().setName("Husband thread");
		System.out.println(Thread.currentThread().getName());
		acc.deposite(3000);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
