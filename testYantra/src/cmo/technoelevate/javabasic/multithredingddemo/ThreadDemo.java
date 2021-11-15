package cmo.technoelevate.javabasic.multithredingddemo;

public class ThreadDemo implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			System.out.println("My 1st thread");
			
		}
	}

}
