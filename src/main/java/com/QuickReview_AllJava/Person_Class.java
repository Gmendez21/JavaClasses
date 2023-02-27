package com.QuickReview_AllJava;

//In Java, a class is a blueprint for creating objects (instances), providing
// initial values for state (member variables or fields), and implementations of
// behavior (member methods or functions).

//Here's an example of how to define a class in Java:

public class Person_Class {

	String name;
	int age;

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void sayHello() {
		System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
	}

	// In this example, we define a class named Person with two member variables
	// name and age, and four member methods setName, setAge, getName, and getAge.
	// The setName and setAge methods are used to set the values of the name and age
	// variables, and the getName and getAge methods are used to get the values of
	// the name and age variables. The sayHello method is used to print a greeting
	// message to the console, using the values of the name and age variables.
}
