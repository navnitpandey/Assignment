package com.technoelevate.javabasic.objclass;

public class Mobile {
	String name;
	double price;
	int ram;
	public Mobile(String name, double price, int ram) {
		super();
		this.name = name;
		this.price = price;
		this.ram = ram;
	}
	@Override
	public String toString() {
		return "Mobile [name=" + name + ", price=" + price + ", ram=" + ram + "]";
	}
	
	@Override
	public int hashCode() {
		return this.ram;
	}
	@Override
	public boolean equals(Object obj) {
		Mobile mobile=(Mobile)obj;
		return(this.name.contentEquals(mobile.name));
//	&& this.price==m.price &&
//			this.ram==m.ram;
	}

}
