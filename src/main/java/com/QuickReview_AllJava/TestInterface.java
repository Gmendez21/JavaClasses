package com.QuickReview_AllJava;

public class TestInterface {

	public static void main(String[] args) {
		SportsBrand adidas = new SportsBrand("Adidas", 10000000);
	    System.out.println("Brand: " + adidas.getName() + " - Sponsorship: $" + adidas.getSponsorship());
	    adidas.increaseSponsorship(5000000);
	    System.out.println("Brand: " + adidas.getName() + " - Sponsorship: $" + adidas.getSponsorship());

	    SportsBrand nike = new SportsBrand("Nike", 20000000);
	    System.out.println("Brand: " + nike.getName() + " - Sponsorship: $" + nike.getSponsorship());
	    nike.increaseSponsorship(10000000);
	    System.out.println("Brand: " + nike.getName() + " - Sponsorship: $" + nike.getSponsorship());

	}
}

//In this example, we have an interface Sponsorable with two methods increaseSponsorship() and getSponsorship().
//The SportsBrand class implements the Sponsorable interface and provides its own implementation for both methods.
//The SportsBrand class also has instance variables name and sponsorship with getter and setter methods.

//We create objects of the SportsBrand class and assign them to references of the SportsBrand type. We then call
//the increaseSponsorship() and getSponsorship() methods on these objects.

//This example demonstrates interface implementation. The implementation of the Sponsorable interface methods 
//in the SportsBrand class demonstrates the implementation of an interface.