package com.codegnan.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class NonEmpty {

    public static void main(String[] args) {
    	
    	List<String> Words = Arrays.asList("java", "", "python", " ", "spring", "", "ruby");
    	
    	List<String> nonEmpty = Words.stream()
    			.filter(word -> !word.isEmpty())
    			.collect(Collectors.toList());
    	
    	System.out.println("Non-empty strings: " + nonEmpty);
    			
    			

	}

}
