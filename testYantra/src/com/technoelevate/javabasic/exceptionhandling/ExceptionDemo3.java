package com.technoelevate.javabasic.exceptionhandling;

import java.io.IOException;

public class ExceptionDemo3 {
	public static void main(String[] args) {
		java.io.File file=new java.io.File("F://nvtFile.text");
		try {
			file.createNewFile();
			System.out.println("file created");
		} catch (IOException e) {
			System.out.println("unable to create a file");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
