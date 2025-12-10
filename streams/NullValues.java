package com.codegnan.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NullValues {

	public static void main(String[] args) {
		
		       List<String> Words = Arrays.asList("java", null, "spring", null, "python", "ruby");
		       
		       List<String> nonNullWords = Words.stream()
		    		   .filter(Word -> Word != null)
		    		   .collect(Collectors.toList());
		       
		       System.out.println("Non-null values: " + nonNullWords);

	}

}
