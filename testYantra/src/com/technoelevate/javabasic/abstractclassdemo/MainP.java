package com.technoelevate.javabasic.abstractclassdemo;

public class MainP {
	public static void main(String[] args) {
		Parent p=new Child();//upcasting
		p.name="nvt";
		System.out.println(p.name);
		
		
		Child c=(Child)p;
		c.id=101;
		c.name="san";
		System.out.println(c.id);
		System.out.println(c.name);
	}

}
