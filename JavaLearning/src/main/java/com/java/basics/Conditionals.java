package com.java.basics;

public class Conditionals {

	public static void main(String[] args) {
		
		// If Statement
		int number = 10;

	    // checks if number is greater than 0
	    if (number > 0) {
	      System.out.println("The number is positive.");
	    }

	    System.out.println("Statement outside if block");
	    
	    String language = "Java";

	    // if statement
	    if (language == "Java") {
	      System.out.println("Best Programming Language");
	    }
	    
	    
	    System.out.println("---------------------------------------");
	    
	    // If-Else statements
	    
	    int number1 = 10;

	    // checks if number is greater than 0
	    if (number1 > 0) {
	      System.out.println("The number is positive.");
	    }
	    
	    // execute this block
	    // if number is not greater than 0
	    else {
	      System.out.println("The number is not positive.");
	    }

	    System.out.println("Statement outside if...else block");
	    
	    
	    System.out.println("---------------------------------------");
	    
	    // If-Else ladder
	    
	    int number2 = 0;

	    // checks if number is greater than 0
	    if (number2 > 0) {
	      System.out.println("The number is positive.");
	    }

	    // checks if number is less than 0
	    else if (number2 < 0) {
	      System.out.println("The number is negative.");
	    }
	    
	    // if both condition is false
	    else {
	      System.out.println("The number is 0.");
	    }
	    
	    
	    System.out.println("---------------------------------------");
	    
	    // Nested If-Else
	    
	    Double n1 = -1.0, n2 = 4.5, n3 = -5.3, largest;

	    // checks if n1 is greater than or equal to n2
	    if (n1 >= n2) {

	      // if...else statement inside the if block
	      // checks if n1 is greater than or equal to n3
	      if (n1 >= n3) {
	        largest = n1;
	      }

	      else {
	        largest = n3;
	      }
	    } else {

	      // if..else statement inside else block
	      // checks if n2 is greater than or equal to n3
	      if (n2 >= n3) {
	        largest = n2;
	      }

	      else {
	        largest = n3;
	      }
	    }

	    System.out.println("Largest Number: " + largest);
	    
	    
	    System.out.println("---------------------------------------");
	    
	    // Switch statements
	    
	    int num = 44;
	    String size;

	    // switch statement to check size
	    switch (num) {

	      case 29:
	        size = "Small";
	        break;

	      case 42:
	        size = "Medium";
	        break;

	      // match the value of week
	      case 44:
	        size = "Large";
	        break;

	      case 48:
	        size = "Extra Large";
	        break;
	      
	      default:
	        size = "Unknown";
	        break;

	    }
	    System.out.println("Size: " + size);
	}
}
