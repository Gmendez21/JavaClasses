package com.QuickReview_AllJava;

public class NestedLoops {

	public static void main(String[] args) {

		// In Java, you can use nested loops to create more complex and interesting loop
		// structures. Nested loops are loops within loops.

		// Here's an example of a nested loop in Java that prints out a multiplication
		// table:

		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.print(i * j + " ");
			}
			System.out.println();

			// In this example, the outer loop iterates 10 times, from 1 to 10, and the
			// inner loop iterates 10 times for each iteration of the outer loop, also from
			// 1 to 10. The result of each iteration of the inner loop, i * j, is printed on
			// the same line, separated by a space. After each inner loop, a newline
			// character is printed to start a new line for the next iteration of the outer
			// loop.
		}

	}

}
