package com.technoelevate.lambdaexp;

public class SingerMain {
	public static void main(String[] args) {
		Singer singer=(int i)->{
		System.out.println("nvt using lambda exp");
		return i;
			
		};
		singer.display(12);
	}
}
