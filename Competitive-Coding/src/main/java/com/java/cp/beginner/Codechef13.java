package com.java.cp.beginner;

import java.util.Scanner;

// Problem Code: FLOW018
public class Codechef13 {

	public static long calculateFactorial(long number) {
		
		if (number==1 | number==0) {
			return 1;
		}
		
		return number * calculateFactorial(number-1);
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int test;
		
		if (scanner.hasNext()) {
			test = scanner.nextInt();
		}
		else test = 0;
		
		while (test-- > 0) {
			
			long number = scanner.nextLong();
			
			long factorial = Codechef13.calculateFactorial(number);
			
			System.out.println(factorial);
		}
		
		scanner.close();
	}
}
