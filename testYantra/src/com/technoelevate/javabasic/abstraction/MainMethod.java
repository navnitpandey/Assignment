package com.technoelevate.javabasic.abstraction;

import java.util.*;

public class MainMethod {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Factory class1=new Factory(); 
		System.out.println("selece the browser from given option");
		System.out.println("1.chrome\n2.safari\n3.Mozila\n4.Opera\n");
		System.out.println("plz enter your selection");
		int ch = sc.nextInt();
		Browser browser = null;
		switch (ch) {
		case 1:
			browser = new Chrome();
			browser.start();
			break;

		case 2:
			browser = new Safari();
			browser.start();
			break;
		case 3:
			browser = new Mozila();
			browser.start();
			break;
		case 4:
			browser = new Opera();
			browser.start();
			break;
		}
	}

}
