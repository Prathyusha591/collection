package com.codegnan.recursion;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=scanner.nextInt();
        scanner.close();
        if(isPalindrome(num)) {
        	System.out.println(num+"is a Palindrome.");
        }else {
        	System.out.println(num+"is not a palindrome.");
        }
        
	}
	public static boolean isPalindrome(int num) {
		int reversedNum=0;
		int originalNum=num;
		while(num!=0) {
			int remainder=num%10;
			reversedNum=reversedNum*10+remainder;
			num/=10;
		}
		return originalNum==reversedNum;
	}
	
}
        
        
        
        	
        

