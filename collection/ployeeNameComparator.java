package com.codegnan.collection;

import java.util.Comparator;

public class ployeeNameComparator implements Comparator{
	
public int compare(Employee e1, Employee e2) {
	int lenCompare = Integer.compare(e1.getName().length(), e2.getName().length());
	if (lenCompare !=0)
}

	public ployeeNameComparator() {
	}

	public static void main(String[] args) {

	}

}
