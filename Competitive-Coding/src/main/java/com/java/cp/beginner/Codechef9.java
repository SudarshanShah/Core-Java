package com.java.cp.beginner;

import java.util.Scanner;

// Problem Code : CHN15A
public class Codechef9 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int test;
		
		if (scanner.hasNext()) {
			test = scanner.nextInt();
		}
		else test = 0;
		
		int[] arr;
		
		while (test-- > 0) {
			
			int n = scanner.nextInt();
			int k = scanner.nextInt();
			
			arr = new int[n];
			
			for (int i = 0; i < arr.length; i++) {
				int element = scanner.nextInt();
				arr[i] = element;
			}
			
			int count = 0;
			
			for (int i = 0; i < arr.length; i++) {
				arr[i] = arr[i] + k;
				
				if (arr[i]%7 == 0) {
					count++;
				}
			}
			
			System.out.println(count);
		}
		
		scanner.close();
	}
}
