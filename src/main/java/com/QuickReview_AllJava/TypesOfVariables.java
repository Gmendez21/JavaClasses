package com.QuickReview_AllJava;

public class TypesOfVariables {

	public static void main(String[] args) {
		
		// Here are examples of different types of variables in Java:
		
		// Primitive Variables
		int primitiveInt = 10;
		long primitiveLong = 100L;
		float primitiveFloat = 3.14f;
		double primitiveDouble = 3.14;
		char primitiveChar = 'A';
		boolean primitiveBoolean = true;

		// Reference Variables
		String referenceString = "Hello World";
		Integer referenceInteger = new Integer(10);
		Double referenceDouble = new Double(3.14);

		System.out.println("Primitive int: " + primitiveInt);
		System.out.println("Primitive long: " + primitiveLong);
		System.out.println("Primitive float: " + primitiveFloat);
		System.out.println("Primitive double: " + primitiveDouble);
		System.out.println("Primitive char: " + primitiveChar);
		System.out.println("Primitive boolean: " + primitiveBoolean);
		System.out.println("Reference string: " + referenceString);
		System.out.println("Reference integer: " + referenceInteger);
		System.out.println("Reference double: " + referenceDouble);

	}
}

    //In Java, there are two types of variables: primitive variables and reference variables. 
    //Primitive variables hold the actual values, while reference variables hold references to objects.
    //In the above example, primitiveInt, primitiveLong, primitiveFloat, primitiveDouble, primitiveChar, and primitiveBoolean are primitive variables.
    //referenceString, referenceInteger, and referenceDouble are reference variables.
