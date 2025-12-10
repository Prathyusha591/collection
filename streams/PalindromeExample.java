package com.codegnan.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PalindromeExample {

	public static void main(String[] args) {
		        
		       List<String> words = Arrays.asList("madam", "apple", "level", "banana", "civic", "hello");
		       
		       List<String> palindrome = words.stream()
		    		   .filter(word -> new StringBuilder(word).reverse().toString().equals(word))
		    		   .collect(Collectors.toList());
		       
		       System.out.println("Palindromes: " + palindrome);
	}

	}


