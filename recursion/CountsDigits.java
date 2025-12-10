package com.codegnan.recursion;

import java.util.Scanner;

public class CountsDigits {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=scanner.nextInt();
		int result=countDigits(num);
		System.out.println("Number Of Digits in"+ num + "is" + result);
		scanner.close();
		
	}
	public static int countDigits(int n) {
		if(n==0) {
			return 0;
		}
		return 1+countDigits(n/10);
	}

}

	


