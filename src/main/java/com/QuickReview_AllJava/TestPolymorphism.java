package com.QuickReview_AllJava;

public class TestPolymorphism {
	
	public static void main(String args[]) {
	    Bank b1 = new Bank();
	    System.out.println("Interest rate at Bank: " + b1.interest() + "%");

	    Bank b2 = new SBI();
	    System.out.println("Interest rate at SBI: " + b2.interest() + "%");

	    Bank b3 = new HDFC();
	    System.out.println("Interest rate at HDFC: " + b3.interest() + "%");
	  }

}

//In this example, we have a Bank class and two subclasses: SBI and HDFC. The Bank class provides
//a default implementation of the interest() method, which returns 0%. The SBI and HDFC classes inherit 
//the interest() method from the Bank class and provide their own implementations that return 8% and 9% respectively.

//We create objects of Bank, SBI, and HDFC classes and assign them to references of the Bank class. 
//When we call the interest() method on these objects, the implementation that corresponds to the 
//actual object is executed, not the implementation in the Bank class. This is polymorphism because the same method
//call can result in different behavior based on the actual object being referred to.