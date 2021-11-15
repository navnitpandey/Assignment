package com.javabasic.arrayprogram.addelement;

public class SingerMain {
	public static void main(String[] args) {
		Singer singer=new Singer() {
			
			@Override
			public void name() {
				// TODO Auto-generated method stub
				System.out.println("nvt");
			}
			
			@Override
			public int age() {
				// TODO Auto-generated method stub
				
				return 34;
			}
		};
		singer.name();
		System.out.println(singer.age());
	}
	


}
