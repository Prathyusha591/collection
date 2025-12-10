package com.codegnan.recursion;

import java.util.Scanner;

public class LeapYearChecker {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a Year:");
		int Year=scanner.nextInt();
		scanner.close();
		if(isLeapYear(Year)) {
			System.out.println(Year+"is not a leap year.");
		}else {
			System.out.println(Year+"is not a leap year.");
		}
		
	}
	public static boolean isLeapYear(int Year) {
		return(Year%4==0 && Year%100!=0)||(Year%400==0);
	}

}
			
		

	


