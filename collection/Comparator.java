package com.codegnan.collection;

import java.util.Comparator;

	public class MyComparator implements Comparator {
		public int compare(Object obj1, Object obj2) {
			Integer i1=(Integer) obj1;
//			Integer i2=(Integer) obj2;
//			if(i1<i2) {
//				return 1;
//			}else {
//				if(i1>i2) {
//					return -100;
//				}else {
//					return 0;
//					}
//			}
//		return -i1.compareTo(i2);//here - value is dissenting order and + is the assenting order
	
		
		
		String i1=(String) obj1;
		String i2=(String) obj2;
		return i1.compareTo(i2);
	}
 

	}


