package cmo.technoelevate.javabasic.multithredingdemo.sleepyeild;

public class SecondThread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 3; i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("2nd thread");
			
		}
	}
	

}
