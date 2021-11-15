package com.technoelevate.javabasic.interfacedemo;

public class MainMethod {
	public static  void main(String[]args) {
		ImplimentationClass ImplimentationClass=new ImplimentationClass();
		ImplimentationClass.childMethod();
		ImplimentationClass.parentMethod();
		ImplimentationClass.grandChildMethod();
		System.out.println(ParentInterface.i);
		System.out.println(ChildInterface.num);
		System.out.println(GrandChildInterface.i);
		System.out.println(GrandChildInterface.f);
		System.out.println(GrandChildInterface.num);
		
	}

}
