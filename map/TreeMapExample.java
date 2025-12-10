package com.codegnan.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

   public static void main(String[] args) {
	   TreeMap<Person,Integer> map=new TreeMap();
	   map.put(new Person(101,"malli","malli@gmail.com"), 1);
	   map.put(new Person(102,"pathu","pathu@gmail.com"), 20);
	   map.put(new Person(103,"arjun","arjun@gmail.com"), 13);
       map.put(new Person(104,"Sudheer","Sudheer@gmail.com"), 43);
       map.put(new Person(105,"ramprasad","ramprasad@gmail.com"), 5);
       map.put(new Person(106,"srinu","srinu@gmail.com"), 6);
       System.out.println(map);
       System.out.println("sorted map(key--> Person by name)");
       for(Map.Entry<Person,Integer>entry:map.entrySet()) {
    	   System.out.println("Key : "+entry.getKey()+"value "+entry.getValue());
       }  
    		   

   }	   
	
}

