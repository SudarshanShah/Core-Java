package com.java.cp.beginner;

import java.util.Scanner;

// Problem Code: PALL01
public class Codechef15 {

	public static boolean checkPalindrome(int number) {
		
		int newNumber = 0;
		int storeNumber = number;
		
		while(number > 0) {
			int rem = number % 10;
			number /= 10;

			
			if (number == 0) {
				newNumber += rem;
			}
			else {
				newNumber = newNumber*10 +  rem*10;
			}
		}
		
		return storeNumber == newNumber;
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int test;
		
		if (scanner.hasNext()) {
			test = scanner.nextInt();
		}
		else test = 0;
		
		while (test-- > 0) {
			
			int number = scanner.nextInt();
			
			if (checkPalindrome(number)) {
				System.out.println("wins");
			}
			else {
				System.out.println("loses");
			}
		}
		
		scanner.close();
	}
}
