package com.codegnan.stringhandling;

public class StringMethods {

	public static void main(String[] args) {
		String str="Hello World";
		char character=str.charAt(0);
		System.out.println("charAt(0):"+character);
		int index=str.indexOf("World");
		System.out.println("indexOf(\"World\"):"+index);
		int lastIndex=str.lastIndexOf('1');
		System.out.println("indexOf('1)':"+lastIndex);
		String newStr=str.concat("!");
		System.out.println("concat(\"!\"):"+newStr);
		boolean isEqual=str.equals("Hello World");
		System.out.println("equals(\"Hello World\"):"+isEqual);
		boolean isEqualIgnoreCase=str.equalsIgnoreCase("hello World");
		System.out.println("equalsIgnoreCase(\"hello World\"):"+isEqualIgnoreCase);
		boolean startsWith=str.startsWith("Hello");
		System.out.println("startsWith(\"Hello\"):"+startsWith);
		boolean endsWith=str.endsWith("World");
		System.out.println("endsWith(\"World\"):"+endsWith);
		String lowerCaseStr=str.toLowerCase();
		System.out.println("toLowerCase():"+lowerCaseStr);
		String upperCaseStr=str.toUpperCase();
		System.out.println("toUpperCase():"+upperCaseStr);
		String subStr1=str.substring(6);
		System.out.println("substring(6):"+subStr1);
		String subStr2=str.substring(0,5);
		System.out.println("substring(0,5):"+subStr2);
		int length=str.length();
		System.out.println("length():"+length);
		String replacedStr=str.replace('1','L');
		System.out.println("replace('1',L'):"+replacedStr);
	}

}
		
		
		

	


