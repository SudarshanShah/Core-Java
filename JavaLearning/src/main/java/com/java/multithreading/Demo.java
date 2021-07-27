package com.java.multithreading;

public class Demo {

	public static synchronized void main(String[] args) throws InterruptedException
	{
		Thread f = new Thread();
		f.start();
		System.out.println("A");
		f.wait(1000);
		System.out.println("B");
	}
}
