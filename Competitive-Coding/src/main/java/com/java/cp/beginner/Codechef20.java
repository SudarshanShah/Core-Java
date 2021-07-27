package com.java.cp.beginner;

import java.util.Scanner;

// Problem Code: ELEVSTRS
public class Codechef20 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int test;
		
		if(scanner.hasNext())
		    test = scanner.nextInt();
		else test = 0;
		
		
		while(test-- > 0) {
			
			double floorCount = scanner.nextDouble();
			double stairVelocity = scanner.nextDouble();
			double elevatorVelocity = scanner.nextDouble();
			
			double stairLength = Math.sqrt(2) * floorCount;
			double elevatorLength = 2 * floorCount;
			
			double stairTime =  stairLength/stairVelocity;
			double elevatorTime = elevatorLength/elevatorVelocity;
			
			if (stairTime > elevatorTime) {
				System.out.println("Elevator");
			}
			else {
				System.out.println("Stairs");
			}
			
		}
		
		scanner.close();
	}
}
