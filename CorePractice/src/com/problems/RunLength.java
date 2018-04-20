package com.problems;

import java.util.Scanner;

public class RunLength {

	public static void main(String[] args) {
		
		int arr[] = new int[26];
		
		Scanner s = new Scanner(System.in);
		String str = s.next();
		s.close();
		
		for (char c: str.toCharArray()){
			arr[c - 'a']++;
		}
		
		StringBuilder builder = new StringBuilder();
		
		for(int i=0; i<str.length();){
			builder.append(str.charAt(i));
			builder.append(arr[str.charAt(i)-'a']);
			i += arr[str.charAt(i)-'a'];
		}
		
		System.out.println(builder.toString());
		System.out.println((int)'A');
		System.out.println((int)'a');
		
	}

}
