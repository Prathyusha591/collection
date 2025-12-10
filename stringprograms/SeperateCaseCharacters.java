package com.codegnan.stringprograms;

public class SeperateCaseCharacters {

	public static void main(String[] args) {
		String str="aBACbcEDed";
		StringBuilder lowerCase=new StringBuilder();
		StringBuilder upperCase=new StringBuilder();
		for(char ch:str.toCharArray()) {
			if(Character.isLowerCase(ch)&&lowerCase.indexOf(String.valueOf(ch))==-1) {		
				lowerCase.append(ch);
			}else if (Character.isUpperCase(ch)&&upperCase.indexOf(String.valueOf(ch))==-1) {
				upperCase.append(ch);
			}
			}
			System.out.println("Lowercase:"+lowerCase);
			System.out.println("Uppercase:"+upperCase);
					
		}
		
	
	}
	


