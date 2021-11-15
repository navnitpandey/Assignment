package com.technoelevate.lambdaexp;

public class RunnableUsingLambdaExp {
	public static void main(String[] args) {
		Runnable runnable=()->{
			System.out.println("my thread");
			for (int i = 0; i < 10; i++) {
				try {
					Thread.sleep(1000);
					System.out.println("run method");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		};
		Thread thread=new Thread(runnable);
		thread.start();
	}

}
