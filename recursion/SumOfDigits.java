package com.codegnan.recursion;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=scanner.nextInt();
		int result=sumDigits(num);
		System.out.println("Sum Of Digits in"+num+"is"+result);
		scanner.close();
		
	}
	public static int sumDigits(int num) {
		if(num==0) {
			return 0;
		}
		return(num%10)+sumDigits(num/10);
	}
	
}
		
		

	


