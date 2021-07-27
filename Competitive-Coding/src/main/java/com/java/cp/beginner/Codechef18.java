package com.java.cp.beginner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// TO-DO !!!!!
// Problem Code: TRACE
public class Codechef18 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int test;
		
		if (scanner.hasNext()) {
			test = scanner.nextInt();
		}
		else test = 0;
		
		while (test >= 1 && test<=100) {
			
			int size = scanner.nextInt();
			
			int[][] matrix;
			List<Integer> list = new ArrayList<Integer>();
			
			if (size>=2 && size<=100) {
				matrix = new int[size][size];
				for (int i = 0; i < matrix.length; i++) {
					for (int j = 0; j < matrix.length; j++) {
						int element = scanner.nextInt();
						if (element>=1 && element<=100) {
							matrix[i][j] = element;
						}
					}
				}
				
				int minX = 0;
				int minY = 0;
				int maxX = size-1;
				int maxY = size-1;
				
				int maxTrace = 0;
				
				for (int i = 0; i < matrix.length; i++) {
					for (int j = 0; j < matrix.length; j++) {
						if (i+1<=maxX && j+1<=maxY) {
							maxTrace = matrix[i][j] + matrix[i+1][j+1];
							list.add(maxTrace);
						}
						else if (i-1>=minX && j+1<=maxY) {
							maxTrace = matrix[i][j] + matrix[i-1][j+1];
							list.add(maxTrace);
						}
						else if (i+1<=maxX && j-1<=minY) {
							maxTrace = matrix[i][j] + matrix[i+1][j-1];
							list.add(maxTrace);
						}
						else if (i-1>=minX && j-1>=minY) {
							maxTrace = matrix[i][j] + matrix[i-1][j-1];
							list.add(maxTrace);
						}
					}
				}
			}
			
			Collections.sort(list);
			
			System.out.println(list.get(list.size()-1));
			
			test--;
		}
		
		scanner.close();
	}
}
