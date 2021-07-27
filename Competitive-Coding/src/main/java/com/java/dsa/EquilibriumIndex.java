package com.java.dsa;

import java.util.Scanner;

public class EquilibriumIndex {

	private int size;
	private int[] arr;
	private static Scanner scanner = new Scanner(System.in);
	
	public void inputArray() {
		
		System.out.println("Enter the size of array : ");
		size = scanner.nextInt();
		
		arr = new int[size];
		
		System.out.println("Enter the elements in array: ");
		for (int i=0; i<size; i++) {
			arr[i] = scanner.nextInt();
		}
	}
	
	public static void main(String[] args) {
		
	}
}
