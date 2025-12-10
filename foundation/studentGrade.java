package com.codegnan.foundation;

import java.util.Scanner;

public class studentGrade {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Student marks"); 
		int marks = scanner.nextInt();
		char grade = (marks > 90) ? 'A' :
			(marks > 80 ) ? 'B' :
				(marks > 60) ? 'D' : 'P';
		System.out.println(grade);
		scanner.close();

	}

}
