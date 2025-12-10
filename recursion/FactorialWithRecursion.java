package com.codegnan.recursion;

import java.util.Scanner;

public class FactorialWithRecursion {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = scanner.nextInt();
		int result=factorial(num);
		System.out.println("Factorial of " + num + " is " + result);
		scanner.close();
	}
	
	public static int factorial(int num) {
		if (num == 0 || num == 1) {
			    return 1;
		}
		return num*factorial(num-1);
		}
	
}
				

	


