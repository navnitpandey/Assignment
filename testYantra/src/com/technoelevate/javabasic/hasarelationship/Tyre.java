package com.technoelevate.javabasic.hasarelationship;

public class Tyre {
	String name;
	String type;
	float size;
	double price;
	public Tyre(String name, String type, float size, double price) {
		super();
		this.name = name;
		this.type = type;
		this.size = size;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Tyre [name=" + name + ", type=" + type + ", size=" + size + ", price=" + price + "]";
	}
	

}
