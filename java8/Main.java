package com.codegnan.java8;

interface interf1 {
	public int Square(int a);
}

public class Main {
   public static void main(String[] args) {
       interf1 i=a->a*a;
       System.out.println(i.Square(5));
   }
}


