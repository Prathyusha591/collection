package com.codegnan.stringprograms;

public class PalindromeString {

	public  static boolean isPalindrome(String str) {
		int left = 0;
		int right = str.length() - 1;
		while (left < right) {
			if (str.charAt(left) != str.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
	
	public static void main(String[] args) {
		String input1 = "racecar";
		String input2 = "madam";
		String input3 = "hello";
		System.out.println(input1 + " is palindrome " + isPalindrome(input1));
		System.out.println(input2 + " is palindrome " + isPalindrome(input2));
		System.out.println(input3 + " is palindrome " + isPalindrome(input3));
			}
		
	}

	
		

	


