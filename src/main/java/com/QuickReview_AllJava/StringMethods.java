package com.QuickReview_AllJava;

public class StringMethods {

	public static void main(String[] args) {
		// In Java, the String class has a number of useful methods that allow you to
		// manipulate and work with strings.
		// Here are some examples of commonly used string methods:

		String name = "John Doe";

		int length = name.length();
		System.out.println("The length of the string '" + name + "' is " + length);

		char firstChar = name.charAt(0);
		System.out.println("The first character of the string '" + name + "' is " + firstChar);

		String sub = name.substring(5);
		System.out.println("The substring of the string '" + name + "' starting from index 5 is '" + sub + "'");

		String upper = name.toUpperCase();
		System.out.println("The uppercase version of the string '" + name + "' is '" + upper + "'");

		boolean contains = name.contains("John");
		System.out.println("The string '" + name + "' contains the substring 'John': " + contains);

		int index = name.indexOf("Doe");
		System.out.println("The index of the substring 'Doe' in the string '" + name + "' is " + index);

		String replace = name.replace("John", "Jane");
		System.out.println("The string '" + name + "' with 'John' replaced by 'Jane' is '" + replace + "'");
	}
}

//In this example, we use various string methods such as length, charAt, substring,
//toUpperCase, contains, indexOf, and replace. These methods perform operations
//such as finding the length of the string, extracting a character or a substring,
//converting the string to uppercase, checking if the string contains a certain substring,
//finding the index of a substring, and replacing a substring with another string.
