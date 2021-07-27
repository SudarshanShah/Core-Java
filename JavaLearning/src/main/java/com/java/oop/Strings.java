package com.java.oop;

public class Strings {

	public static void main(String[] args) {
		
		String str = "Sudarshan Shah";
		
		System.out.println("Original String: " + str);
		
		
		str = str.substring(3, 9);
		
		System.out.println("Substring of original String: " + str);
		
		
		str = "Sudarshan Shah";
		
		str = str.replace('h', 't');
		
		System.out.println("Replacing 'h' in string with 't': " + str);
		
		System.out.println("Getting bytes out of String: " + str.getBytes());
		
		
		str = "Sudarshan";
		
		String[] strings = str.split("s");
		
		System.out.print("Splitted strings: " + " ");
		for(String str1 : strings) {
			System.out.print(str1 + " ");
		}
		System.out.println();
		
		str = "Sudarshan";
		
		str = String.valueOf(str);
		
		System.out.println(str);
	}
}
