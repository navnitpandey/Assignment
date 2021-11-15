package cmo.technoelevate.javabasic.multithredingddemo;

public class MyThreadMainClass {
	public static void main(String[] args) {
		
		
		MyThread thread=new MyThread();
		thread.start();
		Mythread2 th=new Mythread2();
		th.start();
	for (int i = 0; i < 5; i++) {
			System.out.println("main thread ");
			
		}
	}

}
