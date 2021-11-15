/*
package com.technoelevate.javabasicarrays;

public class Arrays {
	public static void main(String[] args) {
		int[] arr= new int[3];
		byte b=10;
		short s=12;
		char c='a';
		arr[0]=b;
		arr[1]=s;
		arr[2]=c;
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
	}

}
*/
public class Arrays {
	public static void main(String[] args) {
		int arr[]= {32,45,34,67,12,82};
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				}
			}
		for(int i=0;i<arr.length-1;i++) {
			System.out.println(arr[i]);
		}
		}
		
	}	
	



