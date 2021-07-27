package com.java.cp.beginner;

import java.util.Arrays;
import java.util.Scanner;

// Problem Code: CO92JUDG
public class Codechef12 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int test;
		
		if (scanner.hasNext()) {
			test = scanner.nextInt();
		}
		else test = 0;
		
		while(test-- > 0) {
			
			int n = scanner.nextInt();
			
			int[] arr1 = new int[n];
			int[] arr2 = new int[n];
			
			for (int i = 0; i < arr1.length; i++) {
				int value = scanner.nextInt();
				arr1[i] = value;
			}
			
			for (int i = 0; i < arr2.length; i++) {
				int value = scanner.nextInt();
				arr2[i] = value;
			}
			
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			
			arr1[arr1.length-1] = 0;
			arr2[arr2.length-1] = 0;
			
			int sum1 = 0;
			int sum2 = 0;
			
			for (int i = 0; i < n; i++) {
				sum1 += arr1[i];
				sum2 += arr2[i];
			}
			
			System.out.println("Sum1 = " + sum1 + " Sum2 = " + sum2);
			
			if (sum1 > sum2) {
				System.out.println("Bob");
			}
			
			else if (sum2 > sum1) {
				System.out.println("Alice");
			}
			
			else {
				System.out.println("Draw");
			}
		}
		
		scanner.close();
	}
}
