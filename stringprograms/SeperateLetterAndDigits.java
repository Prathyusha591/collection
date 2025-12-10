package com.codegnan.stringprograms;

public class SeperateLetterAndDigits {

	public static void main(String[] args) {
		String str="Subbu123raj";
		StringBuilder letters=new StringBuilder();
		StringBuilder digits=new StringBuilder();
		for(char ch:str.toCharArray()) {
			if(Character.isDigit(ch)) {
				digits.append(ch);
			}else {
				letters.append(ch);
			}
		}
		  	System.out.println("Letters:"+letters);
		  	System.out.println("Digits:"+digits);
		  	
	}
	
}
		
			
		
		

	


