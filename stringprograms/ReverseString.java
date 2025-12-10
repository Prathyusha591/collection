package com.codegnan.stringprograms;

import java.util.Scanner;

public class ReverseString {
	
public static String reverseString(String str) {	
    String reversed = "";
    for (int i = str.length() - 1; i >= 0;i--) {
    	char currentChar = str.charAt(i);
    	reversed += currentChar;
    }
    return reversed;
    
}

public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter a String");
	String input = scanner.next();
	
	System.out.println("Reversed String :"+reverseString(input));
	scanner.close();
	
    }
		
	}

		

	
