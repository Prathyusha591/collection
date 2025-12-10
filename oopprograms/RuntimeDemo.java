package com.codegnan.oopprograms;

import java.util.Date;

public class RuntimeDemo {

	public static void main(String[] args) {
		Runtime runtime=Runtime.getRuntime();
		System.out.println("Total Memory in heap :"+ runtime.totalMemory());
		System.out.println("Free Memory in heap:"+runtime.freeMemory());
		
		for(int i=0;i<1000000;i++) {
			Date d=new Date();
			d=null;
		}
		System.out.println("Free Memory in heap:"+runtime.freeMemory());
		runtime.gc();
		System.out.println("Free Memory in heap:"+runtime.freeMemory());
		
		}
		
}

	


