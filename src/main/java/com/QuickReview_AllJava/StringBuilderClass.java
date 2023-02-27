package com.QuickReview_AllJava;

public class StringBuilderClass {

	public static void main(String[] args) {
		// In Java, the StringBuilder class provides a convenient way to build and
		// manipulate strings, as compared to using concatenation with the + operator.
		// Here's an example that demonstrates the use of StringBuilder:

		StringBuilder sb = new StringBuilder();
		sb.append("Hello");
		sb.append(" ");
		sb.append("World");

		System.out.println("StringBuilder: " + sb.toString());

		sb.insert(5, "Cruel ");

		System.out.println("StringBuilder: " + sb.toString());

		sb.delete(5, 11);

		System.out.println("StringBuilder: " + sb.toString());

		sb.reverse();

		System.out.println("StringBuilder: " + sb.toString());

	}
}

//In this example, we use various methods of the StringBuilder class such as
//append, insert, delete, and reverse. The append method is used to add a string 
//to the end of the StringBuilder object. The insert method is used to insert
//a string at a specific index within the StringBuilder object. 
//The delete method is used to delete a substring from the StringBuilder object.
//The reverse method is used to reverse the order of characters in the StringBuilder object. 
//To retrieve the string representation of the StringBuilder object, you can use the toString method.
