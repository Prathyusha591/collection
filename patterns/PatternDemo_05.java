package com.codegnan.patterns;

public class PatternDemo_05 {

	public static void main(String[] args) {
		int rows = 10, columns = 10; 
		// outer for loop talks about rows
				for (int i = 0; i < rows; i++) {
					//inner for loop talks about columns
					for (int j = 0; j < columns; j++) {
						//print star
						System.out.print((9-i)+"");
					}
					System.out.println();
				}
				
			}
			
		}
				

			



	


