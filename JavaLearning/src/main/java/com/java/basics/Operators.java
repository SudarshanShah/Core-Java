package com.java.basics;

public class Operators {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		// Arithmetic Operators
		
		// addition operator
	    System.out.println("a + b = " + (a + b));

	    // subtraction operator
	    System.out.println("a - b = " + (a - b));

	    // multiplication operator
	    System.out.println("a * b = " + (a * b));

	    // division operator
	    System.out.println("a / b = " + (a / b));

	    // modulo operator
	    System.out.println("a % b = " + (a % b));
	    
	    
	    System.out.println("----------------------------------------");
	    
	    // Assignment Operators
	    
	    int var;

	    // assign value using =
	    var = a;
	    System.out.println("var using =: " + var);

	    // assign value using =+
	    var += a;
	    System.out.println("var using +=: " + var);

	    // assign value using =*
	    var *= a;
	    System.out.println("var using *=: " + var);
	    
	    
	    System.out.println("----------------------------------------");
	    
	    // Relational Operators
	    
	    // value of a and b
	    System.out.println("a is " + a + " and b is " + b);

	    // == operator
	    System.out.println(a == b);  // false

	    // != operator
	    System.out.println(a != b);  // true

	    // > operator
	    System.out.println(a > b);  // false

	    // < operator
	    System.out.println(a < b);  // true

	    // >= operator
	    System.out.println(a >= b);  // false

	    // <= operator
	    System.out.println(a <= b);  // true
	    
	    
	    System.out.println("----------------------------------------");
	    
	    // Logical Operators
	    
	    // && operator
	    System.out.println((5 > 3) && (8 > 5));  // true
	    System.out.println((5 > 3) && (8 < 5));  // false

	    // || operator
	    System.out.println((5 < 3) || (8 > 5));  // true
	    System.out.println((5 > 3) || (8 < 5));  // true
	    System.out.println((5 < 3) || (8 < 5));  // false

	    // ! operator
	    System.out.println(!(5 == 3));  // true
	    System.out.println(!(5 > 3));  // false
	    
	    
	    System.out.println("----------------------------------------");
	    
	    // Bitwise and Shift Operators
	    
	    int number1 = 12, number2 = 25, result;

	    // bitwise OR between 12 and 25
	    result = number1 | number2;
	    System.out.println("Bitwise OR : " + result);    // prints 29
	    
	    // bitwise AND between 12 and 25
	    result = number1 & number2;
	    System.out.println("Bitwise AND : " + result);    // prints 8
	    
	    // bitwise XOR between 12 and 25
	    result = number1 ^ number2;
	    System.out.println("Bitwise XOR : " + result);    // prints 21
	    
	    int number = 35, result1;

	    // bitwise complement of 35
	    result1 = ~number;
	    System.out.println("Bitwise Complement: " + result1);    // prints -36
	    
	    
	    int number3 = 2;
	    
	    // 2 bit left shift operation 
	    int result2 = number3 << 2;
	    System.out.println("Left Shift : " + result2);    // prints 8
	    
	    
	    int number4 = 8;
	    int number5 = -8;
	    
	    // 2 bit signed right shift
	    System.out.println("Signed Right Shift for +ve no. : " + (number4 >> 2));    // prints 2
	    System.out.println("Signed Right Shift for -ve no. : " + (number5 >> 2));    // prints -2
	    
	    
	    System.out.println("----------------------------------------");
	    
	    // InstanceOf Operator
	    
	    String str = "Java Programming";
	    boolean resultz;

	    // checks if 'str' is an instance of
	    // the String class
	    resultz = str instanceof String;
	    System.out.println("Is str an object of String? " + resultz);
	    
	    
	    System.out.println("----------------------------------------");
	    
	    // Ternary Operator
	    
	    int februaryDays = 29;
	    String answer;

	    // ternary operator
	    answer = (februaryDays == 28) ? "Not a leap year" : "Leap year";
	    System.out.println(answer);

	}
}
