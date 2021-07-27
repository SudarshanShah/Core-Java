package com.java.basics;

public class BinarySearch {

	public int binarySearch(int[] arr, int l, int r, int x) {
		
		if (r>=1) {
			
			int mid = l + (r - l)/2;
			
			if (arr[mid]==x) {
				return mid;
			}
			
			if (arr[mid]>x) {
				return binarySearch(arr, l, mid-1, x);
			}
			
			return binarySearch(arr, mid+1, r, x);
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		
		BinarySearch bSearch = new BinarySearch();
		
		int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		int n = arr.length;
		int x = 11;
		
		int result = bSearch.binarySearch(arr, 0, n-1, x);
		if (result==-1) {
			System.out.println("Not Found");
		}
		else {
			System.out.println("Its present at index " + result);
		}
	}
}
