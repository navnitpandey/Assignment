package com.technoelevate.functionalinterface;

public class NonStaticMethod {
	public void name() {
		System.out.println("non static ");
		
	}
	public static void name2() {
		System.out.println("static method is normal cls");
		
	}
	public static void main(String[] args) {
		FunIntrface funIntrface=NonStaticMethod::name2;
		funIntrface.display();
		
		NonStaticMethod nonStaticMethod=new NonStaticMethod();
		FunIntrface funInterface=nonStaticMethod::name;
		funInterface.display();
	}
}
