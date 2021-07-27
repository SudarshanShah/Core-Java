package com.java.oop.object.creation;

public class ObjectCreation2 {

	String name = "Sudarshan Shah";
	
	public static void main(String[] args) {
		
		// Object creation using 'newInstance()' method.
		try {
			Class<?> cls = Class.forName("com.java.oop.object.creation.ObjectCreation2");
			
			@SuppressWarnings("deprecation")
			// deprecated since JDK 9
			ObjectCreation2 obj = (ObjectCreation2) cls.newInstance();
			
			System.out.println(obj.name);
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch (InstantiationException e) {
			e.printStackTrace();
		}
		catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}
