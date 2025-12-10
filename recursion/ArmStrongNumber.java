package com.codegnan.recursion;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int number=scanner.nextInt();
		scanner.close();
		if(isArmstrong(number)) {
			System.out.println(number+"is an ArmStrong number.");
		}else {
			System.out.println(number+"is not an ArmStrong");
		}
		
	}
	public static boolean isArmstrong(int number) {
		int originalNumber=number;
		int sum=0; int numberOfDigits=String.valueOf(number).length();
		while(number>0) {
			int digits=number%10;
			sum+=Math.pow(digits,numberOfDigits);
			number/=10;
		}
		return sum==originalNumber;
	}
		}

	


