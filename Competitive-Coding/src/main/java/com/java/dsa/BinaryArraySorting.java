package com.java.dsa;

import java.util.Scanner;

public class BinaryArraySorting {

	private int size;
	private int[] arr;
	private static Scanner scanner = new Scanner(System.in);
	
	public int[] inputArray() {
		
		System.out.println("Enter the size of array : ");
		size = scanner.nextInt();
		
		arr = new int[size];
		
		System.out.println("Enter the elements in array: ");
		for (int i=0; i<size; i++) {
			arr[i] = scanner.nextInt();
		}
		
		return arr;
	}
	
	public void sort(int[] arr) {
		
		int count = 0;
		for(int i : arr) {
			if (i==0) {
				count++;
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			if(count-- > 0)
				arr[i] = 0;
			else arr[i] = 1;
		}
		
		for(int i : arr) 
			System.out.println(i);
	}
	
	
	public static void main(String[] args) {
		
		BinaryArraySorting bsort = new BinaryArraySorting();
		
		int[] arr = bsort.inputArray();
		
		bsort.sort(arr);
	}
}
