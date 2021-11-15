package cmo.technoelevate.javabasic.multithredingdemo.sleepyeild;

public class MainThread {
	public static void main(String[] args) throws InterruptedException {
		FirstThread firstThread=new FirstThread();
		
		SecondThread secondThread=new SecondThread();
		Thread thread=new Thread(secondThread);
		
		firstThread.start();
		thread.join();
		thread.yield();
		thread.start();
		//thread.sleep(2000);
	}

}
