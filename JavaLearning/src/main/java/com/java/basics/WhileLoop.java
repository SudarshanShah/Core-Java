package com.java.basics;

public class WhileLoop {

	public static void main(String[] args) {
		
		// declare variables
	    int i = 1, n = 5;

	    // while loop from 1 to 5
	    while(i <= n) {
	      System.out.println(i);
	      i++;
	    }
	    
	    
	    System.out.println("-----------------------------");
	    
	    i = 1;
	    n = 5;

	    // do...while loop from 1 to 5
	    do {
	      System.out.println(i);
	      i++;
	    } while(i <= n);
	}
}
