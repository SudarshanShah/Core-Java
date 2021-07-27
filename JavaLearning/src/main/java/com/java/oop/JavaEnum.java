package com.java.oop;

enum Size {
	SMALL, MEDIUM, LARGE, EXTRALARGE;
}

class Pizza {
	 private Size pizzaSize;
	 
	 public Pizza(Size pizzaSize) {
	   this.pizzaSize = pizzaSize;
	 }
	 
	 public void orderPizza() {
		   switch(pizzaSize) {
		     case SMALL:
		       System.out.println("I ordered a small size pizza.");
		       break;
		     case MEDIUM:
		       System.out.println("I ordered a medium size pizza.");
		       break;
		     default:
		       System.out.println("I don't know which one to order.");
		       break;
		   }
	 }
}

public class JavaEnum {

	public static void main(String[] args) {
		
		Pizza p1 = new Pizza(Size.MEDIUM);
		p1.orderPizza();
	}
}
