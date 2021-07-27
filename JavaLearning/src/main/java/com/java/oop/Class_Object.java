package com.java.oop;

class Bicycle {

	  // state or field
	  private int gear = 4;

	  // behavior or method
	  public void braking() {
	    System.out.println("Working of Braking and Gear is : " + gear);
	  }
}

class Lamp {
	  
	  // stores the value for light
	  // true if light is on
	  // false if light is off
	  boolean isOn;

	  // method to turn on the light
	  void turnOn() {
	    isOn = true;
	    System.out.println("Light on? " + isOn);

	  }

	  // method to turnoff the light
	  void turnOff() {
	    isOn = false;
	    System.out.println("Light on? " + isOn);
	  }
}

public class Class_Object {

	public static void main(String[] args) {
		
		// for Bicycle class
		Bicycle sportsBicycle = new Bicycle();
		
		sportsBicycle.braking();
		
		
		// create objects led and halogen
	    Lamp led = new Lamp();
	    Lamp halogen = new Lamp();

	    // turn on the light by
	    // calling method turnOn()
	    led.turnOn();

	    // turn off the light by
	    // calling method turnOff()
	    halogen.turnOff();
	}
}
