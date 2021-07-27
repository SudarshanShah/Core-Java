package com.java.cp.beginner;

import java.util.Scanner;

// Problem Code: FLOW007
public class Codechef26 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int test;
		
		if(scanner.hasNext())
		    test = scanner.nextInt();
		else test = 0;
		
		
		while(test-- > 0) {
			
			long number = scanner.nextLong();
			
			long reverse = 0, rem = 0;
			
			while (number > 0) {
				rem = number % 10;
				
				reverse = reverse*10 + rem;
				
				number /= 10;
			}
			
			System.out.println(reverse);
		}
		
		scanner.close();
	}
}
