package com.java.cp.beginner;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// Problem Code: MATCHES
public class Codechef4 {

	private static final List<Integer> LIST = Arrays.asList(6, 2, 5, 5, 4, 5, 6, 3, 7, 6);
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int test;
		
		if (scanner.hasNext()) {
			test = scanner.nextInt();
		}
		else test = 0;
		
		while (test-- > 0) {
			
			long a = scanner.nextLong();
			long b = scanner.nextLong();
			
			long sum  = a + b;
			
			int count = 0;
			
			while (sum > 0) {
				long rem = sum % 10;
				
				int num = LIST.get((int) rem);
				count += num;
				
				sum = sum / 10;
			}
			
			System.out.println(count);
		}
		
		scanner.close();
	}
}
