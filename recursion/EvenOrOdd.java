package com.codegnan.recursion;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=scanner.nextInt();
		if(isEven(num)) {
			System.out.println(num+"is even.");
		}else {
			System.out.println(num+"is odd.");
		}
		scanner.close();
	}
	public static boolean isEven(int n) {
		return n%2==0;
	}
	
}
			
		

	


