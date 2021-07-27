package com.java.cp.beginner;

import java.util.Scanner;

// Problem Code: FSQRT
public class Codechef8 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int test;
		
		if(scanner.hasNext())
		    test = scanner.nextInt();
		else test = 0;
		
		while(test-- > 0) {
		    
		    int number = scanner.nextInt();
		    
		    int squareRoot = (int) Math.sqrt(number);
		    
		    System.out.println(squareRoot);
		}
		
		scanner.close();
	}
}
