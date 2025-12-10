package com.codegnan.streams;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Adult2 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				    new Person("Alice", 17),
				    new Person("Bob", 22),
				    new Person("Charlie", 16),
				    new Person("David", 25),
				    new Person("Eva", 18)
				    );
		
		List<Person> adults = people.stream()
				.filter(person -> person.getAge() >= 18)
				.collect(Collectors.toList());
		
		System.out.println("Adults: " + adults);
				    

	}

}
