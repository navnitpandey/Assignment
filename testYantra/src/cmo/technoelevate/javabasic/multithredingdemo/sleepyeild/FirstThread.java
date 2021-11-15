package cmo.technoelevate.javabasic.multithredingdemo.sleepyeild;

public class FirstThread extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("1st thread");
		}
		
	}

}
