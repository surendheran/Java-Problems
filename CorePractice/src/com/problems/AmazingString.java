package com.problems;

public class AmazingString {

	public static void main(String[] args) {

		String input = "abbaaadd";
		
		char[] c = input.toCharArray();
		int replaceCount = 0;
		for (int i = 0; i < c.length; i++) {
			
			if (i+1<c.length && c[i]==c[i+1]){
				replaceCount++;
				i++;
			}
		}
		
		System.out.println(replaceCount);
		
	}

}
