package cmo.technoelevate.javabasic.multithredingdemo.synchronization;

public class Wife extends Thread {
	Account acc;

	public Wife(Account acc) {
		super();
		this.acc = acc;
	}

	@Override
	public void run() {
		Thread.currentThread().setName("Wife thread");
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
