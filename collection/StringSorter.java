package com.codegnan.collection;
import java.util.*;

public class StringSorter {

	public static void main(String[] args) {
		        Comparator<String> customComparator = new Comparator<String>() {
		            @Override
		            public int compare(String s1, String s2) {
		                if (s1.length() != s2.length()) {
		                    return s1.length() - s2.length(); // sort by length
		                } else {
		                    return s1.compareTo(s2); // sort alphabetically if same length
		                }
		            }
		        };

		        // TreeSet with custom sorting logic
		        TreeSet<String> treeSet = new TreeSet<>(customComparator);

		        // Add strings
		        treeSet.add("apple");
		        treeSet.add("dog");
		        treeSet.add("banana");
		        treeSet.add("cat");
		        treeSet.add("bat"); 
		        treeSet.add("zebra");

		        // Output
		        System.out.println("Sorted Strings in TreeSet:");
		        for (String s : treeSet) {
		            System.out.println(s);
		        }
		    }
		}

	
	
