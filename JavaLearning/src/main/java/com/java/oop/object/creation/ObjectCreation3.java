package com.java.oop.object.creation;

public class ObjectCreation3 implements Cloneable{

	String name = "Sudarshan Shah";
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public static void main(String[] args) {
		
		ObjectCreation3 obj = new ObjectCreation3();
		
		// Object creation using 'clone' method of Object class.
		// To create object using 'clone' method, the class should be implementing Cloneable interface.
		
		try {
			ObjectCreation3 obj1 = (ObjectCreation3) obj.clone();
			System.out.println(obj1.name);
			
		} 
		catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
