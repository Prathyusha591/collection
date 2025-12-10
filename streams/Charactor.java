package com.codegnan.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Charactor {


	public static void main(String[] args) {
		
		List<String> Words = Arrays.asList("java", "python", "ruby", "jsp", "spring");
		
		List<String> longWords = Words.stream()
				.filter(Word -> Word.length() > 4)
				.collect(Collectors.toList());
		
		System.out.println("Words longer than 4 characters: " + longWords);

	}

}
