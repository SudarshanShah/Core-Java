package com.java.cp.beginner;

import java.util.Scanner;

// Problem Code: FLOW004
public class Codechef19 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int test;
		
		if(scanner.hasNext())
		    test = scanner.nextInt();
		else test = 0;
		
		int first = 0;
		while(test-- > 0) {
		 
			int number = scanner.nextInt();
			
			first = number % 10;
			
			while (number >= 10) {				
				number = number / 10;
			}
			
			System.out.println(first + number);
		}
		
		scanner.close();
	}
}
