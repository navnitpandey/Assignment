package cmo.technoelevate.javabasic.multithredingddemo;

public class ThreadDemoMain {
	public static void main(String[] args) {
		
		Thread.currentThread().setPriority(9);
		//System.out.println(Mythread2.currentThread().getName());
		System.out.println("Main thread Priority "+Mythread2.currentThread().getPriority());
		
		ThreadDemo th=new ThreadDemo();
		Thread th2=new Thread(th);
		th2.setPriority(9);
		th2.setName("nvt");
		System.out.println("my thread priorty");
		
		System.out.println(th2.getPriority());
		System.out.println(th2.getName());
		th2.start();
		
//		for (int i = 0; i < 5; i++) {
//			System.out.println("main thread");
			
		}
	}

//}
