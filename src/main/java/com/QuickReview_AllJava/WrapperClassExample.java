package com.QuickReview_AllJava;

public class WrapperClassExample {

	public static void main(String[] args) {
		// Integer wrapper class
		Integer integerValue = new Integer(10);
		System.out.println("Integer value: " + integerValue);

		// Character wrapper class
		Character characterValue = new Character('A');
		System.out.println("Character value: " + characterValue);

		// Double wrapper class
		Double doubleValue = new Double(3.14);
		System.out.println("Double value: " + doubleValue);

		// Boolean wrapper class
		Boolean booleanValue = new Boolean(true);
		System.out.println("Boolean value: " + booleanValue);
	}

}

//This code demonstrates the use of the Integer, Character, Double, and Boolean wrapper classes in Java. 
//For each primitive data type, there is a corresponding wrapper class.

//We create instances of each wrapper class and set a value for each.
//Then, we print out the values using the println method.
