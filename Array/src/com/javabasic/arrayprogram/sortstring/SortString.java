package com.javabasic.arrayprogram.sortstring;

import java.util.Arrays;

public class SortString {
	public static void main(String[] args) {
		String s[]= {"z","b","h","x","t"};
		//		int k=s.length;
		//		for (int i = 0; i < s.length-1; i++) {
		//			for (int j = i+1; j < s.length; j++) {
		//				if (s[i].compareTo(s[j])>0) {
		//					String temp=s[i];
		//					s[i]=s[j];
		//					s[j]=temp;
		//				}
		//			}
		//		}
		//		System.out.println(Arrays.toString(s));
		Arrays.sort(s);
		System.out.println(Arrays.toString(s));
	}
}
