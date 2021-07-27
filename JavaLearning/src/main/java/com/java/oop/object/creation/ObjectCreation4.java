package com.java.oop.object.creation;

import java.lang.reflect.Constructor;

public class ObjectCreation4 {

	private String name;

	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		
		// Object created using 'newInstance()' method of Constructor class.
		
		try {
			Constructor<ObjectCreation4> constructor = ObjectCreation4.class.getDeclaredConstructor();
			ObjectCreation4 obj = constructor.newInstance();
			obj.setName("Sudarshan Shah");
			
			System.out.println(obj.name);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
