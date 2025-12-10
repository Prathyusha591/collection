package com.codegnan.java8;

public class Test_02 {
	
	
		public static void main(String[] args) {
	        Thread t=new Thread(()-> {
	        	for(int i=0;i<10;i++) {
	        		System.out.println("site thread");
	        	}
	        });
	            t.start();
	            for(int i=0;i<10;i++) {
	            	System.out.println("main tjread");
	        		
				
			}
 
	}
}
