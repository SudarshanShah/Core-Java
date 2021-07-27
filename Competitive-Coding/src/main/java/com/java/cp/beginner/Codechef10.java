package com.java.cp.beginner;

import java.util.Scanner;

// Problem Code: FLOW005
public class Codechef10 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int test;
		
		if (scanner.hasNext()) {
			test = scanner.nextInt();
		}
		else test = 0;
		
		while (test-- > 0) {
			
			long number = scanner.nextLong();
			
			int count = 0;
			
			int[] arr = {100, 50, 10, 5, 2, 1};
			
			for (int i = 0; i < arr.length; i++) {
				count += number / arr[i];
				System.out.println();
				
				if (number%arr[i]==0) {
					break;
				}
				else {
					number %= arr[i];
				}
			}
			
			System.out.println(count);
		}
		
		scanner.close();
	}
}
