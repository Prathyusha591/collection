package com.codegnan.collection;

import java.util.HashSet;

public class SetExamole {

	public static void main(String[] args) {
		HashSet<Integer> h=new LinkedHashSet<>();
		h.add(20);
		h.add(10);
		h.add(22);
		h.add(10);
		h.add(null);
		h.add(2);
		System.out.println(h.add(null));
		System.out.println(h);

	}

}
