package cmo.technoelevate.javabasic.multithredingddemo;

public class Mythread2 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("second theread");
		}
	}
	

}
