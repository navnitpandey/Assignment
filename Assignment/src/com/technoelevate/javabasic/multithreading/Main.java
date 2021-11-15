package com.technoelevate.javabasic.multithreading;

	public class Main {
		public static void main(String[] args) {
			Krishna krishna = new Krishna();
			krishna.start();
			Azesha azesha = new Azesha();
			azesha.start();
			Manisha manisha = new Manisha();
			manisha.start();
		}

}
