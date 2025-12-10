package com.codegnan.oopprograms;

public class MethodDemo {

	public static void main(String[] args) {
         MethodTypes int1=new MethodTypes();
         int1.method1();
         System.out.println(int1.method2(5,3));
         int1.method3("Greetings");
         System.out.println(int1.method4());
         
         MethodTypes int2=new MethodTypes();
         int2.method5();
         System.out.println(int2.method6(8,2));
         int2.method7("Static message");
         System.out.println(int2.method8());
	
     }

}