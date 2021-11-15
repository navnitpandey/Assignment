package com.technoelevate.javabasic.exceptionhandling;

public class ExceptionDemo2 {
	int z;

	public static void main(String[] args) {
		ExceptionDemo2 a=new ExceptionDemo2();
		int x=10;
		int y=0;
		
		try {
			a.z=x/y;
		}catch(ArithmeticException e) {
			System.out.println("this is arithmetic exception");
			System.out.println(a.z);
		}
	}

}
