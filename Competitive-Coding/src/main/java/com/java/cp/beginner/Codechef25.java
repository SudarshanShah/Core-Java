package com.java.cp.beginner;

import java.util.Scanner;

// Problem Code: FLOW006
public class Codechef25 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int test;
		
		if(scanner.hasNext())
		    test = scanner.nextInt();
		else test = 0;
		
		
		while(test-- > 0) {
			
			long number = scanner.nextLong();
			
			long sum = 0;
			while (number > 0) {
				long rem = number % 10;
				
				sum += rem;
				
				number /= 10;
			}
			
			System.out.println(sum);
		}
		
		scanner.close();
	}
}
