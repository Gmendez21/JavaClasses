package com.QuickReview_AllJava;

public class Overriding {

	public static void main(String[] args) {

		Vehicle v = new Vehicle();
		v.startEngine();

		Vehicle c = new Car();
		c.startEngine();

		Car car = new Car();
		car.startEngine();
		car.honkHorn();

	}

}

//In this example, the Car class extends the Vehicle class and overrides its startEngine() method.
//The startEngine() method of the Car class has the same signature as the startEngine() method
//of the Vehicle class, but it provides a different implementation. This is called method overriding.

//When an object of the Car class is created and the startEngine() method is called on it,
//the overridden version of the startEngine() method in the Car class is executed, not the version 
//in the Vehicle class. This demonstrates how method overriding allows a subclass to provide 
//its own implementation for a method that is inherited from its superclass. The honkHorn() method
//is added in the Car class and is not related to method overriding.