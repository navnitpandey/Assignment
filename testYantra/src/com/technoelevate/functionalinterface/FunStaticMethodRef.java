package com.technoelevate.functionalinterface;

public class FunStaticMethodRef {
	public static void name() {
		System.out.println("s method is normal class");
		
	}
	public static void name2() {
		System.out.println("2nd static method");
		
	}
	public static void main(String[] args) {
		FunIntrface funIntrface=FunStaticMethodRef::name;
		funIntrface.display();
		
		FunIntrface funIntrface1=FunStaticMethodRef::name2;
		funIntrface1.display();
	}

}
