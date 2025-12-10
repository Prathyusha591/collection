package com.codegnan.map;

import java.util.Comparator;

public class PersonName implements Comparator<Person>{
	
     @Override
     public int compare (Person p1, Person p2) {
    	 
    	 return -p1.name.compareTo(p2);
     } 	 
    	 
    	 
    	 
     } 
     