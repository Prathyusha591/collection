package com.codegnan.patterns;

public class SquarePattern {
	
	// method to demonstrate pattern
public static void  printPattern(int n) {
	int i,j;
	// outer loop to handle number of rows.
	for(i=0;i<n;i++) {
		//inner loop to handle number of columns.
		for(j=0;j<n;j++) {
			if(i == 0 || j ==0 || i == n - 1 || j == n - 1) {
				System.out.print("*");
			} else {
				System.out.print(" ");
			}
			
		}
		System.out.println();
	}
}

public static void main(String[] args) {
	int number = 6;
	printPattern(number);
	
	
}
}
			
			
		
	
		
		

	


