package com.java.cp.beginner;

import java.util.Scanner;

// Problem Code: FLOW008
public class Codechef17 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int test;
		
		if (scanner.hasNext()) {
			test = scanner.nextInt();
		}
		else test = 0;
		
		while (test-- > 0) {
			
			
			int n = scanner.nextInt();
			
			if (n < 10) {
				System.out.println("Thanks for helping Chef!");
			}
			else {
				System.out.println(-1);
			}
		}
		
		scanner.close();
	}
}
