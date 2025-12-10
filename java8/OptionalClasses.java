package com.codegnan.java8;

import java.util.Optional ;

public class OptionalClasses {

	public static void main(String[] args) {
        Optional<String> opt1 = Optional.of("hello");
	     System.out.println("of()" + opt1.get());
	     Optional<String> opt2 = Optional.ofNullable("hai");
	     System.out.println(opt2.isPresent());
	}

}