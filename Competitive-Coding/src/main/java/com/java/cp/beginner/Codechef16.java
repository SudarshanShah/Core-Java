package com.java.cp.beginner;

import java.util.Scanner;

// Problem Code: FLOW013
public class Codechef16 {

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
			int c = scanner.nextInt();
			
			if (a+b+c==180) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
		
		scanner.close();
	}
}
