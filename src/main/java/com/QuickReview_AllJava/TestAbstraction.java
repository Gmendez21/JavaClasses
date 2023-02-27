package com.QuickReview_AllJava;

public class TestAbstraction {

	public static void main(String[] args) {
		TV tv1 = new SmartTv();
		tv1.turnOn();
		tv1.turnOff();

		TV tv2 = new CRTTV();
		tv2.turnOn();
		tv2.turnOff();
	}

}

//In this example, we have an abstract class TV with abstract methods turnOn() and turnOff().
//The SmartTV and CRTTV classes extend the TV class and provide their own implementations of the turnOn() and turnOff() methods.

//We create objects of the SmartTV and CRTTV classes and assign them to references of the TV class. 
//When we call the turnOn() and turnOff() methods on these objects, the implementation that corresponds to the actual object is executed.

//This demonstrates the use of abstraction because the TV class provides a common interface for the SmartTV and CRTTV classes,
//allowing them to be treated as TV objects without having to know the specific details of each class.
