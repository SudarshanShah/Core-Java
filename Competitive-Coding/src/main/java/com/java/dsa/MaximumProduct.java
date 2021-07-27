package com.java.dsa;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumProduct {

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
	
	public int findMaxProduct(int[] arr) {
		
		Arrays.sort(arr);
		
		return arr[arr.length-1] * arr[arr.length-2];
	}
	
	public static void main(String[] args) {
		
		MaximumProduct mp = new MaximumProduct();
		
		int[] arr = mp.inputArray();
		
		System.out.println(mp.findMaxProduct(arr));
	}
}
