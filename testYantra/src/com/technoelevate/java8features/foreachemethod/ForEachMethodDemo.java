package com.technoelevate.java8features.foreachemethod;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ForEachMethodDemo {
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add("mango");
		list.add("apple");
		list.add("ker");
		list.add("adhdfh");
		for (Object object : list) {
			System.out.println(object);
			
		}
		list.forEach(l->{System.out.println(l+" fruits");});
	}

}
