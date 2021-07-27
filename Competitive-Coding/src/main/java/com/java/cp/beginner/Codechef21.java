package com.java.cp.beginner;

import java.util.Scanner;

// Problem Code: CHEGLOVE
public class Codechef21 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int test;
		
		if(scanner.hasNext())
		    test = scanner.nextInt();
		else test = 0;
		
		
		while(test-- > 0) {
			
			long finger = scanner.nextLong();
			
			long[] fingerLength = new long[(int) finger];
			for(int i=0; i<finger; i++) {
				fingerLength[i] = scanner.nextLong();
			}
			
			long[] gloveLength = new long[(int) finger];
			for(int i=0; i<finger; i++) {
				gloveLength[i] = scanner.nextLong();
			}
			
			boolean flag1 = true;
			boolean flag2 = true;
			for (int i = 0; i < fingerLength.length; i++) {
				if (fingerLength[i]>gloveLength[i]) {
					//System.out.println("fingerLength[i]=" + fingerLength[i] + " gloveLength[i]=" + gloveLength[i]);
					flag1 = false;
				}
			}
			
			long[] arr = new long[(int) finger];
			
			for(int i=0; i<finger; i++) {
				arr[i] = gloveLength[(int) (finger-i-1)];
			}
			
			for (int i = 0; i < fingerLength.length; i++) {
				if (fingerLength[i] > arr[i]) {
					flag2 = false;
				}
			}
			
			if (flag1 && flag2) {
				System.out.println("both");
			}
			else if (!flag1 && flag2) {
				System.out.println("back");
			}
			else if (flag1 && !flag2) {
				System.out.println("front");
			}
			else {
				System.out.println("none");
			}
		}
		
		scanner.close();
	}
}
