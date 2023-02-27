package com.QuickReview_AllJava;

public class HandlingExceptions {

	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3, 4, 5 };
		int key = 0;

		try {
			// access an element in the numbers array that is out of bounds
			key = numbers[5];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception caught: ArrayIndexOutOfBoundsException");
		} catch (Exception e) {
			System.out.println("Exception caught: General Exception");
		} finally {
			System.out.println("The finally block is executed.");
		}

		System.out.println("The value of key is: " + key);
	}

}

// This code demonstrates how to handle exceptions using a try block, catch
// blocks, and a finally block. In this example, an
// ArrayIndexOutOfBoundsException is thrown when we try to access an element in
// the numbers array that is out of bounds. The catch block for
// ArrayIndexOutOfBoundsException is executed and the message "Exception caught:
// ArrayIndexOutOfBoundsException" is printed. The finally block is always
// executed, regardless of whether an exception is thrown or not, and the
// message "The finally block is executed." is printed. After the finally block,
// the code continues to execute and the value of key is printed, which is 0.
