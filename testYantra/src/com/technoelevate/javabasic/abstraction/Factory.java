package com.technoelevate.javabasic.abstraction;

public class Factory {
	Browser browser=null;
		
		public Browser getBrowser(String name) {
			if(name.equalsIgnoreCase("Chrome")) {
				browser =new Chrome();
			}else if (name.equalsIgnoreCase("Safari")) {
				browser =new Safari();
			}else if (name.equalsIgnoreCase("Mozila")){
				browser =new Mozila();
			}else {
				browser =new Opera();
			}return browser;
		}
		
		
	}
