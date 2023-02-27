package com.QuickReview_AllJava;

public class StringConcatenationAndArithmeticOperators {

	public static void main(String[] args) {

		// In Java, you can concatenate strings using the + operator. Here's an example:

		String firstName = "John";
		String lastName = "Doe";
		String fullName = firstName + " " + lastName;

		System.out.println("Full Name: " + fullName);

		/*
		 * Regarding Arithmetic Operators, Java supports the following operators for
		 * performing arithmetic operations:
		 * 
		 * + for addition 
		 * - for subtraction
		 * * for multiplication 
		 * / for division 
		 * % for remainder 
		 * Here's an example using arithmetic operators:
		 * 
		 */

		int num1 = 10;
		int num2 = 5;
		int sum = num1 + num2;
		int difference = num1 - num2;
		int product = num1 * num2;
		int quotient = num1 / num2;
		int remainder = num1 % num2;

		System.out.println("Sum: " + sum);
		System.out.println("Difference: " + difference);
		System.out.println("Product: " + product);
		System.out.println("Quotient: " + quotient);
		System.out.println("Remainder: " + remainder);
	}
}
