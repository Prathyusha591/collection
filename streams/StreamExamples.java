package com.codegnan.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExamples {

    public static void main(String[] args) {
    	List<Integer> numbers=Arrays.asList(1,-5,7,-19,4,-8,6,-12);
    	
    	List<Integer> even=numbers.stream()
    			.filter(i->i%2>0)
    			.collect(Collectors.toList());
    	System.out.println("Even Numbers : "+even); 
    	List<String> name=Arrays.asList("java","python","rupy","jdbc","jsp","spring");
    	
    	List<String> jnames = names.stream()
    			.filter(name -> name.startsWith("j")).
    			collect(Collectors.toList());
    	System.out.println(jnames);
    	
    	

	}

}
