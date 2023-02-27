package com.QuickReview_AllJava;

public class Methods {

	// In Java, methods are used to encapsulate a block of code that performs a
	// specific task. A method can take parameters as input and return a value as
	// output.

	// Here's an example of how to define and use methods in Java:

	public static int sum(int a, int b) {
		return a + b;
	}

	public static int max(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}

	public static void main(String[] args) {
		int x = 5;
		int y = 10;

		int z = sum(x, y);
		System.out.println("The sum of " + x + " and " + y + " is " + z);

		int maxValue = max(x, y);
		System.out.println("The maximum value of " + x + " and " + y + " is " + maxValue);

	}
}
	// In this example, we define two methods sum and max that perform different
	// tasks. The sum method takes two integer parameters a and b and returns their
	// sum. The max method takes two integer parameters a and b and returns the
	// maximum value.

	// In the main method, we call these methods by passing the values of x and y as
	// parameters and storing the returned values in the variables z and maxValue.
	// Finally, we print the results to the console.

	// Note that in Java, a method can be declared as static if it is a class method
	// that doesn't need to be called on an instance of the class. A static method
	// can be called directly on the class name, without creating an instance of the
	// class.

