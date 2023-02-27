package com.QuickReview_AllJava;

public class TestFinalKeyword {

	public static void main(String[] args) {
		
		Student s1 = new Student("John Doe");
	    System.out.println("Student's name: " + s1.name);

	    // s1.name = "Jane Doe";  // Uncommenting this line will result in a compile-time error

	}

}

//In this example, we have a Student class with a final field name. The final keyword means that the value
//of the name field cannot be changed once it's assigned in the constructor.

//We create an object of the Student class and assign it to a reference s1. When we try to change the value
//of the name field, it will result in a compile-time error because the name field is final.
//This demonstrates the use of the final keyword to prevent fields from being modified once they are assigned.