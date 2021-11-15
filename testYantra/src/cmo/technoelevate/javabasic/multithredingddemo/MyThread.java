package cmo.technoelevate.javabasic.multithredingddemo;

public class MyThread extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 2; i++) {
			System.out.println("My thread cls run main method");
			
		}
	}

}
