package com.codegnan.patterns;

public class StarPattern1 {

	public static void main(String[] args) {
		int rows=5;
		for(int i=rows;i>=1;i--) {
		for(int s=1;s<=rows-i;s++) {
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++) {
			System.out.print("*");
		}
		for(int j=i-1;j>=1;j--) {
			System.out.print("*");
		}
		System.out.println();
		}
		
	}
}
		
		

	


