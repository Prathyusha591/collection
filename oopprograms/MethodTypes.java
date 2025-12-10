package com.codegnan.oopprograms;

public class MethodTypes {
     double InstanceMethod;
     double StaticMethods;
     
     
     public void  method1() {
    	 System.out.println("Instance method without return and parameters");
     }
     public int method2(int a,int b) {
    	 System.out.println("Instance method with return and parameters");
    	 return a+b;
     }
     public void method3(String text) {
    	 System.out.println("Instance method without return and with parameters:");
     }
     public String method4() {
    	 System.out.println("Instance method with return and without parameters:");
    	 return "Hello";
     }
     
     
     
     public static void method5() {
    	 System.out.println("Static method without return and parameters");
     }
     public static int method6(int a,int b) {
    	 System.out.println("Static method with return and parameters");
    	 return a+b;
     }
     public static void method7(String text) {
    	 System.out.println("Static method without return and with parameters:");
     }
     public static String method8() {
    	 System.out.println("Static method with return and without parameters:");
    	 return "hello from static";
     }
     }
     