package com.technoelevate.javabasic.hasarelationship;

public class Engine {
	String name;
	String yearOfManfacture;
	String engineNum;
	String type;
	public Engine(String name, String yearOfManfacture, String engineNum, String type) {
		super();
		this.name = name;
		this.yearOfManfacture = yearOfManfacture;
		this.engineNum = engineNum;
		this.type = type;
	}
	@Override
	public String toString() {
		return "Engine [name=" + name + ", yearOfManfacture=" + yearOfManfacture + ", engineNum=" + engineNum
				+ ", type=" + type + "]";
	}
	
	
	
	

}
