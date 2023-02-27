package com.QuickReview_AllJava;

public class Arrays_2D {

	public static void main(String[] args) {

		// In Java, 2D arrays are arrays of arrays. They can be used to represent tables
		// of values, for example, a matrix of numbers.

		// Here's an example of how to declare and initialize a 2D array in Java:

		int[][] matrix = { 
				{ 1, 2, 3 },   //0 1 2
				{ 4, 5, 6 },   //0 1 2
				{ 7, 8, 9 } }; //0 1 2
		//i = 0, j = 0
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

		// In this example, we declare a 2D integer array named matrix and initialize it
		// with 3 rows and 3 columns. The elements of the array can be accessed using
		// two indices in square brackets, for example matrix[0][0], matrix[0][1], etc.
		// The length property of a 2D array gives the number of rows in the array. The
		// outer for loop iterates over the rows of the array, and the inner for loop
		// iterates over the columns of each row. The result of each iteration,
		// matrix[i][j], is printed on the same line, separated by a space. After each
		// inner loop, a newline character is printed to start a new line for the next
		// iteration of the outer loop.

		// Here's another example of how to use 2D arrays in Java:

		String[][] names = { { "John", "Doe" }, { "Jane", "Doe" }, { "Jim", "Smith" }, { "Joan", "Johnson" } };
		for (int i = 0; i < names.length; i++) {
			for (int j = 0; j < names[i].length; j++) {
				System.out.print(names[i][j] + " ");
			}
			System.out.println();
		}

		// In this example, we declare a 2D string array named names and initialize it
		// with 4 rows and 2 columns. The elements of the array can be accessed using
		// two indices in square brackets, for example names[0][0], names[0][1], etc.
		// The length property of a 2D array gives the number of rows in the array. The
		// outer for loop iterates over the rows of the array, and the inner for loop
		// iterates over the columns of each row. The result of each iteration,
		// names[i][j], is printed on the same line, separated by a space. After each
		// inner loop, a newline character is printed to start a new line for the next
		// iteration of the outer loop.

	}
}