package com.codegnan.stringprograms;

public class DuplicateCharacterCount {

	public static int countDuplicates(String str) {
		int count=0;
		for(int i=0;i<str.length(); i++) {
			for(int j=i+1;j<str.length(); j++) {
				if (str.charAt(i)==str.charAt(j)) {
					count++;
					break;
				}
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		String str = "hellohh";
		System.out.println("duplicate character count in a string : "+countDuplicates(str));
				}
			
}
	

	
		

	


