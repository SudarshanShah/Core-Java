package com.java.cp.beginner;

import java.util.Scanner;

// Problem Code: FLOW001
public class Codechef11 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int test;
		
		if (scanner.hasNext()) {
			test = scanner.nextInt();
		}
		else test = 0;
		
		
		while (test-- > 0) {
			
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			
			int sum = a + b;
			
			System.out.println(sum);
		}
		
		scanner.close();
	}
}
