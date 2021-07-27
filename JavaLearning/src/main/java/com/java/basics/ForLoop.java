package com.java.basics;

public class ForLoop {

	public static void main(String[] args) {
		
		// for loop 
		
		int n = 5;
	    // for loop  
	    for (int i = 1; i <= n; ++i) {
	      System.out.println("Java is fun");
	    }
	    
	    int m = 5;
	    // for loop  
	    for (int i = 1; i <= m; ++i) {
	      System.out.println(i);
	    }
	    
	    
	    System.out.println("-----------------------------------");
	    
	    // for-each loop
	    
	    char[] vowels = {'a', 'e', 'i', 'o', 'u'};
	    
	    // iterating through an array using the for-each loop
	    for (char item: vowels) {
	      System.out.println(item);
	    }
	    
	    int[] numbers = {3, 4, 5, -5, 0, 12};
	    int sum = 0;

	    // iterating through each element of the array 
	    for (int number: numbers) {
	      sum += number;
	    }
	   
	    System.out.println("Sum = " + sum);
	    
	}
}
