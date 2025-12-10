package com.codegnan.foundation;

import java.util.Scanner;

public class DiscountAmount {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Discount Amount");
		int amount=scanner.nextInt();
		double discount=(amount>=100)?0.2:(amount>=50)?0.1:0.0;
		scanner.close();
	
	}  
		
}


	 
