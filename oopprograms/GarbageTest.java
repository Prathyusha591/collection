package com.codegnan.oopprograms;

public class GarbageTest {
		public void finalize() {
		System.out.println("garbage collector calls finalize method.");
	}
	 
	public static void main(String[] args) {
		GarbageTest obj=new GarbageTest();
		obj=null;//eligible for gc.
		System.out.println("Requesting garbage collection");
		System.gc();
		System.out.println("end of main method");

	}

}
