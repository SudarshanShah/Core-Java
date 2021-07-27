package com.java.cp.beginner;

import java.util.Scanner;

// Problem Code: FLOW014
public class Codechef24 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int test;
		
		if(scanner.hasNext())
		    test = scanner.nextInt();
		else test = 0;
		
		
		while(test-- > 0) {
			
			int hardness = scanner.nextInt();
			double carbon = scanner.nextDouble();
			int tensile = scanner.nextInt();
			
			if (hardness>50 && carbon<0.7 && tensile>5600) {
				System.out.println("10");
			}
			else if (hardness>50 && carbon<0.7) {
				System.out.println("9");
			}
			else if (carbon<0.7 && tensile>5600) {
				System.out.println("8");
			}
			else if (hardness>50 && tensile>5600) {
				System.out.println("7");
			}
			else if (hardness>50 || carbon<0.7 || tensile>5600) {
				System.out.println("6");
			}
			else {
				System.out.println("5");
			}
		}
		
		scanner.close();
	}
}
