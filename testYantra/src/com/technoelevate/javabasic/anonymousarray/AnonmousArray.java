package com.technoelevate.javabasic.anonymousarray;

public class AnonmousArray {
	public static void main(String[] args) {
		//new int[]{10,20,30};
		//new int[][]({10,20,30},{40,50})
		sum(new int[]{10,20,30});
	}
	static void sum(int[]no) {
		int total=0;
	//	System.out.println(no.length);
		for(int i:no) {
			
			total=total+i;
		}
		System.out.println("Sum is :"+total);
	}

}








