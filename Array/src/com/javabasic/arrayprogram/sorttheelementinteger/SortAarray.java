package com.javabasic.arrayprogram.sorttheelementinteger;

import java.util.Arrays;

public class SortAarray {
	public static void main(String[] args) {
		int arr[]= {10,90,45,80,20,0};
		Arrays.sort(arr);
	//	System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
