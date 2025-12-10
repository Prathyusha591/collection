package com.codegnan.foundation;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
        System.out.println("Enter principle amount: ");
        double principle=scanner.nextDouble();
        System.out.println("Enter Rate of Interest");
        double rate = scanner.nextDouble();
        System.out.println("Enter time");
        double t = scanner.nextDouble();
        double simpleIntrest = (principle *t* rate)/100;
        double totalAmount = principle + simpleIntrest;
        System.out.println("simple Intrest : " + simpleIntrest);
        System.out.println("Total amount : " + totalAmount);
        scanner.close();
     
	}

}