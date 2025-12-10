package com.codegnan.stringprograms;

public class CharacterCount {

	public static String getCharacterCount(String str) {
		StringBuilder result=new StringBuilder();
		int count=1;
		for(int i=0;i<str.length();i++) {
			if(i+1<str.length() && str.charAt(i) == str.charAt(i+1)) {
				count++;
			} else {
				result.append(str.charAt(i)).append(count);
				count = 1;
			}
			}
		return result.toString();
	}
	
	public static void main(String[] args) {  
		String input = "aabbcccdd";
		System.out.println(getCharacterCount(input));
	
	}	
	
}
	
		

	


