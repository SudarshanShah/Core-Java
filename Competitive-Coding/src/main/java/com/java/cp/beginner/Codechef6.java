package com.java.cp.beginner;

import java.util.Scanner;

// Problem Code: ZCOSCH
public class Codechef6 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		long rank = scanner.nextLong();
		
		if (rank > 0 | rank < 51) {
			System.out.println(100);
		}
		else if (rank > 50 | rank < 101) {
			System.out.println(50);
		}
		else {
			System.out.println(0);
		}
		
		scanner.close();
	}
}
