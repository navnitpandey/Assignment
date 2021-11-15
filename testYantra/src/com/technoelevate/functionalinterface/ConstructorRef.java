package com.technoelevate.functionalinterface;

public class ConstructorRef {
	public ConstructorRef() {
		System.out.println("constructor ref from nrml cls");
	}
	public static void main(String[] args) {
		FunInterface funIntrface = ConstructorRef::new;
		funIntrface.display();
	}

}
