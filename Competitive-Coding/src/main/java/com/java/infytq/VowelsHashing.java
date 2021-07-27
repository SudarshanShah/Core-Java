package com.java.infytq;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/*
 * Given a string, hash the string using vowels as : 
 
 * Locate the index of vowel -> multiply by 5 -> then add consecutive odd numbers from 1 to product 
 * and then reduce the final sum to single digit, if its not and replace vowel with that digit.
 
 * If the string has no vowel, print -1.
 * */

public class VowelsHashing {

	private static final Scanner SCANNER = new Scanner(System.in);
	
	private static final List<Integer> INTEGERS = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
	
	public int vowelsToHashValue(int index) {
		int res = index * 5;
		
		System.out.println("res value after * 5 = " + res);
		
		int sum = 0;
		
		for(int i=1; i<=res; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
				sum = sum + i;
			}
		}
		System.out.println("res value after adding odd nos = " + sum);
		
		
		if (INTEGERS.contains(sum)) {
			return sum;
		}
		
		while(!INTEGERS.contains(sum)) {
			int r = reduceToSingleDigit(sum);
			sum = r;
		}
		
		System.out.println("final sum = " + sum);
		
		return sum;
	}
	
	private int reduceToSingleDigit(int res) {
		int num = 0;
		
		while(res > 0) {
			int rem = res % 10;
			num = num + rem;
			res = res / 10;
		}
		
		return num;
	}
	
	public static void main(String[] args) {
		
		String s = SCANNER.nextLine();
		
		List<Character> vowels = Arrays.asList('A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u');
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		int flag = 0;
		
		for(int i=0; i<s.length(); i++) {
			if (vowels.contains(s.charAt(i))) {
				flag = 1;
				int hashValue = new VowelsHashing().vowelsToHashValue(i);
				map.put(i, hashValue);
			}
		}
		
		String str = "";
		
		for(int i=0; i<s.length(); i++) {
			if (map.containsKey(i)) {
				int val = map.get(i);
				str = str + val;
			}
			
			else {
				str = str + s.charAt(i);
			}
		}
		
		if (flag==1) {
			System.out.println(str);
		}
		else {
			System.out.println(-1);
		}
	}
}
