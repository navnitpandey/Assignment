package com.technoelevate.musicplayer;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Multiplayers {
	public static void main(String[] args) {
		ArrayList arrayList=new ArrayList();
		arrayList.add("jai mahakal");
		arrayList.add("jai mata di");
		arrayList.add("jai shiv");
		
		Scanner sc=new Scanner(System.in);
		
		while (true) {
			System.out.println("1: Play song\n2: Search song\n3: Operate on multiplayer\n4: Exit");
			int n=sc.nextInt();
			
			switch (n) {
			case 1:System.out.println("1: play all song\n2: Paly randome song\n3: Play particular song");
				
				break;

			default:
				break;
			}
			

		}

	}
}
