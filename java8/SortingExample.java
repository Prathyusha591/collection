package com.codegnan.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortingExample {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("malli","arjun"," sudheer", "sai", "deepthi","suhas");
		List<String> sortedNames = names.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedNames);
		
		System.out.println("descending order");
		List<String> decNames = names.stream()
				.sorted((s1,s2) -> s2.compareTo(s1)).collect(Collectors.toList());
				System.out.println(decNames);
				String min=names.stream().min((s1,s2) -> s2.compareTo(s1)).get();
				System.out.println("Minimum element is "+min);
				String max=names.stream().max((s1,s2) -> s2.compareTo(s1)).get();
				System.out.println("Maximum element is "+max);
				names.stream().forEach(name->System.out.println(name));
				String[] namesArray=names.stream()
						.toArray(String[]::new);
				System.out.println(Arrays.toString(namesArray));
				Stream<String> namesStream=Stream.of("john","roy","bob");
				namesStream.forEach(name->System.out.println(name));
				

	}

}
