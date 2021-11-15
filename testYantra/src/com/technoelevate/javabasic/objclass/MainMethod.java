package com.technoelevate.javabasic.objclass;

public class MainMethod {
	public static void main(String[] args) {
		Mobile mobile=new Mobile("samsung",680000.45,12);
		
		Mobile mobile1=new Mobile("samsung",1240000.65,12);
		System.out.println(mobile);
		System.out.println(mobile1);
		System.out.println(mobile.hashCode());
		System.out.println(mobile1.hashCode());
		System.out.println(mobile.equals(mobile1));
		
	}

	

	
}
