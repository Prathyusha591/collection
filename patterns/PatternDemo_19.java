package com.codegnan.patterns;

public class PatternDemo_19 {

	public static void main(String[] args) {
		int rows=5;
		//outer loop: controls the number of rows for the pyramid.
		for(int i=1;i<rows;i++) {
			//inner for loop 1: print leading space for alignment.
			for (int j =1; i < rows - i; j++) {
				System.out.print(" ");// print a single space
			}
			//inner for loop 2: print the star as current roe.
			//the number of stars increase with i 2*(i-1);
			for (int k = 0; k < 2 * i - 1; k++) {
				System.out.print("*");//print a star
			}
			System.out.println();
		}
	}
	
}
			
		

	


