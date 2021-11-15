package com.technoelevate.javabasic.hasarelationship;

public class Vehicle {
	String name;
	String color;
	Engine engine;
	Tyre tyres;
	double price;
	public Vehicle(String name, String color, Engine engine2, Tyre tyres, double price) {
		super();
		this.name = name;
		this.color = color;
		this.engine = engine2;
		this.tyres = tyres;
		this.price = price;
	}
	public void status() {
		System.out.println(this.name+" "+this.color+" "+this.engine+" "+this.tyres+" "+this.price);
		System.out.println("vehicle is ready to go on roads");
	}
	
	

}
