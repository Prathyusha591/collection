package com.codegnan.stringhandling;

public class StringBufferExample {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Hello Pathu");
		String str=sb.toString();
		System.out.println("charAt(7):"+str.charAt(7));
		System.out.println("indexOf('e'):"+str.indexOf('e'));
		System.out.println("lastindexOf('0'):"+str.lastIndexOf('o'));
		System.out.println("concat:"+str.concat("java"));
		System.out.println("equals(\"HelloPathu\"):"+str.equals("HelloPathu"));
		System.out.println("equalsIgnoreCase(\"hellopathu\"):"+str.equalsIgnoreCase("hellopathu"));
		System.out.println("startsWith(\"Hell\"):"+str.startsWith("Hell"));
		System.out.println("endsWith(\"Pathu\"):"+str.endsWith("Pathu"));
		System.out.println("toLowerCase:"+str.toLowerCase());
		System.out.println("toUpperCase:"+str.toUpperCase());
		System.out.println("subString(5):"+str.substring(5));
		System.out.println("length:"+str.length());
		System.out.println("replace('o','a'):"+str.replace('o','a'));
		
	}

}
		

	


