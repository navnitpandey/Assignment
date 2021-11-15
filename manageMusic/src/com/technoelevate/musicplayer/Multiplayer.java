package com.technoelevate.musicplayer;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Multiplayer {
	
	public static void main(String[] args) throws InterruptedException {
		ArrayList list=new ArrayList();
		list.add("Song 1 is Playing....");
		list.add("Song 2 is Playing....");
		list.add("Song 3 is Playing....");
		list.add("Song 4 is Playing....");
		list.add("Song 5 is Playing....");
		
		Scanner sc=new Scanner(System.in);
		
		String nString;
		while (true) {	
			System.out.println("welcome to MusicHub\n\n -:what you want:-\n\n1: Play a song \n2: Search for song \n3: Operate MusicHub\n4: Exit\n\n");
			int n=sc.nextInt();
		
		switch (n) {
		case 1:
			System.out.println("Welcome \n1: play all song \n2:Play particular song\n3: Play randome song\n4: Exit to play song");
				n=sc.nextInt();
			
			switch (n) {
			case 1:
				//System.out.println(list);
				for (Object object : list) {
					System.out.println(object);
					for (int i = 0; i < list.size(); i++) {
						//String s="Song is playing.....";
						Thread.sleep(100);
					}
				}
				break;
			case 2:
				//System.out.println("particular song will be playing ");
				int a=sc.nextInt();
				System.out.println(list.get(a-1));
				break;
			case 3:
				//System.out.println("randome song will be playing");
				double d=Math.random();
				int random=(int)(d*5);
				System.out.println(list.get(random));
				break;
			case 4:
				System.out.println("Exit");
				break;
			default:
				nString="please entr valid num";
				break;
			}
			break;
		case 2:
			//nString="Search for song";
			System.out.println("Search in Collection");
			break;
		case 3:
			//nString="Operate MusicHub";
			System.out.println("Operate on Music Hub");
			break;
		case 4:
			System.out.println("Exit");
			break;

		default:
			nString="Please enter valid Num\n\n Thank You";
			break;
		}
	}

}
}
