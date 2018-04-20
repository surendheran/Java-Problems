package com.problems;

//https://www.geeksforgeeks.org/print-distinct-sorted-permutations-with-duplicates-allowed/
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PermutationString {

	public static void main(String[] args) {

		String input = "aab";
		char temp[] = input.toCharArray();
		Arrays.sort(temp);
		print(temp);
		
		int total = calculatePossibleCount(temp);
		
		for(int i=1; i<total;i++)
			nextPermutation(temp);

	}
	
	public static void nextPermutation(char temp[]){
		
		int i;
		for(i = temp.length - 1; i > 0; i--)
			if(temp[i] > temp[i-1])
				break;
		
		int min = i;
		int j, x = temp[i-1];
		for(j = i + 1; j < temp.length; j++)
			if((temp[j] < temp[min]) && (temp[j] > x))
				min = j;
		
		char swap;
		swap = temp[i - 1];
		temp[i - 1] = temp[min];
		temp[min] = swap;
		
		Arrays.sort(temp, i, temp.length);
		print(temp);
	}
	
	public static int calculatePossibleCount(char temp[]){
		
		int fact = factorial(temp.length);
		
		Map<Character, Integer> map = new HashMap<>();
		for(int i=0; i<temp.length;i++)
			map.put(temp[i], map.get(temp[i])==null?1:map.get(temp[i])+1);
		
		for(Map.Entry<Character, Integer> e: map.entrySet())
			if(e.getValue()>1)
				fact /= factorial(e.getValue());
		return fact;
	}
	
	public static int factorial(int num){
		int fact = 1;
		for (int i=1; i<=num; i++)
			fact*=i;
		return fact;
	}
	
	public static void print(char[] s){
		System.out.println(s);
	}

}
