package com.java.cp.beginner;

import java.util.Scanner;

// Problem Code -> ICL1902
public class Codechef3 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int test;

        if(scanner.hasNext()) {
		    test = scanner.nextInt();
		    System.out.println("Test is : " + test);
		}	
        else test = 0;
		
        while (test-- > 0) {
			long number = scanner.nextLong();
			
			long root = -1;
			int count = 0;
			
			while (root!=0) {
				root = (long) Math.sqrt(number);
				long square = root * root;
				number -= square;
				
				count++;
			}
			System.out.println(count-1);
		}
		
		scanner.close();
	}
}
