package com.codegnan.foundation;

import java.util.Scanner;

	public class IncDecOperatorDemo {
		
		public static void main(String[] args) {
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter A character from (a-z) or (A-Z)");
			char ch= scanner.next().charAt(0);
			System.out.println(--ch);//c
			System.out.println(++ch);//d
				

	
		}		 

}
