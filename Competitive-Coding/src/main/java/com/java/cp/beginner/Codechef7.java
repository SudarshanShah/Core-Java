package com.java.cp.beginner;

import java.util.Scanner;

// Problem Code: FLOW002
public class Codechef7 {

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
			
			int remainder = a % b;
			
			System.out.println(remainder);
		}
		
		scanner.close();
	}
}
