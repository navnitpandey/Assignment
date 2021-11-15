package com.technoelevate.javabasic.typecastingdemo;

public class MainMethod {
	public static void main(String[] args) {
		//ParentClass class1=new ParentClass();
		//ChildClass ChildClass=new ChildClass();
		ParentClass class1 = new ChildClass();
		class1.ParentMethod();
		System.out.println(class1.num);
		
		ChildClass class2=(ChildClass) class1;
		class2.ChildMethod();
		System.out.println(class2.f);
		
	}

}
