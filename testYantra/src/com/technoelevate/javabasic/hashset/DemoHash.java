package com.technoelevate.javabasic.hashset;
import java.awt.List;
import java.util.HashSet;
public class DemoHash {
	public static void main(String[] args) {
		HashSet <String> set=new HashSet<String>();
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("four");
		set.add("five");
		set.add("one");
		set.add("two");
		System.out.println("HashSet :"+ set);
		System.out.println(set.size());
		
	}

}
