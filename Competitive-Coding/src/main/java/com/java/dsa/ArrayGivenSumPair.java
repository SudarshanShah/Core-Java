package com.java.dsa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayGivenSumPair {

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
	
	public int[] findPair(int sum) {
		
		List<Integer> list = new ArrayList<Integer>();
		for(int i : arr)
			list.add(i);
		
		int[] a = new int[2];
		
		for(Integer i : list) {
			int difference = sum - i;
			if (list.contains(difference)) {
				a[0] = i;
				a[1] = difference;
				
				break;
			}
		}
		
		return a;
		
	}
	
	public static void main(String[] args) {
		
		ArrayGivenSumPair arr = new ArrayGivenSumPair();
		
		arr.inputArray();
		
		int[] a = new int[2];
		
		System.out.println("Enter the Sum : ");
		int sum = scanner.nextInt();

		a = arr.findPair(sum);
		
		for(int i : a) 
			System.out.println(i);
	}
}
