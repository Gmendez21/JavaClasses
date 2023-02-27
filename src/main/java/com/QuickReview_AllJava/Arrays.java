package com.QuickReview_AllJava;

public class Arrays {

	public static void main(String[] args) {

		// In Java, arrays are used to store a collection of values of the same data
		// type.

		// Here's an example of how to declare and initialize an array in Java:

		int[] numbers = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}

		// In this example, we declare an integer array named numbers and initialize it
		// with 5 elements. The elements of the array can be accessed using the array
		// name followed by an index in square brackets, for example numbers[0],
		// numbers[1], etc. The length property of an array gives the number of elements
		// in the array. The for loop iterates over the elements of the array and prints
		// each one.

		// Here's another example of how to use arrays in Java:

		String[] names = { "John", "Jane", "Jim", "Joan" };
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);

			// In this example, we declare a string array named names and initialize it with
			// 4 elements. The elements of the array can be accessed using the array name
			// followed by an index in square brackets, for example names[0], names[1], etc.
			// The length property of an array gives the number of elements in the array.
			// The for loop iterates over the elements of the array and prints each one.

		}

	}
}
