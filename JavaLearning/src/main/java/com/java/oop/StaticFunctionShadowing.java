package com.java.oop;

class A {
	
	public static void display() {
		System.out.println("In Class A");
	}
}

class B extends A {
	public static void display() {
		System.out.println("In Class B");
	}
}

public class StaticFunctionShadowing {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		A a = new B();
		a.display();
	}
}
