package com.technoelevate.javabasic.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class DemoHash1 {
	public static void main(String[] args) {
		HashSet<Integer> hs=new HashSet<Integer>();
		for (int i = 1; i < 10; i++) {
			hs.add(i);
		}
		hs.add(34);
		hs.add(35);
		Iterator<Integer> it=hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
		
	}

}
