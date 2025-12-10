package com.codegnan.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountExample {

public static void main(String[] args) {
//		ArrayList<String> fruits=new ArrayList<>();
//		fruits.add("apple");
//		fruits.add("banana");
//		fruits.add("kiwi");
//		fruits.add("grape");
//		fruits.add("guava");
//		fruits.add("cherry");
//		fruits.add("dragon");
//		System.out.println(fruits);
//		
//		
//		long count=fruits.stream().filter(s->s.length()==5).count();
//		System.out.println("The number of 5 length String is : "+count);*/
//
    List<String> names=Arrays.asList("malli", "arjun"," sudheer","sai","deephti");
    long count=names.stream().filter(s->s.length()==5).count();
    System.out.println(count);
    		





		

	}

}
