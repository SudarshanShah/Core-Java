package com.java.cp.beginner;

import java.util.Scanner;

// Problem Code: POTATOES
public class Codechef14 {

	public static boolean checkPrime(int number) {
		
		if (number % 2 == 0) {
			return false;
		}
		
		boolean flag = false;
		
		for (int i = 3; i < number/2; i++) {
			if (number % i == 0) {
				return flag;
			}
		}
		
		return !flag;
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int test;
		
		if (scanner.hasNext()) {
			test = scanner.nextInt();
		}
		else test = 0;
		
		while (test-- > 0) {
			
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			
			int sum = x + y;
			
			int i = 1;
			while (true) {
				sum += i;
				if (checkPrime(sum)) {
					break;
				}
			}
			
			System.out.println(sum-x-y);
		}
		
		scanner.close();
	}
}
