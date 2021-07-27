package com.java.basics;

public class JavaArray {

	public static void main(String[] args) {
		
		   // create an array
		   int[] age = {12, 4, 5, 2, 5};

		   // access each array elements
		   System.out.println("Accessing Elements of Array:");
		   System.out.println("First Element: " + age[0]);
		   System.out.println("Second Element: " + age[1]);
		   System.out.println("Third Element: " + age[2]);
		   System.out.println("Fourth Element: " + age[3]);
		   System.out.println("Fifth Element: " + age[4]);
		   
		   
		   System.out.println("---------------------------------------");
		   
		   // create an array
		   int[] age1 = {12, 4, 5};

		   // loop through the array
		   // using for loop
		   System.out.println("Using for Loop:");
		   for(int i = 0; i < age1.length; i++) {
		     System.out.println(age1[i]);
		   }
		   
		   
		   System.out.println("---------------------------------------");
		   
		   // create an array
		   int[] age2 = {12, 4, 5};

		   // loop through the array
		   // using for loop
		   System.out.println("Using for-each Loop:");
		   for(int a : age2) {
		     System.out.println(a);
		   }
	}
}
